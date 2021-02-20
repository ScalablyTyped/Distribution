package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteJobRequest extends StObject {
  
  /**
    * The name of the job to be deleted.
    */
  var Name: JobName = js.native
}
object DeleteJobRequest {
  
  @scala.inline
  def apply(Name: JobName): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobRequest]
  }
  
  @scala.inline
  implicit class DeleteJobRequestMutableBuilder[Self <: DeleteJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
