package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIpAddressTypeOutput extends StObject {
  
  /**
    * The IP address type.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddressType] = js.undefined
}
object SetIpAddressTypeOutput {
  
  @scala.inline
  def apply(): SetIpAddressTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIpAddressTypeOutput]
  }
  
  @scala.inline
  implicit class SetIpAddressTypeOutputMutableBuilder[Self <: SetIpAddressTypeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
  }
}
