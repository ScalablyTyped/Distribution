package typings.baseui

import typings.baseui.anon.Expanded
import typings.baseui.anon.PartialAccordionProps
import typings.baseui.typesMod.AccordionProps
import typings.baseui.typesMod.AccordionState
import typings.baseui.typesMod.StateChangeType
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionMod {
  
  @JSImport("baseui/accordion/accordion", JSImport.Default)
  @js.native
  open class default () extends Accordion
  /* static members */
  object default {
    
    @JSImport("baseui/accordion/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/accordion/accordion", "default.defaultProps")
    @js.native
    def defaultProps: PartialAccordionProps = js.native
    inline def defaultProps_=(x: PartialAccordionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Accordion extends Component[AccordionProps, AccordionState, Any] {
    
    def getItems(): Any = js.native
    
    def handleKeyDown(e: KeyboardEvent): Unit = js.native
    
    def internalSetState(`type`: StateChangeType, changes: AccordionState): Unit = js.native
    
    var itemRefs: js.Array[RefObject[HTMLDivElement]] = js.native
    
    def onPanelChange(key: Key, onChange: js.Function1[/* repeated */ Any, js.Object], args: Any*): Unit = js.native
    
    @JSName("state")
    var state_Accordion: Expanded = js.native
  }
}
