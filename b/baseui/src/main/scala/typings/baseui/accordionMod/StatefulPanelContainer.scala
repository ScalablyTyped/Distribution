package typings.baseui.accordionMod

import typings.baseui.baseuiStrings.expand
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/accordion", "StatefulPanelContainer")
@js.native
class StatefulPanelContainer protected ()
  extends Component[StatefulPanelContainerProps, PanelState, js.Any] {
  def this(props: StatefulPanelContainerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StatefulPanelContainerProps, context: js.Any) = this()
  
  @JSName("internalSetState")
  def internalSetState_expand(`type`: expand, changes: PanelState): Unit = js.native
  
  def onChange(args: js.Any): Unit = js.native
}
