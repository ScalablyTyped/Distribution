package typings.braftEditor.anon

import typings.braftEditor.braftEditorStrings.component
import typings.braftEditor.mod.ExtendControlType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends ExtendControlType {
  var component: ReactNode
  var key: String
  var `type`: component
}

object Component {
  @scala.inline
  def apply(key: String, `type`: component, component: ReactNode = null): Component = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
}

