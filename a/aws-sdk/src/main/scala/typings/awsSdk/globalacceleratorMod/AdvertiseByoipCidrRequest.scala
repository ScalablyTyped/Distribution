package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiseByoipCidrRequest extends StObject {
  
  /**
    * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only a portion of the provisioned range.
    */
  var Cidr: GenericString
}
object AdvertiseByoipCidrRequest {
  
  inline def apply(Cidr: GenericString): AdvertiseByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiseByoipCidrRequest]
  }
  
  extension [Self <: AdvertiseByoipCidrRequest](x: Self) {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
  }
}
