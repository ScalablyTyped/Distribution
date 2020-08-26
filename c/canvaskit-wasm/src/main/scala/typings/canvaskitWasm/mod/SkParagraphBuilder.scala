package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkParagraphBuilder extends SkObject[SkParagraphBuilder] {
  def addText(value: String): Unit = js.native
  def build(): SkParagraph = js.native
  def pop(): Unit = js.native
  def pushStyle(value: SkTextStyle): Unit = js.native
}

object SkParagraphBuilder {
  @scala.inline
  def apply(
    addText: String => Unit,
    build: () => SkParagraph,
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    pop: () => Unit,
    pushStyle: SkTextStyle => Unit
  ): SkParagraphBuilder = {
    val __obj = js.Dynamic.literal(addText = js.Any.fromFunction1(addText), build = js.Any.fromFunction0(build), delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), pop = js.Any.fromFunction0(pop), pushStyle = js.Any.fromFunction1(pushStyle))
    __obj.asInstanceOf[SkParagraphBuilder]
  }
  @scala.inline
  implicit class SkParagraphBuilderOps[Self <: SkParagraphBuilder] (val x: Self) extends AnyVal {
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
    def setAddText(value: String => Unit): Self = this.set("addText", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => SkParagraph): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => Unit): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPushStyle(value: SkTextStyle => Unit): Self = this.set("pushStyle", js.Any.fromFunction1(value))
  }
  
}

