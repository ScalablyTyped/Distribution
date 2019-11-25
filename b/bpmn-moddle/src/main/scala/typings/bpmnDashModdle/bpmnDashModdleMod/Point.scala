package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends TypeDerived {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Point {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, height: Double, width: Double, x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

