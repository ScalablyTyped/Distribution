package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkTextBlobFactory extends js.Object {
  def MakeFromText(text: String, font: SkFont): SkTextBlob
}

object SkTextBlobFactory {
  @scala.inline
  def apply(MakeFromText: (String, SkFont) => SkTextBlob): SkTextBlobFactory = {
    val __obj = js.Dynamic.literal(MakeFromText = js.Any.fromFunction2(MakeFromText))
  
    __obj.asInstanceOf[SkTextBlobFactory]
  }
}

