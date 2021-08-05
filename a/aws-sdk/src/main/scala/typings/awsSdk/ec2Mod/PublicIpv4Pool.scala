package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicIpv4Pool extends StObject {
  
  /**
    * A description of the address pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the location from which the address pool is advertised. A network border group is a unique set of Availability Zones or Local Zones from where AWS advertises public IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The address ranges.
    */
  var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.undefined
  
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The total number of addresses.
    */
  var TotalAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of available addresses.
    */
  var TotalAvailableAddressCount: js.UndefOr[Integer] = js.undefined
}
object PublicIpv4Pool {
  
  inline def apply(): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4Pool]
  }
  
  extension [Self <: PublicIpv4Pool](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    inline def setPoolAddressRanges(value: PublicIpv4PoolRangeSet): Self = StObject.set(x, "PoolAddressRanges", value.asInstanceOf[js.Any])
    
    inline def setPoolAddressRangesUndefined: Self = StObject.set(x, "PoolAddressRanges", js.undefined)
    
    inline def setPoolAddressRangesVarargs(value: PublicIpv4PoolRange*): Self = StObject.set(x, "PoolAddressRanges", js.Array(value :_*))
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTotalAddressCount(value: Integer): Self = StObject.set(x, "TotalAddressCount", value.asInstanceOf[js.Any])
    
    inline def setTotalAddressCountUndefined: Self = StObject.set(x, "TotalAddressCount", js.undefined)
    
    inline def setTotalAvailableAddressCount(value: Integer): Self = StObject.set(x, "TotalAvailableAddressCount", value.asInstanceOf[js.Any])
    
    inline def setTotalAvailableAddressCountUndefined: Self = StObject.set(x, "TotalAvailableAddressCount", js.undefined)
  }
}
