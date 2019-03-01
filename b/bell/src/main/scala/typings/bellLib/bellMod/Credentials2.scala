package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials2 extends Credentials {
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials2 {
  @scala.inline
  def apply(
    provider: Provider | bellLib.bellLibStrings.custom,
    query: StringLikeMap,
    token: java.lang.String,
    expiresIn: scala.Int | scala.Double = null,
    profile: js.Object = null,
    refreshToken: java.lang.String = null
  ): Credentials2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("token")(token)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[Credentials2]
  }
}

