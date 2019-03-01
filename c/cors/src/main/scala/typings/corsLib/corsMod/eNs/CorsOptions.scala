package typings
package corsLib.corsMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsOptions extends js.Object {
  var allowedHeaders: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  var exposedHeaders: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var methods: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var optionsSuccessStatus: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[
    scala.Boolean | java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) | corsLib.CustomOrigin
  ] = js.undefined
  var preflightContinue: js.UndefOr[scala.Boolean] = js.undefined
}

object CorsOptions {
  @scala.inline
  def apply(
    allowedHeaders: java.lang.String | js.Array[java.lang.String] = null,
    credentials: js.UndefOr[scala.Boolean] = js.undefined,
    exposedHeaders: java.lang.String | js.Array[java.lang.String] = null,
    maxAge: scala.Int | scala.Double = null,
    methods: java.lang.String | js.Array[java.lang.String] = null,
    optionsSuccessStatus: scala.Int | scala.Double = null,
    origin: scala.Boolean | java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) | corsLib.CustomOrigin = null,
    preflightContinue: js.UndefOr[scala.Boolean] = js.undefined
  ): CorsOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (exposedHeaders != null) __obj.updateDynamic("exposedHeaders")(exposedHeaders.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (optionsSuccessStatus != null) __obj.updateDynamic("optionsSuccessStatus")(optionsSuccessStatus.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(preflightContinue)) __obj.updateDynamic("preflightContinue")(preflightContinue)
    __obj.asInstanceOf[CorsOptions]
  }
}

