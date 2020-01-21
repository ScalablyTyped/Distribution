package typings.cleanCss

import typings.cleanCss.cleanCssBooleans.`false`
import typings.cleanCss.cleanCssBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundClipMerging extends js.Object {
  /**
    * Controls background-clip merging into shorthand; defaults to `true`
    */
  var backgroundClipMerging: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls background-origin merging into shorthand; defaults to `true`
    */
  var backgroundOriginMerging: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls background-size merging into shorthand; defaults to `true`
    */
  var backgroundSizeMerging: js.UndefOr[Boolean] = js.undefined
  /**
    * controls color optimizations; defaults to `true`
    */
  var colors: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls keeping IE bang hack; defaults to `false`
    */
  var ieBangHack: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
    */
  var ieFilters: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls keeping IE prefix hack; defaults to `false`
    */
  var iePrefixHack: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls keeping IE suffix hack; defaults to `false`
    */
  var ieSuffixHack: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls property merging based on understandably; defaults to `true`
    */
  var merging: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
    */
  var shorterLengthUnits: js.UndefOr[`false`] = js.undefined
  /**
    * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
    */
  var spaceAfterClosingBrace: js.UndefOr[`true`] = js.undefined
  /**
    * Controls keeping quoting inside `url()`; defaults to `false`
    */
  var urlQuotes: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removal of units `0` value; defaults to `true`
    */
  var zeroUnits: js.UndefOr[Boolean] = js.undefined
}

object AnonBackgroundClipMerging {
  @scala.inline
  def apply(
    backgroundClipMerging: js.UndefOr[Boolean] = js.undefined,
    backgroundOriginMerging: js.UndefOr[Boolean] = js.undefined,
    backgroundSizeMerging: js.UndefOr[Boolean] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    ieBangHack: js.UndefOr[Boolean] = js.undefined,
    ieFilters: js.UndefOr[Boolean] = js.undefined,
    iePrefixHack: js.UndefOr[Boolean] = js.undefined,
    ieSuffixHack: js.UndefOr[Boolean] = js.undefined,
    merging: js.UndefOr[Boolean] = js.undefined,
    shorterLengthUnits: `false` = null,
    spaceAfterClosingBrace: `true` = null,
    urlQuotes: js.UndefOr[Boolean] = js.undefined,
    zeroUnits: js.UndefOr[Boolean] = js.undefined
  ): AnonBackgroundClipMerging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundClipMerging)) __obj.updateDynamic("backgroundClipMerging")(backgroundClipMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundOriginMerging)) __obj.updateDynamic("backgroundOriginMerging")(backgroundOriginMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundSizeMerging)) __obj.updateDynamic("backgroundSizeMerging")(backgroundSizeMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(ieBangHack)) __obj.updateDynamic("ieBangHack")(ieBangHack.asInstanceOf[js.Any])
    if (!js.isUndefined(ieFilters)) __obj.updateDynamic("ieFilters")(ieFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(iePrefixHack)) __obj.updateDynamic("iePrefixHack")(iePrefixHack.asInstanceOf[js.Any])
    if (!js.isUndefined(ieSuffixHack)) __obj.updateDynamic("ieSuffixHack")(ieSuffixHack.asInstanceOf[js.Any])
    if (!js.isUndefined(merging)) __obj.updateDynamic("merging")(merging.asInstanceOf[js.Any])
    if (shorterLengthUnits != null) __obj.updateDynamic("shorterLengthUnits")(shorterLengthUnits.asInstanceOf[js.Any])
    if (spaceAfterClosingBrace != null) __obj.updateDynamic("spaceAfterClosingBrace")(spaceAfterClosingBrace.asInstanceOf[js.Any])
    if (!js.isUndefined(urlQuotes)) __obj.updateDynamic("urlQuotes")(urlQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroUnits)) __obj.updateDynamic("zeroUnits")(zeroUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundClipMerging]
  }
}

