package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.popperJs.mod.Boundary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownOption extends js.Object {
  /**
    * Overflow constraint boundary of the dropdown menu.
    * Accepts the values of 'viewport', 'window', 'scrollParent', or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary | HTMLElement] = js.native
  /**
    * By default, we use Popper.js for dynamic positioning. Disable this with 'static'.
    *
    * @default "dynamic"
    */
  var display: js.UndefOr[dynamic | static] = js.native
  /**
    * Allow Dropdown to flip in case of an overlapping on the reference element.
    * For more information refer to Popper.js's flip docs.
    *
    * @default true
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * Offset of the dropdown relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[
    Double | String | (js.ThisFunction1[/* this */ this.type, /* offset */ OffsetsExtend, OffsetsExtend])
  ] = js.native
  /**
    * Reference element of the dropdown menu. Accepts the values of 'toggle', 'parent', or an HTMLElement reference.
    * For more information refer to Popper.js's referenceObject docs.
    *
    * @default "toggle"
    */
  var reference: js.UndefOr[toggle | parent | HTMLElement] = js.native
}

object DropdownOption {
  @scala.inline
  def apply(): DropdownOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOption]
  }
  @scala.inline
  implicit class DropdownOptionOps[Self <: DropdownOption] (val x: Self) extends AnyVal {
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
    def setBoundary(value: Boundary | HTMLElement): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setDisplay(value: dynamic | static): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setOffset(
      value: Double | String | (js.ThisFunction1[DropdownOption, /* offset */ OffsetsExtend, OffsetsExtend])
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setReference(value: toggle | parent | HTMLElement): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
  
}

