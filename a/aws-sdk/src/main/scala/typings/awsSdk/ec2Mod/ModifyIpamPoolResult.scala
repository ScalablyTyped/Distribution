package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamPoolResult extends StObject {
  
  /**
    * The results of the modification.
    */
  var IpamPool: js.UndefOr[typings.awsSdk.ec2Mod.IpamPool] = js.undefined
}
object ModifyIpamPoolResult {
  
  inline def apply(): ModifyIpamPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamPoolResult]
  }
  
  extension [Self <: ModifyIpamPoolResult](x: Self) {
    
    inline def setIpamPool(value: IpamPool): Self = StObject.set(x, "IpamPool", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolUndefined: Self = StObject.set(x, "IpamPool", js.undefined)
  }
}
