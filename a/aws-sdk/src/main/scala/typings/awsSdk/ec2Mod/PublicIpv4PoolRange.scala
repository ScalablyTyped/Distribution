package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicIpv4PoolRange extends StObject {
  
  /**
    * The number of addresses in the range.
    */
  var AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of available addresses in the range.
    */
  var AvailableAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The first IP address in the range.
    */
  var FirstAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The last IP address in the range.
    */
  var LastAddress: js.UndefOr[String] = js.undefined
}
object PublicIpv4PoolRange {
  
  inline def apply(): PublicIpv4PoolRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4PoolRange]
  }
  
  extension [Self <: PublicIpv4PoolRange](x: Self) {
    
    inline def setAddressCount(value: Integer): Self = StObject.set(x, "AddressCount", value.asInstanceOf[js.Any])
    
    inline def setAddressCountUndefined: Self = StObject.set(x, "AddressCount", js.undefined)
    
    inline def setAvailableAddressCount(value: Integer): Self = StObject.set(x, "AvailableAddressCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableAddressCountUndefined: Self = StObject.set(x, "AvailableAddressCount", js.undefined)
    
    inline def setFirstAddress(value: String): Self = StObject.set(x, "FirstAddress", value.asInstanceOf[js.Any])
    
    inline def setFirstAddressUndefined: Self = StObject.set(x, "FirstAddress", js.undefined)
    
    inline def setLastAddress(value: String): Self = StObject.set(x, "LastAddress", value.asInstanceOf[js.Any])
    
    inline def setLastAddressUndefined: Self = StObject.set(x, "LastAddress", js.undefined)
  }
}
