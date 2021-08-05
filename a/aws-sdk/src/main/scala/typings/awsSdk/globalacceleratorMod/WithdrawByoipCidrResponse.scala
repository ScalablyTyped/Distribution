package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawByoipCidrResponse extends StObject {
  
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.undefined
}
object WithdrawByoipCidrResponse {
  
  inline def apply(): WithdrawByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithdrawByoipCidrResponse]
  }
  
  extension [Self <: WithdrawByoipCidrResponse](x: Self) {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
