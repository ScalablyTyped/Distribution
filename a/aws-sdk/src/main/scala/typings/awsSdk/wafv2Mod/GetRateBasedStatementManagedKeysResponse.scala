package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedStatementManagedKeysResponse extends StObject {
  
  /**
    * The keys that are of Internet Protocol version 4 (IPv4). 
    */
  var ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.undefined
  
  /**
    * The keys that are of Internet Protocol version 6 (IPv6). 
    */
  var ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.undefined
}
object GetRateBasedStatementManagedKeysResponse {
  
  inline def apply(): GetRateBasedStatementManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysResponse]
  }
  
  extension [Self <: GetRateBasedStatementManagedKeysResponse](x: Self) {
    
    inline def setManagedKeysIPV4(value: RateBasedStatementManagedKeysIPSet): Self = StObject.set(x, "ManagedKeysIPV4", value.asInstanceOf[js.Any])
    
    inline def setManagedKeysIPV4Undefined: Self = StObject.set(x, "ManagedKeysIPV4", js.undefined)
    
    inline def setManagedKeysIPV6(value: RateBasedStatementManagedKeysIPSet): Self = StObject.set(x, "ManagedKeysIPV6", value.asInstanceOf[js.Any])
    
    inline def setManagedKeysIPV6Undefined: Self = StObject.set(x, "ManagedKeysIPV6", js.undefined)
  }
}
