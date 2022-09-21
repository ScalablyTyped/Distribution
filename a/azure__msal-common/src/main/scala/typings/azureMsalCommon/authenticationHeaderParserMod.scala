package typings.azureMsalCommon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationHeaderParserMod {
  
  @JSImport("@azure/msal-common/dist/request/AuthenticationHeaderParser", "AuthenticationHeaderParser")
  @js.native
  open class AuthenticationHeaderParser protected () extends StObject {
    def this(headers: Record[String, String]) = this()
    
    /**
      * This method parses the SHR nonce value out of either the Authentication-Info or WWW-Authenticate authentication headers.
      * @returns
      */
    def getShrNonce(): String = js.native
    
    /* private */ var headers: Any = js.native
    
    /**
      * Parses an HTTP header's challenge set into a key/value map.
      * @param header
      * @returns
      */
    /* private */ var parseChallenges: Any = js.native
  }
}
