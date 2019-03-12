package typings
package bodyDashParserLib.bodyDashParserMod.bodyParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsText extends Options {
  var defaultCharset: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsText {
  @scala.inline
  def apply(
    defaultCharset: java.lang.String = null,
    inflate: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Double | java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, _]) = null,
    verify: (/* req */ nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.httpMod.ServerResponse, /* buf */ nodeLib.Buffer, /* encoding */ java.lang.String) => scala.Unit = null
  ): OptionsText = {
    val __obj = js.Dynamic.literal()
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset)
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[OptionsText]
  }
}

