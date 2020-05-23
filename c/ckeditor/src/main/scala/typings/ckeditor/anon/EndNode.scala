package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndNode extends js.Object {
  var endNode: node
  var startNode: node
}

object EndNode {
  @scala.inline
  def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
}

