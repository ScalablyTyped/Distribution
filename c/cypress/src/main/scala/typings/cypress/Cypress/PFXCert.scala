package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PFXCert extends StObject {
  
  /**
    * Path to a text file containing the passphrase, relative to project root.
    */
  var passphrase: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the certificate container, relative to project root.
    */
  var pfx: String
}
object PFXCert {
  
  inline def apply(pfx: String): PFXCert = {
    val __obj = js.Dynamic.literal(pfx = pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFXCert]
  }
  
  extension [Self <: PFXCert](x: Self) {
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
  }
}
