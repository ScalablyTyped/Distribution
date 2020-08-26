package typings.bootstrap.mod

import typings.bootstrap.mod.global.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseOption extends js.Object {
  /**
    * If parent is provided, then all collapsible elements under the specified parent will be closed when
    * this collapsible item is shown. (similar to traditional accordion behavior - this is dependent on the card class).
    * The attribute has to be set on the target collapsible area.
    *
    * @default ""
    */
  var parent: js.UndefOr[String | JQuery[HTMLElement] | Element] = js.native
  /**
    * Toggles the collapsible element on invocation.
    *
    * @default true
    */
  var toggle: js.UndefOr[Boolean] = js.native
}

object CollapseOption {
  @scala.inline
  def apply(): CollapseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseOption]
  }
  @scala.inline
  implicit class CollapseOptionOps[Self <: CollapseOption] (val x: Self) extends AnyVal {
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
    def setParent(value: String | JQuery[HTMLElement] | Element): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

