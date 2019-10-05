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
    val __obj = js.Dynamic.literal(newChildren = newChildren, node = node, oldChildren = oldChildren)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MutatedChildren]
  }
}

