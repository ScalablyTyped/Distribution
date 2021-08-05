package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawByoipCidrRequest extends StObject {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: GenericString
}
object WithdrawByoipCidrRequest {
  
  inline def apply(Cidr: GenericString): WithdrawByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrRequest]
  }
  
  extension [Self <: WithdrawByoipCidrRequest](x: Self) {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
  }
}
