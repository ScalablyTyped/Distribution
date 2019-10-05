package typings.blessed.blessedMod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListbarCommand extends js.Object {
  var key: String
  def callback(): Unit
}

object ListbarCommand {
  @scala.inline
  def apply(callback: () => Unit, key: String): ListbarCommand = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), key = key)
  
    __obj.asInstanceOf[ListbarCommand]
  }
}

