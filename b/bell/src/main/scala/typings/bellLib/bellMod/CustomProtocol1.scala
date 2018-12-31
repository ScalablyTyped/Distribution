package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProtocol1 extends CustomProtocol {
  @JSName("profile")
  var profile_Original: ProfileGetter[Credentials1] = js.native
  /**
    * the authorization protocol used.
    */
  var protocol: bellLib.bellLibStrings.oauth = js.native
  /**
    * the OAuth signature method. Must be one of:
    * * 'HMAC-SHA1' - default
    * * 'RSA-SHA1' - in that case, the clientSecret is your RSA private key
    */
  var signatureMethod: js.UndefOr[bellLib.bellLibStrings.`HMAC-SHA1` | bellLib.bellLibStrings.`RSA-SHA1`] = js.native
  /**
    * the temporary credentials (request token) endpoint).
    */
  var temporary: js.UndefOr[java.lang.String] = js.native
  def profile(
    `this`: CustomProviderOptions,
    credentials: Credentials1,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    get: AuthedRequest
  ): js.Promise[scala.Unit] = js.native
}

