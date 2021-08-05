package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionByoipCidrRequest extends StObject {
  
  /**
    * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: GenericString
  
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. 
    */
  var CidrAuthorizationContext: typings.awsSdk.globalacceleratorMod.CidrAuthorizationContext
}
object ProvisionByoipCidrRequest {
  
  inline def apply(Cidr: GenericString, CidrAuthorizationContext: CidrAuthorizationContext): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], CidrAuthorizationContext = CidrAuthorizationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
  
  extension [Self <: ProvisionByoipCidrRequest](x: Self) {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrAuthorizationContext(value: CidrAuthorizationContext): Self = StObject.set(x, "CidrAuthorizationContext", value.asInstanceOf[js.Any])
  }
}
