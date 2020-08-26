package typings.basicscroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /**
    * Direct mode.
    * @default false
    */
  var direct: js.UndefOr[Boolean | Element] = js.native
  /**
    * DOM element/node.
    * @default null
    */
  var elem: js.UndefOr[Element | Null] = js.native
  /**
    * Start position.
    * @default null
    */
  var from: AnimatedType = js.native
  /**
    * Executes when the user scrolls and the viewport is within the given start and stop position
    */
  var inside: js.UndefOr[CallbackFunction] = js.native
  /**
    * Executes when the user scrolls and the viewport is outside the given start and stop position
    */
  var outside: js.UndefOr[CallbackFunction] = js.native
  var props: js.UndefOr[Props] = js.native
  /**
    * Stop position.
    * @default null
    */
  var to: AnimatedType = js.native
  /**
    * Track window size changes.
    * @default true
    */
  var track: js.UndefOr[Boolean] = js.native
}

object Data {
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setDirect(value: Boolean | Element): Self = this.set("direct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirect: Self = this.set("direct", js.undefined)
    @scala.inline
    def setElem(value: Element): Self = this.set("elem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    @scala.inline
    def setElemNull: Self = this.set("elem", null)
    @scala.inline
    def setFrom(value: AnimatedType): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    @scala.inline
    def setInside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = this.set("inside", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInside: Self = this.set("inside", js.undefined)
    @scala.inline
    def setOutside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = this.set("outside", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOutside: Self = this.set("outside", js.undefined)
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setTo(value: AnimatedType): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setToNull: Self = this.set("to", null)
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
  
}

