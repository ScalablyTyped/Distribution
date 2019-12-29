package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkFont extends SkObject[SkFont] {
  def getScaleX(): Double
  def getSize(): Double
  def getSkewX(): Double
  def getTypeface(): SkTypeface
  def getWidths(chars: String): js.Array[Double]
  def measureText(text: String): Double
  def setScaleX(value: Double): Unit
  def setSize(value: Double): Unit
  def setSkewX(value: Double): Unit
  def setTypeface(value: SkTypeface): Unit
}

object SkFont {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getScaleX: () => Double,
    getSize: () => Double,
    getSkewX: () => Double,
    getTypeface: () => SkTypeface,
    getWidths: String => js.Array[Double],
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    measureText: String => Double,
    setScaleX: Double => Unit,
    setSize: Double => Unit,
    setSkewX: Double => Unit,
    setTypeface: SkTypeface => Unit
  ): SkFont = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getScaleX = js.Any.fromFunction0(getScaleX), getSize = js.Any.fromFunction0(getSize), getSkewX = js.Any.fromFunction0(getSkewX), getTypeface = js.Any.fromFunction0(getTypeface), getWidths = js.Any.fromFunction1(getWidths), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), measureText = js.Any.fromFunction1(measureText), setScaleX = js.Any.fromFunction1(setScaleX), setSize = js.Any.fromFunction1(setSize), setSkewX = js.Any.fromFunction1(setSkewX), setTypeface = js.Any.fromFunction1(setTypeface))
  
    __obj.asInstanceOf[SkFont]
  }
}

