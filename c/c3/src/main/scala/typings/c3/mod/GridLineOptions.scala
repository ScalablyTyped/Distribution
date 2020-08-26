package typings.c3.mod

import typings.c3.c3Strings.end
import typings.c3.c3Strings.middle
import typings.c3.c3Strings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLineOptions extends js.Object {
  /** Class to give the grid line for styling. */
  var `class`: js.UndefOr[String] = js.native
  var position: js.UndefOr[start | end | middle] = js.native
  var text: js.UndefOr[String] = js.native
  /** Value to place the grid line at. */
  var value: String | Double | Date = js.native
}

object GridLineOptions {
  @scala.inline
  def apply(value: String | Double | Date): GridLineOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
  @scala.inline
  implicit class GridLineOptionsOps[Self <: GridLineOptions] (val x: Self) extends AnyVal {
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
    def setValue(value: String | Double | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setPosition(value: start | end | middle): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

