package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DkimSigningAttributes extends StObject {
  
  /**
    * A private key that's used to generate a DKIM signature. The private key must use 1024-bit RSA encryption, and must be encoded using base64 encoding.
    */
  var DomainSigningPrivateKey: PrivateKey
  
  /**
    * A string that's used to identify a public key in the DNS configuration for a domain.
    */
  var DomainSigningSelector: Selector
}
object DkimSigningAttributes {
  
  inline def apply(DomainSigningPrivateKey: PrivateKey, DomainSigningSelector: Selector): DkimSigningAttributes = {
    val __obj = js.Dynamic.literal(DomainSigningPrivateKey = DomainSigningPrivateKey.asInstanceOf[js.Any], DomainSigningSelector = DomainSigningSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DkimSigningAttributes]
  }
  
  extension [Self <: DkimSigningAttributes](x: Self) {
    
    inline def setDomainSigningPrivateKey(value: PrivateKey): Self = StObject.set(x, "DomainSigningPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setDomainSigningSelector(value: Selector): Self = StObject.set(x, "DomainSigningSelector", value.asInstanceOf[js.Any])
  }
}
