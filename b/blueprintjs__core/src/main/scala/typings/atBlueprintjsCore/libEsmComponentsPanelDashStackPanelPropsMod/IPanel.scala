package typings.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelPropsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel[P] extends js.Object {
  /**
    * The component type to render for this panel. This must be a reference to
    * the component class or SFC, _not_ a JSX element, so it can be re-created
    * dynamically when needed.
    */
  var component: ComponentType[P with IPanelProps]
  /**
    * The props passed to the component type when it is rendered. The methods
    * in `IPanelProps` will be injected by `PanelStack`.
    */
  var props: js.UndefOr[P] = js.undefined
  /**
    * The title to be displayed above this panel. It is also used as the text
    * of the back button for any panel opened by this panel.
    */
  var title: js.UndefOr[ReactNode] = js.undefined
}

object IPanel {
  @scala.inline
  def apply[P](component: ComponentType[P with IPanelProps], props: P = null, title: ReactNode = null): IPanel[P] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel[P]]
  }
}

