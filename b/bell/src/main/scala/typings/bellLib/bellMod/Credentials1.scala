package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials1 extends Credentials {
  var secret: java.lang.String
}

object Credentials1 {
  @scala.inline
  def apply(
    provider: Provider | bellLib.bellLibStrings.custom,
    query: StringLikeMap,
    secret: java.lang.String,
    token: java.lang.String,
    profile: js.Object = null
  ): Credentials1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("secret")(secret)
    __obj.updateDynamic("token")(token)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[Credentials1]
  }
}

