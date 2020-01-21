package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkRect extends js.Object {
  var fBottom: Double
  var fLeft: Double
  var fRight: Double
  var fTop: Double
}

object SkRect {
  @scala.inline
  def apply(fBottom: Double, fLeft: Double, fRight: Double, fTop: Double): SkRect = {
    val __obj = js.Dynamic.literal(fBottom = fBottom.asInstanceOf[js.Any], fLeft = fLeft.asInstanceOf[js.Any], fRight = fRight.asInstanceOf[js.Any], fTop = fTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkRect]
  }
}

