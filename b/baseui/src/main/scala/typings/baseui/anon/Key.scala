package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var expanded: js.Array[typings.react.mod.Key]
  var key: typings.react.mod.Key
}

object Key {
  @scala.inline
  def apply(expanded: js.Array[typings.react.mod.Key], key: typings.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

