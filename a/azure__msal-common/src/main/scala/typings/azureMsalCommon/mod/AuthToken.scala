package typings.azureMsalCommon.mod

import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.tokenClaimsMod.TokenClaims
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthToken")
@js.native
open class AuthToken protected ()
  extends typings.azureMsalCommon.authTokenMod.AuthToken {
  def this(rawToken: String, crypto: ICrypto) = this()
}
/* static members */
object AuthToken {
  
  @JSImport("@azure/msal-common", "AuthToken")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extract token by decoding the rawToken
    *
    * @param encodedToken
    */
  inline def extractTokenClaims(encodedToken: String, crypto: ICrypto): TokenClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTokenClaims")(encodedToken.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[TokenClaims]
}
