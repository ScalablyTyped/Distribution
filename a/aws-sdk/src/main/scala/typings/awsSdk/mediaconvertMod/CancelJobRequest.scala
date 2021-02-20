package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobRequest extends StObject {
  
  /**
    * The Job ID of the job to be cancelled.
    */
  var Id: string = js.native
}
object CancelJobRequest {
  
  @scala.inline
  def apply(Id: string): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit class CancelJobRequestMutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
