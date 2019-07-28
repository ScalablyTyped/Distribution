package typings.bodyDashParser.bodyDashParserMod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsUrlencoded extends Options {
  var extended: js.UndefOr[Boolean] = js.undefined
  var parameterLimit: js.UndefOr[Double] = js.undefined
}

object OptionsUrlencoded {
  @scala.inline
  def apply(
    extended: js.UndefOr[Boolean] = js.undefined,
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    parameterLimit: Int | Double = null,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit = null
  ): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended)
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[OptionsUrlencoded]
  }
}

