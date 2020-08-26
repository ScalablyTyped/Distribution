package typings.cliBox.mod

import typings.cliBox.cliBoxStrings.bottom
import typings.cliBox.cliBoxStrings.center
import typings.cliBox.cliBoxStrings.left
import typings.cliBox.cliBoxStrings.middle
import typings.cliBox.cliBoxStrings.right
import typings.cliBox.cliBoxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  var autoEOL: js.UndefOr[Boolean] = js.native
  var hAlign: js.UndefOr[left | middle | right] = js.native
  var stretch: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var vAlign: js.UndefOr[top | center | bottom] = js.native
}

object Text {
  @scala.inline
  def apply(): Text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
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
    def setAutoEOL(value: Boolean): Self = this.set("autoEOL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEOL: Self = this.set("autoEOL", js.undefined)
    @scala.inline
    def setHAlign(value: left | middle | right): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
    @scala.inline
    def setStretch(value: Boolean): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVAlign(value: top | center | bottom): Self = this.set("vAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVAlign: Self = this.set("vAlign", js.undefined)
  }
  
}

