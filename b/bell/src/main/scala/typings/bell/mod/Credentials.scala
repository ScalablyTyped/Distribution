package typings.bell.mod

import typings.bell.bellStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * Varying data depending on provider.
    */
  var profile: js.UndefOr[js.Object] = js.undefined
  var provider: Provider | custom
  var query: StringLikeMap
  var token: String
}

object Credentials {
  @scala.inline
  def apply(provider: Provider | custom, query: StringLikeMap, token: String, profile: js.Object = null): Credentials = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

