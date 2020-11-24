package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningHook extends js.Object {
  
  /**
    * The payload that was sent to the target function.  Note: Only Lambda functions are currently supported.
    */
  var payloadVersion: js.UndefOr[PayloadVersion] = js.native
  
  /**
    * The ARN of the target function.  Note: Only Lambda functions are currently supported.
    */
  var targetArn: TargetArn = js.native
}
object ProvisioningHook {
  
  @scala.inline
  def apply(targetArn: TargetArn): ProvisioningHook = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningHook]
  }
  
  @scala.inline
  implicit class ProvisioningHookOps[Self <: ProvisioningHook] (val x: Self) extends AnyVal {
    
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
    def setTargetArn(value: TargetArn): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVersion(value: PayloadVersion): Self = this.set("payloadVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadVersion: Self = this.set("payloadVersion", js.undefined)
  }
}
