package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkTextBlobFactory extends js.Object {
  def MakeFromText(text: String, font: SkFont): SkTextBlob = js.native
}

object SkTextBlobFactory {
  @scala.inline
  def apply(MakeFromText: (String, SkFont) => SkTextBlob): SkTextBlobFactory = {
    val __obj = js.Dynamic.literal(MakeFromText = js.Any.fromFunction2(MakeFromText))
    __obj.asInstanceOf[SkTextBlobFactory]
  }
  @scala.inline
  implicit class SkTextBlobFactoryOps[Self <: SkTextBlobFactory] (val x: Self) extends AnyVal {
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
    def setMakeFromText(value: (String, SkFont) => SkTextBlob): Self = this.set("MakeFromText", js.Any.fromFunction2(value))
  }
  
}

