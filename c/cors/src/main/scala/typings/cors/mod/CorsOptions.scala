package typings.cors.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsOptions extends js.Object {
  var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
  var credentials: js.UndefOr[Boolean] = js.undefined
  var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var methods: js.UndefOr[String | js.Array[String]] = js.undefined
  var optionsSuccessStatus: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[Boolean | String | RegExp | (js.Array[String | RegExp]) | CustomOrigin] = js.undefined
  var preflightContinue: js.UndefOr[Boolean] = js.undefined
}

object CorsOptions {
  @scala.inline
  def apply(
    allowedHeaders: String | js.Array[String] = null,
    credentials: js.UndefOr[Boolean] = js.undefined,
    exposedHeaders: String | js.Array[String] = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    methods: String | js.Array[String] = null,
    optionsSuccessStatus: js.UndefOr[Double] = js.undefined,
    origin: Boolean | String | RegExp | (js.Array[String | RegExp]) | CustomOrigin = null,
    preflightContinue: js.UndefOr[Boolean] = js.undefined
  ): CorsOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.get.asInstanceOf[js.Any])
    if (exposedHeaders != null) __obj.updateDynamic("exposedHeaders")(exposedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsSuccessStatus)) __obj.updateDynamic("optionsSuccessStatus")(optionsSuccessStatus.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(preflightContinue)) __obj.updateDynamic("preflightContinue")(preflightContinue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsOptions]
  }
}

