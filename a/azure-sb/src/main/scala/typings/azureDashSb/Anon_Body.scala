package typings.azureDashSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var expiry: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: String, expiry: String = null, headers: js.Any = null, tags: js.Array[String] = null): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Body]
  }
}

