package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcOptions extends StObject {
  
  /**
    * Indicates whether IPv6 is supported.
    */
  var Ipv6Support: js.UndefOr[Boolean] = js.undefined
}
object VpcOptions {
  
  inline def apply(): VpcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcOptions]
  }
  
  extension [Self <: VpcOptions](x: Self) {
    
    inline def setIpv6Support(value: Boolean): Self = StObject.set(x, "Ipv6Support", value.asInstanceOf[js.Any])
    
    inline def setIpv6SupportUndefined: Self = StObject.set(x, "Ipv6Support", js.undefined)
  }
}
