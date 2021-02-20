package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningHook extends StObject {
  
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
  implicit class ProvisioningHookMutableBuilder[Self <: ProvisioningHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloadVersion(value: PayloadVersion): Self = StObject.set(x, "payloadVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadVersionUndefined: Self = StObject.set(x, "payloadVersion", js.undefined)
    
    @scala.inline
    def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
