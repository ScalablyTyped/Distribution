package typings.bodyParser.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsText extends Options {
  /**
    * Specify the default character set for the text content if the charset
    * is not specified in the Content-Type header of the request.
    * Defaults to `utf-8`.
    */
  var defaultCharset: js.UndefOr[String] = js.undefined
}

object OptionsText {
  @scala.inline
  def apply(
    defaultCharset: String = null,
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit = null
  ): OptionsText = {
    val __obj = js.Dynamic.literal()
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[OptionsText]
  }
}

