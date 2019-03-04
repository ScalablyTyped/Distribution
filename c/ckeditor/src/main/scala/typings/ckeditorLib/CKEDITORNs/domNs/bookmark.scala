package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bookmark extends js.Object {
  var collapsed: scala.Boolean
  var endNode: node | java.lang.String
  var serializable: scala.Boolean
  var startNode: node | java.lang.String
}

object bookmark {
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    endNode: node | java.lang.String,
    serializable: scala.Boolean,
    startNode: node | java.lang.String
  ): bookmark = {
    val __obj = js.Dynamic.literal(collapsed = collapsed, endNode = endNode.asInstanceOf[js.Any], serializable = serializable, startNode = startNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[bookmark]
  }
}

