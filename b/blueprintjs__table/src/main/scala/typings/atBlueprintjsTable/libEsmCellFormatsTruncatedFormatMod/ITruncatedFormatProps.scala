package typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITruncatedFormatProps extends IProps {
  var children: js.UndefOr[String] = js.undefined
  /**
    * Should the component keep track of the truncation state of the string content. If true, the
    * value of `truncateLength` is ignored. When combined with a `showPopover` value of
    * `WHEN_TRUNCATED`, popovers will only render when necessary.
    * @default false;
    */
  var detectTruncation: js.UndefOr[Boolean] = js.undefined
  /**
    * Values to use for character width, line height, cell padding, and buffer lines desired, when using approximate truncation.
    * These values are used to guess at the size of the text and determine if the popover should be drawn. They should work well
    * enough for default table styles, but may need to be overridden for more accuracy if the default styles or font size, etc
    * are changed.
    */
  var measureByApproxOptions: js.UndefOr[ITrucatedFormateMeasureByApproximateOptions] = js.undefined
  /**
    * Height of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellHeight: js.UndefOr[Double] = js.undefined
  /**
    * Width of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellWidth: js.UndefOr[Double] = js.undefined
  /**
    * Sets the popover content style to `white-space: pre` if `true` or
    * `white-space: normal` if `false`.
    * @default false
    */
  var preformatted: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures when the popover is shown with the `TruncatedPopoverMode` enum.
    *
    * The enum values are:
    * - `ALWAYS`: show the popover.
    * - `NEVER`: don't show the popover.
    * - `WHEN_TRUNCATED`: show the popover only when the text is truncated (default).
    * - `WHEN_TRUNCATED_APPROX`: show the popover only when the text is trunctated, but use
    *   a formula to calculate this based on text length, which is faster but less accurate.
    * @default WHEN_TRUNCATED
    */
  var showPopover: js.UndefOr[TruncatedPopoverMode] = js.undefined
  /**
    * Number of characters that are displayed before being truncated and appended with the
    * `truncationSuffix` prop. A value of 0 will disable truncation. This prop is ignored if
    * `detectTruncation` is `true`.
    * @default 2000
    */
  var truncateLength: js.UndefOr[Double] = js.undefined
  /**
    * The string that is appended to the display string if it is truncated.
    * @default "..."
    */
  var truncationSuffix: js.UndefOr[String] = js.undefined
}

object ITruncatedFormatProps {
  @scala.inline
  def apply(
    children: String = null,
    className: String = null,
    detectTruncation: js.UndefOr[Boolean] = js.undefined,
    measureByApproxOptions: ITrucatedFormateMeasureByApproximateOptions = null,
    parentCellHeight: Int | Double = null,
    parentCellWidth: Int | Double = null,
    preformatted: js.UndefOr[Boolean] = js.undefined,
    showPopover: TruncatedPopoverMode = null,
    truncateLength: Int | Double = null,
    truncationSuffix: String = null
  ): ITruncatedFormatProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(detectTruncation)) __obj.updateDynamic("detectTruncation")(detectTruncation)
    if (measureByApproxOptions != null) __obj.updateDynamic("measureByApproxOptions")(measureByApproxOptions)
    if (parentCellHeight != null) __obj.updateDynamic("parentCellHeight")(parentCellHeight.asInstanceOf[js.Any])
    if (parentCellWidth != null) __obj.updateDynamic("parentCellWidth")(parentCellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preformatted)) __obj.updateDynamic("preformatted")(preformatted)
    if (showPopover != null) __obj.updateDynamic("showPopover")(showPopover)
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    if (truncationSuffix != null) __obj.updateDynamic("truncationSuffix")(truncationSuffix)
    __obj.asInstanceOf[ITruncatedFormatProps]
  }
}

