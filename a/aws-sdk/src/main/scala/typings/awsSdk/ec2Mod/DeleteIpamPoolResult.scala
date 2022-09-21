package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamPoolResult extends StObject {
  
  /**
    * Information about the results of the deletion.
    */
  var IpamPool: js.UndefOr[typings.awsSdk.ec2Mod.IpamPool] = js.undefined
}
object DeleteIpamPoolResult {
  
  inline def apply(): DeleteIpamPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIpamPoolResult]
  }
  
  extension [Self <: DeleteIpamPoolResult](x: Self) {
    
    inline def setIpamPool(value: IpamPool): Self = StObject.set(x, "IpamPool", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolUndefined: Self = StObject.set(x, "IpamPool", js.undefined)
  }
}
