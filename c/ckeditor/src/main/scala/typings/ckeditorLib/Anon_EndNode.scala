package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndNode extends js.Object {
  var endNode: ckeditorLib.CKEDITORNs.domNs.node
  var startNode: ckeditorLib.CKEDITORNs.domNs.node
}

object Anon_EndNode {
  @scala.inline
  def apply(endNode: ckeditorLib.CKEDITORNs.domNs.node, startNode: ckeditorLib.CKEDITORNs.domNs.node): Anon_EndNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endNode")(endNode)
    __obj.updateDynamic("startNode")(startNode)
    __obj.asInstanceOf[Anon_EndNode]
  }
}

