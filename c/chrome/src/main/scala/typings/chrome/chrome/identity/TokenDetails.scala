package typings.chrome.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  /**
    * Optional.
    * The account ID whose token should be returned. If not specified, the primary account for the profile will be used.
    * account is only supported when the "enable-new-profile-management" flag is set.
    * @since Chrome 37.
    */
  var account: js.UndefOr[AccountInfo] = js.undefined
  /**
    * Optional.
    * Fetching a token may require the user to sign-in to Chrome, or approve the application's requested scopes. If the interactive flag is true, getAuthToken will prompt the user as necessary. When the flag is false or omitted, getAuthToken will return failure any time a prompt would be required.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * A list of OAuth2 scopes to request.
    * When the scopes field is present, it overrides the list of scopes specified in manifest.json.
    * @since Chrome 37.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object TokenDetails {
  @scala.inline
  def apply(
    account: AccountInfo = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    scopes: js.Array[String] = null
  ): TokenDetails = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[TokenDetails]
  }
}

