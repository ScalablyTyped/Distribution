package typings.blueprintjsCore.panelStackMod

import typings.blueprintjsCore.panelPropsMod.IPanel
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelStackProps extends IProps {
  
  /**
    * The initial panel to show on mount. This panel cannot be removed from the
    * stack and will appear when the stack is empty.
    * This prop is only used in uncontrolled mode and is thus mutually
    * exclusive with the `stack` prop.
    */
  var initialPanel: js.UndefOr[IPanel[_]] = js.native
  
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  var onClose: js.UndefOr[js.Function1[/* removedPanel */ IPanel[js.Object], Unit]] = js.native
  
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  var onOpen: js.UndefOr[js.Function1[/* addedPanel */ IPanel[js.Object], Unit]] = js.native
  
  /**
    * If false, PanelStack will render all panels in the stack to the DOM, allowing their
    * React component trees to maintain state as a user navigates through the stack.
    * Panels other than the currently active one will be invisible.
    * @default true
    */
  var renderActivePanelOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the header with the "back" button in each panel.
    * @default true
    */
  var showPanelHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * The full stack of panels in controlled mode. The last panel in the stack
    * will be displayed.
    */
  var stack: js.UndefOr[js.Array[IPanel[_]]] = js.native
}
object IPanelStackProps {
  
  @scala.inline
  def apply(): IPanelStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelStackProps]
  }
  
  @scala.inline
  implicit class IPanelStackPropsOps[Self <: IPanelStackProps] (val x: Self) extends AnyVal {
    
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
    def setInitialPanel(value: IPanel[_]): Self = this.set("initialPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPanel: Self = this.set("initialPanel", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* removedPanel */ IPanel[js.Object] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* addedPanel */ IPanel[js.Object] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setRenderActivePanelOnly(value: Boolean): Self = this.set("renderActivePanelOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderActivePanelOnly: Self = this.set("renderActivePanelOnly", js.undefined)
    
    @scala.inline
    def setShowPanelHeader(value: Boolean): Self = this.set("showPanelHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPanelHeader: Self = this.set("showPanelHeader", js.undefined)
    
    @scala.inline
    def setStackVarargs(value: IPanel[js.Any]*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[IPanel[_]]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
