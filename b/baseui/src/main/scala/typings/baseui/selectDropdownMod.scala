package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.IsLoading
import typings.baseui.selectTypesMod.DropdownProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectDropdownMod {
  
  @JSImport("baseui/select/dropdown", JSImport.Default)
  @js.native
  open class default () extends SelectDropdown
  
  @js.native
  trait SelectDropdown
    extends Component[DropdownProps, js.Object, Any] {
    
    def getHighlightedIndex(): Double = js.native
    
    def getItemLabel(option: StringDictionary[Any]): Element = js.native
    
    def getSharedProps(): IsLoading = js.native
    
    def onMouseDown(e: SyntheticEvent[typings.std.Element, Event]): Unit = js.native
  }
}
