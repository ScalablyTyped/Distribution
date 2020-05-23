package typings.bodyParser.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsUrlencoded extends Options {
  /**
    * The extended option allows to choose between parsing the URL-encoded data
    * with the querystring library (when `false`) or the qs library (when `true`).
    */
  var extended: js.UndefOr[Boolean] = js.undefined
  /**
    * The parameterLimit option controls the maximum number of parameters
    * that are allowed in the URL-encoded data. If a request contains more parameters than this value,
    * a 413 will be returned to the client. Defaults to 1000.
    */
  var parameterLimit: js.UndefOr[Double] = js.undefined
}

object OptionsUrlencoded {
  @scala.inline
  def apply(
    extended: js.UndefOr[Boolean] = js.undefined,
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    parameterLimit: js.UndefOr[Double] = js.undefined,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit = null
  ): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterLimit)) __obj.updateDynamic("parameterLimit")(parameterLimit.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[OptionsUrlencoded]
  }
}

