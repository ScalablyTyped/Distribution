package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mozosxfontsmoothing extends js.Object {
  var `-moz-osx-font-smoothing`: String
  var `-webkit-font-smoothing`: String
  var fontFamily: String
  var fontWeight: Double
  var textRendering: String
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
}

