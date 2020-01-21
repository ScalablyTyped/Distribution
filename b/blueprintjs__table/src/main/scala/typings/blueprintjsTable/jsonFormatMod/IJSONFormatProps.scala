package typings.blueprintjsTable.jsonFormatMod

import typings.blueprintjsTable.truncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typings.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import typings.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJSONFormatProps extends ITruncatedFormatProps {
  @JSName("children")
  var children_IJSONFormatProps: js.UndefOr[js.Any] = js.undefined
  /**
    * By default, we omit stringifying native JavaScript strings since
    * `JSON.stringify` awkwardly adds double-quotes to the display value.
    * This behavior can be turned off by setting this boolean to `false`.
    * @default true
    */
  var omitQuotesOnStrings: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally specify the stringify method. Default is `JSON.stringify`
    * with 2-space indentation.
    */
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
}

object IJSONFormatProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    className: String = null,
    detectTruncation: js.UndefOr[Boolean] = js.undefined,
    measureByApproxOptions: ITrucatedFormateMeasureByApproximateOptions = null,
    omitQuotesOnStrings: js.UndefOr[Boolean] = js.undefined,
    parentCellHeight: Int | Double = null,
    parentCellWidth: Int | Double = null,
    preformatted: js.UndefOr[Boolean] = js.undefined,
    showPopover: TruncatedPopoverMode = null,
    stringify: /* obj */ js.Any => String = null,
    truncateLength: Int | Double = null,
    truncationSuffix: String = null
  ): IJSONFormatProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(detectTruncation)) __obj.updateDynamic("detectTruncation")(detectTruncation.asInstanceOf[js.Any])
    if (measureByApproxOptions != null) __obj.updateDynamic("measureByApproxOptions")(measureByApproxOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(omitQuotesOnStrings)) __obj.updateDynamic("omitQuotesOnStrings")(omitQuotesOnStrings.asInstanceOf[js.Any])
    if (parentCellHeight != null) __obj.updateDynamic("parentCellHeight")(parentCellHeight.asInstanceOf[js.Any])
    if (parentCellWidth != null) __obj.updateDynamic("parentCellWidth")(parentCellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preformatted)) __obj.updateDynamic("preformatted")(preformatted.asInstanceOf[js.Any])
    if (showPopover != null) __obj.updateDynamic("showPopover")(showPopover.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    if (truncationSuffix != null) __obj.updateDynamic("truncationSuffix")(truncationSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJSONFormatProps]
  }
}

