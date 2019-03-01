package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var expiry: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String,
    expiry: java.lang.String = null,
    headers: js.Any = null,
    tags: js.Array[java.lang.String] = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Body]
  }
}

