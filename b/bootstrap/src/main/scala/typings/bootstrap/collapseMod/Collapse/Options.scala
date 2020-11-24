package typings.bootstrap.collapseMod.Collapse

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If parent is provided, then all collapsible elements under the specified
    * parent will be closed when this collapsible item is shown. (similar to
    * traditional accordion behavior - this is dependent on the card class).
    * The attribute has to be set on the target collapsible area.
    *
    * @default false
    */
  var parent: String | Element | JQuery[HTMLElement] = js.native
  
  /**
    * Toggles the collapsible element on invocation
    *
    * @default true
    */
  var toggle: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(parent: String | Element | JQuery[HTMLElement], toggle: Boolean): Options = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
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
    def setParent(value: String | Element | JQuery[HTMLElement]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
  }
}
