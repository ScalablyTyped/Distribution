package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResourceCidrResult extends StObject {
  
  var IpamResourceCidr: js.UndefOr[typings.awsSdk.ec2Mod.IpamResourceCidr] = js.undefined
}
object ModifyIpamResourceCidrResult {
  
  inline def apply(): ModifyIpamResourceCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamResourceCidrResult]
  }
  
  extension [Self <: ModifyIpamResourceCidrResult](x: Self) {
    
    inline def setIpamResourceCidr(value: IpamResourceCidr): Self = StObject.set(x, "IpamResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceCidrUndefined: Self = StObject.set(x, "IpamResourceCidr", js.undefined)
  }
}
