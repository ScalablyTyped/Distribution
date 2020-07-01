package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Enable file caching
    * ⚠ Ignored in webpack 5! Please use webpack.js.org/configuration/other-options/#cache.
    * @default true
    */
  var cache: js.UndefOr[Boolean | String] = js.undefined
  /**
    * @default false
    */
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined
  /**
    * Exclude all assets matching any of these conditions
    */
  var exclude: js.UndefOr[Rules] = js.undefined
  /**
    * The target asset filename.
    * @default '[path].gz[query]'
    */
  var filename: js.UndefOr[String | FilenameFunction] = js.undefined
  /**
    * Include all assets matching any of these conditions
    */
  var include: js.UndefOr[Rules] = js.undefined
  /**
    * Only assets that compress better than this ratio are processed (minRatio = Compressed Size / Original Size)
    * @default 0.8
    */
  var minRatio: js.UndefOr[Double] = js.undefined
  /**
    * Include all assets that pass test assertion
    */
  var test: js.UndefOr[Rules] = js.undefined
  /**
    * Only assets bigger than this size are processed (in bytes)
    * @default 0
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    cache: Boolean | String = null,
    deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined,
    exclude: Rules = null,
    filename: String | FilenameFunction = null,
    include: Rules = null,
    minRatio: js.UndefOr[Double] = js.undefined,
    test: Rules = null,
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

