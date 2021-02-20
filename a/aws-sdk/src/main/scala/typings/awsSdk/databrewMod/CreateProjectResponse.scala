package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectResponse extends StObject {
  
  /**
    * The name of the project that you created.
    */
  var Name: ProjectName = js.native
}
object CreateProjectResponse {
  
  @scala.inline
  def apply(Name: ProjectName): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  @scala.inline
  implicit class CreateProjectResponseMutableBuilder[Self <: CreateProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
