package typings.baseui.tabsMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var activeKey: Key
}

object State {
  @scala.inline
  def apply(activeKey: Key): State = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

