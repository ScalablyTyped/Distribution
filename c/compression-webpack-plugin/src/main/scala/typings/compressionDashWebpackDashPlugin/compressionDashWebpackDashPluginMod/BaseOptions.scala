package typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var cache: js.UndefOr[Boolean | String] = js.undefined
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[Pattern] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var include: js.UndefOr[Pattern] = js.undefined
  var minRatio: js.UndefOr[Double] = js.undefined
  var test: js.UndefOr[Pattern] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    cache: Boolean | String = null,
    deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined,
    exclude: Pattern = null,
    filename: String = null,
    include: Pattern = null,
    minRatio: Int | Double = null,
    test: Pattern = null,
    threshold: Int | Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

