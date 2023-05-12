package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAccountTokenClaimsMod.TokenClaims
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthToken")
@js.native
open class AuthToken protected ()
  extends typings.azureMsalCommon.distAccountAuthTokenMod.AuthToken {
  def this(rawToken: String, crypto: ICrypto) = this()
}
/* static members */
object AuthToken {
  
  @JSImport("@azure/msal-common", "AuthToken")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determine if the token's max_age has transpired
    */
  inline def checkMaxAge(authTime: Double, maxAge: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxAge")(authTime.asInstanceOf[js.Any], maxAge.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Extract token by decoding the rawToken
    *
    * @param encodedToken
    */
  inline def extractTokenClaims(encodedToken: String, crypto: ICrypto): TokenClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTokenClaims")(encodedToken.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[TokenClaims]
}
