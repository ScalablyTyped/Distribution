package typings.baseui

import typings.baseui.anon.IsFocusVisibleBoolean
import typings.baseui.anon.Labels
import typings.baseui.anon.Value
import typings.baseui.localeTypesMod.Locale
import typings.baseui.paginationTypesMod.PaginationProps
import typings.react.mod.PureComponent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod {
  
  @JSImport("baseui/pagination/pagination", JSImport.Default)
  @js.native
  open class default () extends Pagination
  /* static members */
  object default {
    
    @JSImport("baseui/pagination/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination/pagination", "default.defaultProps")
    @js.native
    def defaultProps: Labels = js.native
    inline def defaultProps_=(x: Labels): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PageOption extends StObject {
    
    var label: Double
  }
  object PageOption {
    
    inline def apply(label: Double): PageOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageOption]
    }
    
    extension [Self <: PageOption](x: Self) {
      
      inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pagination extends PureComponent[PaginationProps, IsFocusVisibleBoolean, Any] {
    
    def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
    
    def getMenuOptions(numPages: Double): js.Array[Any] = js.native
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def onMenuItemSelect(data: Value): Unit = js.native
    
    def onNextClick(event: SyntheticEvent[Any, Event]): Unit = js.native
    
    def onPrevClick(event: SyntheticEvent[Any, Event]): Unit = js.native
  }
}
