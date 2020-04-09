package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.UrlOptions> */
trait PartialUrlOptions extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var domain_prefix: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
}

object PartialUrlOptions {
  @scala.inline
  def apply(
    domain: String = null,
    domain_prefix: String = null,
    extensions: js.Array[String] = null,
    path: String = null,
    protocol: String = null
  ): PartialUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domain_prefix != null) __obj.updateDynamic("domain_prefix")(domain_prefix.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUrlOptions]
  }
}

