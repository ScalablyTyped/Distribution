package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelConversionRequest extends StObject {
  
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: typings.awsSdk.ec2Mod.ConversionTaskId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The reason for canceling the conversion task.
    */
  var ReasonMessage: js.UndefOr[String] = js.native
}
object CancelConversionRequest {
  
  @scala.inline
  def apply(ConversionTaskId: ConversionTaskId): CancelConversionRequest = {
    val __obj = js.Dynamic.literal(ConversionTaskId = ConversionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelConversionRequest]
  }
  
  @scala.inline
  implicit class CancelConversionRequestMutableBuilder[Self <: CancelConversionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionTaskId(value: ConversionTaskId): Self = StObject.set(x, "ConversionTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setReasonMessage(value: String): Self = StObject.set(x, "ReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonMessageUndefined: Self = StObject.set(x, "ReasonMessage", js.undefined)
  }
}
