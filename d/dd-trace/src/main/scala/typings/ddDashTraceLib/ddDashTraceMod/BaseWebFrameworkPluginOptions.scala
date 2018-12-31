package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWebFrameworkPluginOptions extends BasePluginOptions {
  /**
    * An array of headers to include in the span metadata.
    */
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ scala.Double, scala.Boolean]] = js.undefined
}

