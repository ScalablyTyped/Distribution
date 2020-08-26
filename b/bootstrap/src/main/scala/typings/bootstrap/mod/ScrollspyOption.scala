package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.bootstrap.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollspyOption extends js.Object {
  /**
    * Finds which section the spied element is in:
    * * `auto` will choose the best method get scroll coordinates.
    * * `offset` will use jQuery offset method to get scroll coordinates.
    * * `position` will use jQuery position method to get scroll coordinates.
    *
    * @default "auto"
    */
  var method: js.UndefOr[auto | offset | position] = js.native
  /**
    * Pixels to offset from top when calculating position of scroll.
    *
    * @default 10
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * A selector of the parent element or the parent element itself
    * of any Bootstrap `.nav` or `.list-group` component.
    *
    * @default ""
    */
  var target: js.UndefOr[String | JQuery[Element] | Element] = js.native
}

object ScrollspyOption {
  @scala.inline
  def apply(): ScrollspyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollspyOption]
  }
  @scala.inline
  implicit class ScrollspyOptionOps[Self <: ScrollspyOption] (val x: Self) extends AnyVal {
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
    def setMethod(value: auto | offset | position): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTarget(value: String | JQuery[Element] | Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

