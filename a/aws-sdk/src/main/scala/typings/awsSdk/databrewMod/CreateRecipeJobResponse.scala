package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipeJobResponse extends StObject {
  
  /**
    * The name of the job that you created.
    */
  var Name: JobName = js.native
}
object CreateRecipeJobResponse {
  
  @scala.inline
  def apply(Name: JobName): CreateRecipeJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeJobResponse]
  }
  
  @scala.inline
  implicit class CreateRecipeJobResponseMutableBuilder[Self <: CreateRecipeJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
