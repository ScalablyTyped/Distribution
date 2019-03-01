package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOption extends js.Object {
  /**
    * Overflow constraint boundary of the dropdown menu.
    * Accepts the values of 'viewport', 'window', 'scrollParent', or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[popperDotJsLib.popperDotJsMod.Boundary | stdLib.HTMLElement] = js.undefined
  /**
    * By default, we use Popper.js for dynamic positioning. Disable this with 'static'.
    *
    * @default "dynamic"
    */
  var display: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.dynamic | bootstrapLib.bootstrapLibStrings.static
  ] = js.undefined
  /**
    * Allow Dropdown to flip in case of an overlapping on the reference element.
    * For more information refer to Popper.js's flip docs.
    *
    * @default true
    */
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset of the dropdown relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[
    scala.Double | java.lang.String | (js.ThisFunction1[/* this */ this.type, /* offset */ OffsetsExtend, OffsetsExtend])
  ] = js.undefined
  /**
    * Reference element of the dropdown menu. Accepts the values of 'toggle', 'parent', or an HTMLElement reference.
    * For more information refer to Popper.js's referenceObject docs.
    *
    * @default "toggle"
    */
  var reference: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.toggle | bootstrapLib.bootstrapLibStrings.parent | stdLib.HTMLElement
  ] = js.undefined
}

object DropdownOption {
  @scala.inline
  def apply(
    boundary: popperDotJsLib.popperDotJsMod.Boundary | stdLib.HTMLElement = null,
    display: bootstrapLib.bootstrapLibStrings.dynamic | bootstrapLib.bootstrapLibStrings.static = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Double | java.lang.String | (js.ThisFunction1[DropdownOption, /* offset */ OffsetsExtend, OffsetsExtend]) = null,
    reference: bootstrapLib.bootstrapLibStrings.toggle | bootstrapLib.bootstrapLibStrings.parent | stdLib.HTMLElement = null
  ): DropdownOption = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOption]
  }
}

