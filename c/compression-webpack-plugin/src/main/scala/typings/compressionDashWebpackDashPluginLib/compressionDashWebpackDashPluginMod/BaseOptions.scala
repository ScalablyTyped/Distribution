package typings
package compressionDashWebpackDashPluginLib.compressionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var deleteOriginalAssets: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[Pattern] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var include: js.UndefOr[Pattern] = js.undefined
  var minRatio: js.UndefOr[scala.Double] = js.undefined
  var test: js.UndefOr[Pattern] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean | java.lang.String = null,
    deleteOriginalAssets: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: Pattern = null,
    filename: java.lang.String = null,
    include: Pattern = null,
    minRatio: scala.Int | scala.Double = null,
    test: Pattern = null,
    threshold: scala.Int | scala.Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

