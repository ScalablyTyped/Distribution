package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItem extends js.Object {
  var event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]
  var item: js.Any
}

object Anon_EventItem {
  @scala.inline
  def apply(event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event], item: js.Any): Anon_EventItem = {
    val __obj = js.Dynamic.literal(event = event, item = item)
  
    __obj.asInstanceOf[Anon_EventItem]
  }
}

