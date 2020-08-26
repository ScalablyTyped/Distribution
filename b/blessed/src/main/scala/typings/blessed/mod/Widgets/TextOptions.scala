package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends ElementOptions {
  /**
    * Text alignment: left, center, or right.
    */
  @JSName("align")
  var align_TextOptions: js.UndefOr[TAlign] = js.native
  /**
    * Fill the entire line with chosen bg until parent bg ends, even if there
    * is not enough text to fill the entire width.
    */
  var fill: js.UndefOr[Boolean] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: TAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
  }
  
}

