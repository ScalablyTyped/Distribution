package typings
package atBlueprintjsTimezoneLib.libEsmComponentsTimezoneDashPickerTimezonePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimezonePickerProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** Props to spread to the target `Button`. */
  var buttonProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsButtonAbstractButtonMod.IButtonProps]
  ] = js.undefined
  /**
       * This component does not support children.
       * Use `value`, `valueDisplayFormat` and `buttonProps` to customize the button child.
       */
  var children: js.UndefOr[scala.Nothing] = js.undefined
  /**
       * The date to use when formatting timezone offsets.
       * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
       * @default now
       */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Whether this component is non-interactive.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Props to spread to the filter `InputGroup`.
       * All props are supported except `ref` (use `inputRef` instead).
       * If you want to control the filter input, you can pass `value` and `onChange` here
       * to override `Select`'s own behavior.
       */
  var inputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps
  ] = js.undefined
  /**
       * Text to show when no timezone has been selected (`value === undefined`).
       * @default "Select timezone..."
       */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps]
  ] = js.undefined
  /**
       * Whether to show the local timezone at the top of the list of initial timezone suggestions.
       * @default true
       */
  var showLocalTimezone: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
       * See https://www.iana.org/time-zones for more information.
       */
  var value: js.UndefOr[java.lang.String]
  /**
       * Format to use when displaying the selected (or default) timezone within the target element.
       * @default TimezoneDisplayFormat.OFFSET
       */
  var valueDisplayFormat: js.UndefOr[
    atBlueprintjsTimezoneLib.libEsmComponentsTimezoneDashPickerTimezoneDisplayFormatMod.TimezoneDisplayFormat
  ] = js.undefined
  /**
       * Callback invoked when the user selects a timezone.
       */
  def onChange(timezone: java.lang.String): scala.Unit
}

