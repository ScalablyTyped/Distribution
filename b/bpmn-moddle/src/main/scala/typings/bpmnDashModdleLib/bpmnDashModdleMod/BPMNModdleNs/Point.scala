package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends TypeDerived {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Point = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

