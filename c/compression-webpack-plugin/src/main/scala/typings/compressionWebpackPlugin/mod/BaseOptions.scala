package typings.compressionWebpackPlugin.mod

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
    minRatio: js.UndefOr[Double] = js.undefined,
    test: Pattern = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(minRatio)) __obj.updateDynamic("minRatio")(minRatio.get.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

