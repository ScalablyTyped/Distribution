package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDnsNamespaceProperties extends StObject {
  
  /**
    * DNS properties for the public DNS namespace.
    */
  var DnsProperties: PublicDnsPropertiesMutable
}
object PublicDnsNamespaceProperties {
  
  inline def apply(DnsProperties: PublicDnsPropertiesMutable): PublicDnsNamespaceProperties = {
    val __obj = js.Dynamic.literal(DnsProperties = DnsProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsNamespaceProperties]
  }
  
  extension [Self <: PublicDnsNamespaceProperties](x: Self) {
    
    inline def setDnsProperties(value: PublicDnsPropertiesMutable): Self = StObject.set(x, "DnsProperties", value.asInstanceOf[js.Any])
  }
}
