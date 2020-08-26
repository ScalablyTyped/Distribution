package typings.codemirror.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertLeft extends js.Object {
  /** By default, text typed when the cursor is on top of the bookmark will end up to the right of the bookmark.
    Set this option to true to make it go to the left instead. */
  var insertLeft: js.UndefOr[Boolean] = js.native
  /** Can be used to display a DOM node at the current location of the bookmark (analogous to the replacedWith option to markText). */
  var widget: js.UndefOr[HTMLElement] = js.native
}

object InsertLeft {
  @scala.inline
  def apply(): InsertLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertLeft]
  }
  @scala.inline
  implicit class InsertLeftOps[Self <: InsertLeft] (val x: Self) extends AnyVal {
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
    def setInsertLeft(value: Boolean): Self = this.set("insertLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertLeft: Self = this.set("insertLeft", js.undefined)
    @scala.inline
    def setWidget(value: HTMLElement): Self = this.set("widget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
  
}

