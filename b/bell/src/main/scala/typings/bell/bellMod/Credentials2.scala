package typings.bell.bellMod

import typings.bell.bellStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials2 extends Credentials {
  var expiresIn: js.UndefOr[Double] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
}

object Credentials2 {
  @scala.inline
  def apply(
    provider: Provider | custom,
    query: StringLikeMap,
    token: String,
    expiresIn: Int | Double = null,
    profile: js.Object = null,
    refreshToken: String = null
  ): Credentials2 = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials2]
  }
}

