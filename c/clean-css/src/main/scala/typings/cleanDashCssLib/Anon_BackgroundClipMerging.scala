package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundClipMerging extends js.Object {
  /**
    * Controls background-clip merging into shorthand; defaults to `true`
    */
  var backgroundClipMerging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls background-origin merging into shorthand; defaults to `true`
    */
  var backgroundOriginMerging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls background-size merging into shorthand; defaults to `true`
    */
  var backgroundSizeMerging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * controls color optimizations; defaults to `true`
    */
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls keeping IE bang hack; defaults to `false`
    */
  var ieBangHack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
    */
  var ieFilters: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls keeping IE prefix hack; defaults to `false`
    */
  var iePrefixHack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls keeping IE suffix hack; defaults to `false`
    */
  var ieSuffixHack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls property merging based on understandably; defaults to `true`
    */
  var merging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
    */
  var shorterLengthUnits: js.UndefOr[cleanDashCssLib.cleanDashCssLibNumbers.`false`] = js.undefined
  /**
    * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
    */
  var spaceAfterClosingBrace: js.UndefOr[cleanDashCssLib.cleanDashCssLibNumbers.`true`] = js.undefined
  /**
    * Controls keeping quoting inside `url()`; defaults to `false`
    */
  var urlQuotes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removal of units `0` value; defaults to `true`
    */
  var zeroUnits: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackgroundClipMerging {
  @scala.inline
  def apply(
    backgroundClipMerging: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundOriginMerging: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundSizeMerging: js.UndefOr[scala.Boolean] = js.undefined,
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    ieBangHack: js.UndefOr[scala.Boolean] = js.undefined,
    ieFilters: js.UndefOr[scala.Boolean] = js.undefined,
    iePrefixHack: js.UndefOr[scala.Boolean] = js.undefined,
    ieSuffixHack: js.UndefOr[scala.Boolean] = js.undefined,
    merging: js.UndefOr[scala.Boolean] = js.undefined,
    shorterLengthUnits: cleanDashCssLib.cleanDashCssLibNumbers.`false` = null,
    spaceAfterClosingBrace: cleanDashCssLib.cleanDashCssLibNumbers.`true` = null,
    urlQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    zeroUnits: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackgroundClipMerging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundClipMerging)) __obj.updateDynamic("backgroundClipMerging")(backgroundClipMerging)
    if (!js.isUndefined(backgroundOriginMerging)) __obj.updateDynamic("backgroundOriginMerging")(backgroundOriginMerging)
    if (!js.isUndefined(backgroundSizeMerging)) __obj.updateDynamic("backgroundSizeMerging")(backgroundSizeMerging)
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(ieBangHack)) __obj.updateDynamic("ieBangHack")(ieBangHack)
    if (!js.isUndefined(ieFilters)) __obj.updateDynamic("ieFilters")(ieFilters)
    if (!js.isUndefined(iePrefixHack)) __obj.updateDynamic("iePrefixHack")(iePrefixHack)
    if (!js.isUndefined(ieSuffixHack)) __obj.updateDynamic("ieSuffixHack")(ieSuffixHack)
    if (!js.isUndefined(merging)) __obj.updateDynamic("merging")(merging)
    if (shorterLengthUnits != null) __obj.updateDynamic("shorterLengthUnits")(shorterLengthUnits)
    if (spaceAfterClosingBrace != null) __obj.updateDynamic("spaceAfterClosingBrace")(spaceAfterClosingBrace)
    if (!js.isUndefined(urlQuotes)) __obj.updateDynamic("urlQuotes")(urlQuotes)
    if (!js.isUndefined(zeroUnits)) __obj.updateDynamic("zeroUnits")(zeroUnits)
    __obj.asInstanceOf[Anon_BackgroundClipMerging]
  }
}

