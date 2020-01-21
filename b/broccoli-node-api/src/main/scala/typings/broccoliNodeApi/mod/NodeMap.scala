package typings.broccoliNodeApi.mod

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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeMap]
  }
}

