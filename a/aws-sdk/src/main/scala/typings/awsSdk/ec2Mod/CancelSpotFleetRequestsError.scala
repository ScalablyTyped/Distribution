package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSpotFleetRequestsError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[CancelBatchErrorCode] = js.native
  
  /**
    * The description for the error code.
    */
  var Message: js.UndefOr[String] = js.native
}
object CancelSpotFleetRequestsError {
  
  @scala.inline
  def apply(): CancelSpotFleetRequestsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsError]
  }
  
  @scala.inline
  implicit class CancelSpotFleetRequestsErrorMutableBuilder[Self <: CancelSpotFleetRequestsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CancelBatchErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
