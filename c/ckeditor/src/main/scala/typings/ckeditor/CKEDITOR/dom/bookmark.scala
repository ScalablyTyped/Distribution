package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bookmark extends js.Object {
  var collapsed: Boolean
  var endNode: node | String
  var serializable: Boolean
  var startNode: node | String
}

object bookmark {
  @scala.inline
  def apply(collapsed: Boolean, endNode: node | String, serializable: Boolean, startNode: node | String): bookmark = {
    val __obj = js.Dynamic.literal(collapsed = collapsed, endNode = endNode.asInstanceOf[js.Any], serializable = serializable, startNode = startNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[bookmark]
  }
}

