package typings.broccoliNodeApi.mod

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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoMap]
  }
}

