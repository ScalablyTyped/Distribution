package typings.blueprintjsCore.panelPropsMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanel[P] extends js.Object {
  
  /**
    * The component type to render for this panel. This must be a reference to
    * the component class or SFC, _not_ a JSX element, so it can be re-created
    * dynamically when needed.
    */
  var component: ComponentType[P with IPanelProps] = js.native
  
  /**
    * HTML title to be passed to the <Text> component
    */
  var htmlTitle: js.UndefOr[String] = js.native
  
  /**
    * The props passed to the component type when it is rendered. The methods
    * in `IPanelProps` will be injected by `PanelStack`.
    */
  var props: js.UndefOr[P] = js.native
  
  /**
    * The title to be displayed above this panel. It is also used as the text
    * of the back button for any panel opened by this panel.
    */
  var title: js.UndefOr[ReactNode] = js.native
}
object IPanel {
  
  @scala.inline
  def apply[P](component: ComponentType[P with IPanelProps]): IPanel[P] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel[P]]
  }
  
  @scala.inline
  implicit class IPanelOps[Self <: IPanel[_], P] (val x: Self with IPanel[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: ComponentType[P with IPanelProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
