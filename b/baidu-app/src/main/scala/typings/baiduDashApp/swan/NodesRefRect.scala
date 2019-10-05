package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesRefRect extends RectArea {
  /** 节点的dataset */
  var dataset: js.Any
  /** 节点的ID */
  var id: String
}

object NodesRefRect {
  @scala.inline
  def apply(
    bottom: Double,
    dataset: js.Any,
    height: Double,
    id: String,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal(bottom = bottom, dataset = dataset, height = height, id = id, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[NodesRefRect]
  }
}

