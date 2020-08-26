package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mozosxfontsmoothing extends js.Object {
  var `-moz-osx-font-smoothing`: String = js.native
  var `-webkit-font-smoothing`: String = js.native
  var fontFamily: String = js.native
  var fontWeight: Double = js.native
  var textRendering: String = js.native
}

object Mozosxfontsmoothing {
  @scala.inline
  def apply(
    `-moz-osx-font-smoothing`: String,
    `-webkit-font-smoothing`: String,
    fontFamily: String,
    fontWeight: Double,
    textRendering: String
  ): Mozosxfontsmoothing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any])
    __obj.updateDynamic("-moz-osx-font-smoothing")(`-moz-osx-font-smoothing`.asInstanceOf[js.Any])
    __obj.updateDynamic("-webkit-font-smoothing")(`-webkit-font-smoothing`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mozosxfontsmoothing]
  }
  @scala.inline
  implicit class MozosxfontsmoothingOps[Self <: Mozosxfontsmoothing] (val x: Self) extends AnyVal {
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
    def `set-moz-osx-font-smoothing`(value: String): Self = this.set("-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def `set-webkit-font-smoothing`(value: String): Self = this.set("-webkit-font-smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRendering(value: String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
  }
  
}

