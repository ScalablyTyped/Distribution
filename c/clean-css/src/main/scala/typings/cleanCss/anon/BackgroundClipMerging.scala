package typings.cleanCss.anon

import typings.cleanCss.cleanCssBooleans.`false`
import typings.cleanCss.cleanCssBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundClipMerging extends js.Object {
  /**
    * Controls background-clip merging into shorthand; defaults to `true`
    */
  var backgroundClipMerging: js.UndefOr[Boolean] = js.native
  /**
    * Controls background-origin merging into shorthand; defaults to `true`
    */
  var backgroundOriginMerging: js.UndefOr[Boolean] = js.native
  /**
    * Controls background-size merging into shorthand; defaults to `true`
    */
  var backgroundSizeMerging: js.UndefOr[Boolean] = js.native
  /**
    * controls color optimizations; defaults to `true`
    */
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE bang hack; defaults to `false`
    */
  var ieBangHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
    */
  var ieFilters: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE prefix hack; defaults to `false`
    */
  var iePrefixHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls keeping IE suffix hack; defaults to `false`
    */
  var ieSuffixHack: js.UndefOr[Boolean] = js.native
  /**
    * Controls property merging based on understandably; defaults to `true`
    */
  var merging: js.UndefOr[Boolean] = js.native
  /**
    * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
    */
  var shorterLengthUnits: js.UndefOr[`false`] = js.native
  /**
    * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
    */
  var spaceAfterClosingBrace: js.UndefOr[`true`] = js.native
  /**
    * Controls keeping quoting inside `url()`; defaults to `false`
    */
  var urlQuotes: js.UndefOr[Boolean] = js.native
  /**
    * Controls removal of units `0` value; defaults to `true`
    */
  var zeroUnits: js.UndefOr[Boolean] = js.native
}

object BackgroundClipMerging {
  @scala.inline
  def apply(): BackgroundClipMerging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundClipMerging]
  }
  @scala.inline
  implicit class BackgroundClipMergingOps[Self <: BackgroundClipMerging] (val x: Self) extends AnyVal {
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
    def setBackgroundClipMerging(value: Boolean): Self = this.set("backgroundClipMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundClipMerging: Self = this.set("backgroundClipMerging", js.undefined)
    @scala.inline
    def setBackgroundOriginMerging(value: Boolean): Self = this.set("backgroundOriginMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundOriginMerging: Self = this.set("backgroundOriginMerging", js.undefined)
    @scala.inline
    def setBackgroundSizeMerging(value: Boolean): Self = this.set("backgroundSizeMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundSizeMerging: Self = this.set("backgroundSizeMerging", js.undefined)
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setIeBangHack(value: Boolean): Self = this.set("ieBangHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeBangHack: Self = this.set("ieBangHack", js.undefined)
    @scala.inline
    def setIeFilters(value: Boolean): Self = this.set("ieFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeFilters: Self = this.set("ieFilters", js.undefined)
    @scala.inline
    def setIePrefixHack(value: Boolean): Self = this.set("iePrefixHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIePrefixHack: Self = this.set("iePrefixHack", js.undefined)
    @scala.inline
    def setIeSuffixHack(value: Boolean): Self = this.set("ieSuffixHack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeSuffixHack: Self = this.set("ieSuffixHack", js.undefined)
    @scala.inline
    def setMerging(value: Boolean): Self = this.set("merging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerging: Self = this.set("merging", js.undefined)
    @scala.inline
    def setShorterLengthUnits(value: `false`): Self = this.set("shorterLengthUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShorterLengthUnits: Self = this.set("shorterLengthUnits", js.undefined)
    @scala.inline
    def setSpaceAfterClosingBrace(value: `true`): Self = this.set("spaceAfterClosingBrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceAfterClosingBrace: Self = this.set("spaceAfterClosingBrace", js.undefined)
    @scala.inline
    def setUrlQuotes(value: Boolean): Self = this.set("urlQuotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlQuotes: Self = this.set("urlQuotes", js.undefined)
    @scala.inline
    def setZeroUnits(value: Boolean): Self = this.set("zeroUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroUnits: Self = this.set("zeroUnits", js.undefined)
  }
  
}

