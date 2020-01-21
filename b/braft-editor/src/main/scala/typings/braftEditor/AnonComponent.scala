package typings.braftEditor

import typings.braftEditor.braftEditorStrings.component
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends ExtendControlType {
  var component: ReactNode
  var key: String
  var `type`: component
}

object AnonComponent {
  @scala.inline
  def apply(key: String, `type`: component, component: ReactNode = null): AnonComponent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

