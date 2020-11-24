package typings.bootstrap.dropdownMod.Dropdown

import typings.bootstrap.bootstrapStrings.dynamic
import typings.bootstrap.bootstrapStrings.parent
import typings.bootstrap.bootstrapStrings.static
import typings.bootstrap.bootstrapStrings.toggle
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.PopperOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Overflow constraint boundary of the dropdown menu. Accepts the values
    * of 'viewport', 'window', 'scrollParent', or an HTMLElement reference
    * (JavaScript only). For more information refer to Popper.js's
    * preventOverflow docs.
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..preventOverflow.boundariesElement}
    * @default "scrollParent"
    */
  var boundary: Boundary | Element = js.native
  
  /**
    * By default, we use Popper.js for dynamic positioning. Disable this
    * with static.
    *
    * @default "dynamic"
    */
  var display: dynamic | static = js.native
  
  /**
    * Allow Dropdown to flip in case of an overlapping on the reference
    * element. For more information refer to Popper.js's flip docs.
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..flip.enabled}
    * @default true
    */
  var flip: Boolean = js.native
  
  /**
    * Offset of the dropdown relative to its target.
    *
    * When a function is used to determine the offset, it is called with an
    * object containing the offset data as its first argument. The function
    * must return an object with the same structure. The triggering element
    * DOM node is passed as the second argument.
    *
    * For more information refer to Popper.js's offset docs.
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..offset.offset}
    * @default 0
    */
  var offset: Double = js.native
  
  /**
    * To change Bootstrap's default Popper.js config, see Popper.js's
    * configuration
    *
    * @see {@link https://popper.js.org/docs/v1/#Popper.Defaults}
    * @default null
    */
  var popperConfig: PopperOptions | Null = js.native
  
  /**
    * Reference element of the dropdown menu. Accepts the values of
    * 'toggle', 'parent', or an HTMLElement reference. For more information
    * refer to Popper.js's referenceObject docs.
    *
    * @see {@link https://popper.js.org/docs/v1/#referenceObject}
    * @default "toggle"
    */
  var reference: toggle | parent | Element = js.native
}
object Options {
  
  @scala.inline
  def apply(
    boundary: Boundary | Element,
    display: dynamic | static,
    flip: Boolean,
    offset: Double,
    reference: toggle | parent | Element
  ): Options = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBoundary(value: Boundary | Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: dynamic | static): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: toggle | parent | Element): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperConfig(value: PopperOptions): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperConfigNull: Self = this.set("popperConfig", null)
  }
}
