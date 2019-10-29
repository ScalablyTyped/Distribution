package typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfoMap extends js.Object {
  var source: SourceNodeInfo
  var transform: TransformNodeInfo
}

object NodeInfoMap {
  @scala.inline
  def apply(source: SourceNodeInfo, transform: TransformNodeInfo): NodeInfoMap = {
    val __obj = js.Dynamic.literal(source = source, transform = transform)
  
    __obj.asInstanceOf[NodeInfoMap]
  }
}

