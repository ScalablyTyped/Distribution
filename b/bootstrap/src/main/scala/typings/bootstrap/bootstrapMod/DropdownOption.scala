package typings.bootstrap.bootstrapMod

import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.popperDotJs.popperDotJsMod.Boundary
import typings.std.HTMLElement
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
  var boundary: js.UndefOr[Boundary | HTMLElement] = js.undefined
  /**
    * By default, we use Popper.js for dynamic positioning. Disable this with 'static'.
    *
    * @default "dynamic"
    */
  var display: js.UndefOr[dynamic | static] = js.undefined
  /**
    * Allow Dropdown to flip in case of an overlapping on the reference element.
    * For more information refer to Popper.js's flip docs.
    *
    * @default true
    */
  var flip: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of the dropdown relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[
    Double | String | (js.ThisFunction1[/* this */ this.type, /* offset */ OffsetsExtend, OffsetsExtend])
  ] = js.undefined
  /**
    * Reference element of the dropdown menu. Accepts the values of 'toggle', 'parent', or an HTMLElement reference.
    * For more information refer to Popper.js's referenceObject docs.
    *
    * @default "toggle"
    */
  var reference: js.UndefOr[toggle | parent | HTMLElement] = js.undefined
}

object DropdownOption {
  @scala.inline
  def apply(
    boundary: Boundary | HTMLElement = null,
    display: dynamic | static = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    offset: Double | String | (js.ThisFunction1[DropdownOption, /* offset */ OffsetsExtend, OffsetsExtend]) = null,
    reference: toggle | parent | HTMLElement = null
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

