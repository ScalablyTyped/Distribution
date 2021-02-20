package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfileJobResponse extends StObject {
  
  /**
    * The name of the job that was created.
    */
  var Name: JobName = js.native
}
object CreateProfileJobResponse {
  
  @scala.inline
  def apply(Name: JobName): CreateProfileJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileJobResponse]
  }
  
  @scala.inline
  implicit class CreateProfileJobResponseMutableBuilder[Self <: CreateProfileJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
