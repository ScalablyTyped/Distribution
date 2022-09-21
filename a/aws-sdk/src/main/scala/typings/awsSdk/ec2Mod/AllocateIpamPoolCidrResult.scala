package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateIpamPoolCidrResult extends StObject {
  
  /**
    * Information about the allocation created.
    */
  var IpamPoolAllocation: js.UndefOr[typings.awsSdk.ec2Mod.IpamPoolAllocation] = js.undefined
}
object AllocateIpamPoolCidrResult {
  
  inline def apply(): AllocateIpamPoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIpamPoolCidrResult]
  }
  
  extension [Self <: AllocateIpamPoolCidrResult](x: Self) {
    
    inline def setIpamPoolAllocation(value: IpamPoolAllocation): Self = StObject.set(x, "IpamPoolAllocation", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolAllocationUndefined: Self = StObject.set(x, "IpamPoolAllocation", js.undefined)
  }
}
