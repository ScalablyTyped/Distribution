package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraphBuilder extends SkObject[SkParagraphBuilder] {
  def addText(value: String): Unit
  def build(): SkParagraph
  def pop(): Unit
  def pushStyle(value: SkTextStyle): Unit
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
}

