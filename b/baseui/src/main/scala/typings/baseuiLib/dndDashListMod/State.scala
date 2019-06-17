package typings
package baseuiLib.dndDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var items: js.Array[reactLib.reactMod.ReactNode]
}

object State {
  @scala.inline
  def apply(items: js.Array[reactLib.reactMod.ReactNode]): State = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[State]
  }
}

