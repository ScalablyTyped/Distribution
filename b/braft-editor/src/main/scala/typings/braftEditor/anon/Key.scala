package typings.braftEditor.anon

import typings.braftEditor.mod.BuiltInControlType
import typings.braftEditor.mod.ControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends ControlType {
  var key: BuiltInControlType
  var text: js.UndefOr[String | ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: BuiltInControlType, text: String | ReactNode = null, title: String = null): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

