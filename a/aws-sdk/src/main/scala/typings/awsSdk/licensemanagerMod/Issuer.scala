package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuer extends StObject {
  
  /**
    * Issuer name.
    */
  var Name: String
  
  /**
    * Asymmetric KMS key from Key Management Service. The KMS key must have a key usage of sign and verify, and support the RSASSA-PSS SHA-256 signing algorithm.
    */
  var SignKey: js.UndefOr[String] = js.undefined
}
object Issuer {
  
  inline def apply(Name: String): Issuer = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuer]
  }
  
  extension [Self <: Issuer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSignKey(value: String): Self = StObject.set(x, "SignKey", value.asInstanceOf[js.Any])
    
    inline def setSignKeyUndefined: Self = StObject.set(x, "SignKey", js.undefined)
  }
}
