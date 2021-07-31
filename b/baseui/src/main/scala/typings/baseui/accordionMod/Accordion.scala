package typings.baseui.accordionMod

import typings.baseui.baseuiStrings.expand
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/accordion", "Accordion")
@js.native
class Accordion protected ()
  extends Component[AccordionProps, AccordionState, js.Any] {
  def this(props: AccordionProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AccordionProps, context: js.Any) = this()
  
  def getItems(): ReactNode = js.native
  
  @JSName("internalSetState")
  def internalSetState_expand(`type`: expand, changes: AccordionState): Unit = js.native
  
  def onPanelChange(
    key: Key,
    onChange: js.Function0[js.Any],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
}
