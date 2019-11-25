package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.observer

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutatedChildren extends js.Object {
  var newChildren: js.Array[Node]
  var node: Element
  var oldChildren: js.Array[Node]
  var `type`: String
}

object MutatedChildren {
  @scala.inline
  def apply(newChildren: js.Array[Node], node: Element, oldChildren: js.Array[Node], `type`: String): MutatedChildren = {
    val __obj = js.Dynamic.literal(newChildren = newChildren.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldChildren = oldChildren.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatedChildren]
  }
}

