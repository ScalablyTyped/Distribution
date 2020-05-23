package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Credentials> */
trait CredentialsOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var authorizationCode: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var expiration: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var tokenUrl: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object CredentialsOptions {
  @scala.inline
  def apply(
    accessToken: String = null,
    authorizationCode: String = null,
    clientId: String = null,
    clientSecret: String = null,
    constructor: /* options */ js.UndefOr[CredentialsOptions] => js.Any = null,
    expiration: js.UndefOr[Double] = js.undefined,
    password: String = null,
    redirectUrl: String = null,
    refreshToken: String = null,
    tokenUrl: String = null,
    username: String = null
  ): CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (!js.isUndefined(expiration)) __obj.updateDynamic("expiration")(expiration.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsOptions]
  }
}

