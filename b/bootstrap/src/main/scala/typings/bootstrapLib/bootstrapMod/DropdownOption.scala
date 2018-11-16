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

