package typings.baseui

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var expanded: js.Array[Key]
  var key: Key
}

object AnonKey {
  @scala.inline
  def apply(expanded: js.Array[Key], key: Key): AnonKey = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

