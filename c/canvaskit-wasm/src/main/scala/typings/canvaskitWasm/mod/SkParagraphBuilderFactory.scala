package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkParagraphBuilderFactory extends js.Object {
  def Make(style: SkParagraphStyle, fontManager: SkFontManager): SkParagraphBuilder = js.native
}

object SkParagraphBuilderFactory {
  @scala.inline
  def apply(Make: (SkParagraphStyle, SkFontManager) => SkParagraphBuilder): SkParagraphBuilderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction2(Make))
    __obj.asInstanceOf[SkParagraphBuilderFactory]
  }
  @scala.inline
  implicit class SkParagraphBuilderFactoryOps[Self <: SkParagraphBuilderFactory] (val x: Self) extends AnyVal {
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
    def setMake(value: (SkParagraphStyle, SkFontManager) => SkParagraphBuilder): Self = this.set("Make", js.Any.fromFunction2(value))
  }
  
}

