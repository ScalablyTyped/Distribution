package typings
package atBlueprintjsTableLib.libEsmCellFormatsJsonFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJSONFormatProps
  extends atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.ITruncatedFormatProps {
  @JSName("children")
  var children_IJSONFormatProps: js.UndefOr[js.Any] = js.undefined
  /**
    * By default, we omit stringifying native JavaScript strings since
    * `JSON.stringify` awkwardly adds double-quotes to the display value.
    * This behavior can be turned off by setting this boolean to `false`.
    * @default true
    */
  var omitQuotesOnStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optionally specify the stringify method. Default is `JSON.stringify`
    * with 2-space indentation.
    */
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, java.lang.String]] = js.undefined
}

object IJSONFormatProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    className: java.lang.String = null,
    detectTruncation: js.UndefOr[scala.Boolean] = js.undefined,
    measureByApproxOptions: atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions = null,
    omitQuotesOnStrings: js.UndefOr[scala.Boolean] = js.undefined,
    parentCellHeight: scala.Int | scala.Double = null,
    parentCellWidth: scala.Int | scala.Double = null,
    preformatted: js.UndefOr[scala.Boolean] = js.undefined,
    showPopover: atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode = null,
    stringify: /* obj */ js.Any => java.lang.String = null,
    truncateLength: scala.Int | scala.Double = null,
    truncationSuffix: java.lang.String = null
  ): IJSONFormatProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(detectTruncation)) __obj.updateDynamic("detectTruncation")(detectTruncation)
    if (measureByApproxOptions != null) __obj.updateDynamic("measureByApproxOptions")(measureByApproxOptions)
    if (!js.isUndefined(omitQuotesOnStrings)) __obj.updateDynamic("omitQuotesOnStrings")(omitQuotesOnStrings)
    if (parentCellHeight != null) __obj.updateDynamic("parentCellHeight")(parentCellHeight.asInstanceOf[js.Any])
    if (parentCellWidth != null) __obj.updateDynamic("parentCellWidth")(parentCellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preformatted)) __obj.updateDynamic("preformatted")(preformatted)
    if (showPopover != null) __obj.updateDynamic("showPopover")(showPopover)
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    if (truncationSuffix != null) __obj.updateDynamic("truncationSuffix")(truncationSuffix)
    __obj.asInstanceOf[IJSONFormatProps]
  }
}

