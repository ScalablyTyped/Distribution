package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkRRect extends js.Object {
  var rect: SkRect
  var rx1: Double
  var rx2: Double
  var rx3: Double
  var rx4: Double
  var ry1: Double
  var ry2: Double
  var ry3: Double
  var ry4: Double
}

object SkRRect {
  @scala.inline
  def apply(
    rect: SkRect,
    rx1: Double,
    rx2: Double,
    rx3: Double,
    rx4: Double,
    ry1: Double,
    ry2: Double,
    ry3: Double,
    ry4: Double
  ): SkRRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any], rx1 = rx1.asInstanceOf[js.Any], rx2 = rx2.asInstanceOf[js.Any], rx3 = rx3.asInstanceOf[js.Any], rx4 = rx4.asInstanceOf[js.Any], ry1 = ry1.asInstanceOf[js.Any], ry2 = ry2.asInstanceOf[js.Any], ry3 = ry3.asInstanceOf[js.Any], ry4 = ry4.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkRRect]
  }
}

