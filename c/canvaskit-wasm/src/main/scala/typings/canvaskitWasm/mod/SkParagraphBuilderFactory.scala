package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraphBuilderFactory extends js.Object {
  def Make(style: SkParagraphStyle, fontManager: SkFontManager): SkParagraphBuilder
}

object SkParagraphBuilderFactory {
  @scala.inline
  def apply(Make: (SkParagraphStyle, SkFontManager) => SkParagraphBuilder): SkParagraphBuilderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction2(Make))
  
    __obj.asInstanceOf[SkParagraphBuilderFactory]
  }
}

