package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkImageInfo extends js.Object {
  var alphaType: SkAlphaType
  var colorType: SkColorType
  var height: Double
  var width: Double
}

object SkImageInfo {
  @scala.inline
  def apply(alphaType: SkAlphaType, colorType: SkColorType, height: Double, width: Double): SkImageInfo = {
    val __obj = js.Dynamic.literal(alphaType = alphaType.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkImageInfo]
  }
}

