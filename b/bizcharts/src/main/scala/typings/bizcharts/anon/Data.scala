package typings.bizcharts.anon

import typings.antvG2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var geom: js.Any
  var preData: js.Any
  var preShape: Shape
  var shape: Shape
}

object Data {
  @scala.inline
  def apply(data: js.Any, geom: js.Any, preData: js.Any, preShape: Shape, shape: Shape): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geom = geom.asInstanceOf[js.Any], preData = preData.asInstanceOf[js.Any], preShape = preShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

