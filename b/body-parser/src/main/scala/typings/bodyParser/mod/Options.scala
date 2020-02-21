package typings.bodyParser.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** When set to true, then deflated (compressed) bodies will be inflated; when false, deflated bodies are rejected. Defaults to true. */
  var inflate: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the maximum request body size. If this is a number,
    * then the value specifies the number of bytes; if it is a string,
    * the value is passed to the bytes library for parsing. Defaults to '100kb'.
    */
  var limit: js.UndefOr[Double | String] = js.undefined
  /**
    * The type option is used to determine what media type the middleware will parse
    */
  var `type`: js.UndefOr[String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _])] = js.undefined
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding),
    * where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[Options]
  }
}

