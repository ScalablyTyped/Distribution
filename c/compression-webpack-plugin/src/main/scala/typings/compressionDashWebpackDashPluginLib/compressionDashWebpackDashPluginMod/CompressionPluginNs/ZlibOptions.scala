package typings
package compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod.CompressionPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions
  extends BaseOptions
     with Options[js.Any] {
  var algorithm: js.UndefOr[ZlibAlgorithm] = js.undefined
  var compressionOptions: js.UndefOr[nodeLib.zlibMod.ZlibOptions] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    algorithm: ZlibAlgorithm = null,
    cache: scala.Boolean | java.lang.String = null,
    compressionOptions: nodeLib.zlibMod.ZlibOptions = null,
    deleteOriginalAssets: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: Pattern = null,
    filename: java.lang.String = null,
    include: Pattern = null,
    minRatio: scala.Int | scala.Double = null,
    test: Pattern = null,
    threshold: scala.Int | scala.Double = null
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions)
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

