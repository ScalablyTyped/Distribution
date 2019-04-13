package typings
package bodyDashParserLib.bodyDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsJson extends Options {
  var reviver: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsJson {
  @scala.inline
  def apply(
    inflate: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Double | java.lang.String = null,
    reviver: (/* key */ java.lang.String, /* value */ js.Any) => _ = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, _]) = null,
    verify: (/* req */ nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.httpMod.ServerResponse, /* buf */ nodeLib.Buffer, /* encoding */ java.lang.String) => scala.Unit = null
  ): OptionsJson = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2(reviver))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[OptionsJson]
  }
}

