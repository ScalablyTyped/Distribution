package typings
package cssoLib.cssoMod.cssoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  /**
    * Called right after compress() is run.
    */
  var afterCompress: js.UndefOr[AfterCompressFn | js.Array[AfterCompressFn]] = js.undefined
  /**
    * Called right after parse is run.
    */
  var beforeCompress: js.UndefOr[BeforeCompressFn | js.Array[BeforeCompressFn]] = js.undefined
  /**
    * Output debug information to stderr.
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filename of input CSS, uses for source map generation.
    * @default '<unknown>'
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var restructure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Generate a source map when true.
    * @default false
    */
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

