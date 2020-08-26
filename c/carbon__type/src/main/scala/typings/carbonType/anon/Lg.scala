package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lg extends js.Object {
  var fontFamily: String = js.native
  var fontSize: String = js.native
  var fontWeight: Double = js.native
  var letterSpacing: Double = js.native
  var lg: LineHeight = js.native
  var lineHeight: String = js.native
  var max: LineHeight = js.native
}

object Lg {
  @scala.inline
  def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lg: LineHeight,
    lineHeight: String,
    max: LineHeight
  ): Lg = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  @scala.inline
  implicit class LgOps[Self <: Lg] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLg(value: LineHeight): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: LineHeight): Self = this.set("max", value.asInstanceOf[js.Any])
  }
  
}

