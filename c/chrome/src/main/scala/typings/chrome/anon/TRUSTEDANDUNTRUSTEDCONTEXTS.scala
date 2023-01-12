package typings.chrome.anon

import typings.chrome.chromeStrings.TRUSTED_AND_UNTRUSTED_CONTEXTS
import typings.chrome.chromeStrings.TRUSTED_CONTEXTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TRUSTEDANDUNTRUSTEDCONTEXTS extends StObject {
  
  var TRUSTED_AND_UNTRUSTED_CONTEXTS: typings.chrome.chromeStrings.TRUSTED_AND_UNTRUSTED_CONTEXTS
  
  var TRUSTED_CONTEXTS: typings.chrome.chromeStrings.TRUSTED_CONTEXTS
}
object TRUSTEDANDUNTRUSTEDCONTEXTS {
  
  inline def apply(): TRUSTEDANDUNTRUSTEDCONTEXTS = {
    val __obj = js.Dynamic.literal(TRUSTED_AND_UNTRUSTED_CONTEXTS = "TRUSTED_AND_UNTRUSTED_CONTEXTS", TRUSTED_CONTEXTS = "TRUSTED_CONTEXTS")
    __obj.asInstanceOf[TRUSTEDANDUNTRUSTEDCONTEXTS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TRUSTEDANDUNTRUSTEDCONTEXTS] (val x: Self) extends AnyVal {
    
    inline def setTRUSTED_AND_UNTRUSTED_CONTEXTS(value: TRUSTED_AND_UNTRUSTED_CONTEXTS): Self = StObject.set(x, "TRUSTED_AND_UNTRUSTED_CONTEXTS", value.asInstanceOf[js.Any])
    
    inline def setTRUSTED_CONTEXTS(value: TRUSTED_CONTEXTS): Self = StObject.set(x, "TRUSTED_CONTEXTS", value.asInstanceOf[js.Any])
  }
}
