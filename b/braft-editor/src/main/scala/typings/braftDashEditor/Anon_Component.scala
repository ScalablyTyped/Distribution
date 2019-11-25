package typings.braftDashEditor

import typings.braftDashEditor.braftDashEditorMod.ExtendControlType
import typings.braftDashEditor.braftDashEditorStrings.component
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends ExtendControlType {
  var component: ReactNode
  var key: String
  var `type`: component
}

object Anon_Component {
  @scala.inline
  def apply(key: String, `type`: component, component: ReactNode = null): Anon_Component = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Component]
  }
}

