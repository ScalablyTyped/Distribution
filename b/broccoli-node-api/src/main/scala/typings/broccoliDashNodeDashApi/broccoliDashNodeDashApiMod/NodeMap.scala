package typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeMap extends js.Object {
  var source: SourceNode
  var transform: TransformNode
}

object NodeMap {
  @scala.inline
  def apply(source: SourceNode, transform: TransformNode): NodeMap = {
    val __obj = js.Dynamic.literal(source = source, transform = transform)
  
    __obj.asInstanceOf[NodeMap]
  }
}

