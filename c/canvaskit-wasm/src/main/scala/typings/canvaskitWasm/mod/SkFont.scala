package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkFont extends SkObject[SkFont] {
  def getScaleX(): Double = js.native
  def getSize(): Double = js.native
  def getSkewX(): Double = js.native
  def getTypeface(): SkTypeface = js.native
  def getWidths(chars: String): js.Array[Double] = js.native
  def measureText(text: String): Double = js.native
  def setScaleX(value: Double): Unit = js.native
  def setSize(value: Double): Unit = js.native
  def setSkewX(value: Double): Unit = js.native
  def setTypeface(value: SkTypeface): Unit = js.native
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
  @scala.inline
  implicit class SkFontOps[Self <: SkFont] (val x: Self) extends AnyVal {
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
    def setGetScaleX(value: () => Double): Self = this.set("getScaleX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Double): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSkewX(value: () => Double): Self = this.set("getSkewX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTypeface(value: () => SkTypeface): Self = this.set("getTypeface", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidths(value: String => js.Array[Double]): Self = this.set("getWidths", js.Any.fromFunction1(value))
    @scala.inline
    def setMeasureText(value: String => Double): Self = this.set("measureText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScaleX(value: Double => Unit): Self = this.set("setScaleX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSize(value: Double => Unit): Self = this.set("setSize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSkewX(value: Double => Unit): Self = this.set("setSkewX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTypeface(value: SkTypeface => Unit): Self = this.set("setTypeface", js.Any.fromFunction1(value))
  }
  
}

