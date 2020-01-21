package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkParagraph extends SkObject[SkParagraph] {
  def getGlyphPositionAtCoordinate(x: Double, y: Double): SkGlyphPosition
  def getHeight(): Double
  def getWordBoundary(index: Double): SkWordBoundary
  def layout(maxWidth: Double): Unit
}

object SkParagraph {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getGlyphPositionAtCoordinate: (Double, Double) => SkGlyphPosition,
    getHeight: () => Double,
    getWordBoundary: Double => SkWordBoundary,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    layout: Double => Unit
  ): SkParagraph = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getGlyphPositionAtCoordinate = js.Any.fromFunction2(getGlyphPositionAtCoordinate), getHeight = js.Any.fromFunction0(getHeight), getWordBoundary = js.Any.fromFunction1(getWordBoundary), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), layout = js.Any.fromFunction1(layout))
  
    __obj.asInstanceOf[SkParagraph]
  }
}

