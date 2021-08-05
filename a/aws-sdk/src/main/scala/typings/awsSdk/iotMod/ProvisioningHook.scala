package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningHook extends StObject {
  
  /**
    * The payload that was sent to the target function.  Note: Only Lambda functions are currently supported.
    */
  var payloadVersion: js.UndefOr[PayloadVersion] = js.undefined
  
  /**
    * The ARN of the target function.  Note: Only Lambda functions are currently supported.
    */
  var targetArn: TargetArn
}
object ProvisioningHook {
  
  inline def apply(targetArn: TargetArn): ProvisioningHook = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningHook]
  }
  
  extension [Self <: ProvisioningHook](x: Self) {
    
    inline def setPayloadVersion(value: PayloadVersion): Self = StObject.set(x, "payloadVersion", value.asInstanceOf[js.Any])
    
    inline def setPayloadVersionUndefined: Self = StObject.set(x, "payloadVersion", js.undefined)
    
    inline def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
