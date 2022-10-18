package typings.baseui

import typings.baseui.anon.IsFocusVisibleBoolean
import typings.baseui.anon.LoadingMessage
import typings.baseui.tableSemanticTypesMod.TableBuilderProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticTableBuilderMod {
  
  @JSImport("baseui/table-semantic/table-builder", JSImport.Default)
  @js.native
  open class default[T] () extends TableBuilder[T]
  /* static members */
  object default {
    
    @JSImport("baseui/table-semantic/table-builder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table-semantic/table-builder", "default.defaultProps")
    @js.native
    def defaultProps: LoadingMessage = js.native
    inline def defaultProps_=(x: LoadingMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TableBuilder[T] extends Component[TableBuilderProps[T], IsFocusVisibleBoolean, Any] {
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
}
