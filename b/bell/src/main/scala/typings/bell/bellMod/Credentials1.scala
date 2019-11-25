package typings.bell.bellMod

import typings.bell.bellStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials1 extends Credentials {
  var secret: String
}

object Credentials1 {
  @scala.inline
  def apply(
    provider: Provider | custom,
    query: StringLikeMap,
    secret: String,
    token: String,
    profile: js.Object = null
  ): Credentials1 = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials1]
  }
}

