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

object MinifyOptions {
  @scala.inline
  def apply(
    afterCompress: AfterCompressFn | js.Array[AfterCompressFn] = null,
    beforeCompress: BeforeCompressFn | js.Array[BeforeCompressFn] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    restructure: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (afterCompress != null) __obj.updateDynamic("afterCompress")(afterCompress.asInstanceOf[js.Any])
    if (beforeCompress != null) __obj.updateDynamic("beforeCompress")(beforeCompress.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(restructure)) __obj.updateDynamic("restructure")(restructure)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[MinifyOptions]
  }
}

