package typings
package bodyDashParserLib.bodyDashParserMod.bodyParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsUrlencoded extends Options {
  var extended: js.UndefOr[scala.Boolean] = js.undefined
  var parameterLimit: js.UndefOr[scala.Double] = js.undefined
}

object OptionsUrlencoded {
  @scala.inline
  def apply(
    extended: js.UndefOr[scala.Boolean] = js.undefined,
    inflate: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Double | java.lang.String = null,
    parameterLimit: scala.Int | scala.Double = null,
    `type`: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, _]) = null,
    verify: js.Function4[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* buf */ nodeLib.Buffer, 
      /* encoding */ java.lang.String, 
      scala.Unit
    ] = null
  ): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended)
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[OptionsUrlencoded]
  }
}

