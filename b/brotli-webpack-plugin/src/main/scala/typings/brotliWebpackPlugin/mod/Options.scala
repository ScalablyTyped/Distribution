package typings.brotliWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The target asset name. Defaults to `'[path].br[query]'`.
    *
    * - `[file]` is replaced with the original asset file name.
    * - `[fileWithoutExt]` is replaced with the file name minus its extension, e.g. the `style` of `style.css`.
    * - `[ext]` is replaced with the file name extension, e.g. the `css` of `style.css`.
    * - `[path]` is replaced with the path of the original asset.
    * - `[query]` is replaced with the query.
    */
  var asset: js.UndefOr[String] = js.native
  /**
    * Remove original files that were compressed with brotli. Default: `false`.
    */
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.native
  /**
    * Only assets that compress better that this ratio are processed. Defaults to `0.8`.
    */
  var minRatio: js.UndefOr[Double] = js.native
  /**
    * All assets matching this RegExp are processed. Defaults to every asset.
    */
  var test: js.UndefOr[RegExp] = js.native
  /**
    * Only assets bigger than this size (in bytes) are processed. Defaults to `0`.
    */
  var threshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsset(value: String): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    @scala.inline
    def setDeleteOriginalAssets(value: Boolean): Self = this.set("deleteOriginalAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOriginalAssets: Self = this.set("deleteOriginalAssets", js.undefined)
    @scala.inline
    def setMinRatio(value: Double): Self = this.set("minRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRatio: Self = this.set("minRatio", js.undefined)
    @scala.inline
    def setTest(value: RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

