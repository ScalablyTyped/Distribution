package typings.chromeApps.chrome.app

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundsSpecification extends js.Object {
  /** The height of the content or window. */
  var height: js.UndefOr[integer] = js.native
  /** The X coordinate of the content or window. */
  var left: js.UndefOr[integer] = js.native
  /** The maximum height of the content or window. */
  var maxHeight: js.UndefOr[integer] = js.native
  /** The maximum width of the content or window. */
  var maxWidth: js.UndefOr[integer] = js.native
  /** The minimum height of the content or window. */
  var minHeight: js.UndefOr[integer] = js.native
  /** The minimum width of the content or window. */
  var minWidth: js.UndefOr[integer] = js.native
  /** The Y coordinate of the content or window. */
  var top: js.UndefOr[integer] = js.native
  /** The width of the content or window. */
  var width: js.UndefOr[integer] = js.native
}

object BoundsSpecification {
  @scala.inline
  def apply(): BoundsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundsSpecification]
  }
  @scala.inline
  implicit class BoundsSpecificationOps[Self <: BoundsSpecification] (val x: Self) extends AnyVal {
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
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: integer): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMaxHeight(value: integer): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: integer): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: integer): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: integer): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setTop(value: integer): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

