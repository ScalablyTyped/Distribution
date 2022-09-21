package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamPoolResult extends StObject {
  
  /**
    * Information about the IPAM pool created.
    */
  var IpamPool: js.UndefOr[typings.awsSdk.ec2Mod.IpamPool] = js.undefined
}
object CreateIpamPoolResult {
  
  inline def apply(): CreateIpamPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpamPoolResult]
  }
  
  extension [Self <: CreateIpamPoolResult](x: Self) {
    
    inline def setIpamPool(value: IpamPool): Self = StObject.set(x, "IpamPool", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolUndefined: Self = StObject.set(x, "IpamPool", js.undefined)
  }
}
