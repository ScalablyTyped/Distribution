package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelConversionRequest extends js.Object {
  
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
  implicit class CancelConversionRequestOps[Self <: CancelConversionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConversionTaskId(value: ConversionTaskId): Self = this.set("ConversionTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setReasonMessage(value: String): Self = this.set("ReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonMessage: Self = this.set("ReasonMessage", js.undefined)
  }
}
