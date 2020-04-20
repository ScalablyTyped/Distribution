package typings.baseui.dndListMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var items: js.Array[ReactNode]
}

object State {
  @scala.inline
  def apply(items: js.Array[ReactNode]): State = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

