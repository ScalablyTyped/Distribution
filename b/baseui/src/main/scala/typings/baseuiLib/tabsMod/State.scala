package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var activeKey: reactLib.reactMod.Key
}

object State {
  @scala.inline
  def apply(activeKey: reactLib.reactMod.Key): State = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

