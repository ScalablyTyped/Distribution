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

