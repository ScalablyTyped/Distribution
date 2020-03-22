package typings.azdata.mod.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogMessage extends js.Object {
  val description: js.UndefOr[String] = js.undefined
  val level: js.UndefOr[MessageLevel] = js.undefined
  val text: String
}

object DialogMessage {
  @scala.inline
  def apply(text: String, description: String = null, level: MessageLevel = null): DialogMessage = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogMessage]
  }
}

