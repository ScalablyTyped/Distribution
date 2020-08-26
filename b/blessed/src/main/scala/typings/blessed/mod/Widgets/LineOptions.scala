package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.horizontal
import typings.blessed.blessedStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple line which can be line or bg styled.
  */
@js.native
trait LineOptions extends BoxOptions {
  /**
    * Can be vertical or horizontal.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  /**
    * Treated the same as a border object. (attributes can be contained in style).
    */
  var `type`: js.UndefOr[String] = js.native
}

object LineOptions {
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  @scala.inline
  implicit class LineOptionsOps[Self <: LineOptions] (val x: Self) extends AnyVal {
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
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

