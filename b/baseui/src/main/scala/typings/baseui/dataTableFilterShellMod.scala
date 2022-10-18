package typings.baseui

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableFilterShellMod {
  
  @JSImport("baseui/data-table/filter-shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.value
    - typings.baseui.baseuiStrings.range
  */
  trait ExcludeKind extends StObject
  object ExcludeKind {
    
    inline def range: typings.baseui.baseuiStrings.range = "range".asInstanceOf[typings.baseui.baseuiStrings.range]
    
    inline def value: typings.baseui.baseuiStrings.value = "value".asInstanceOf[typings.baseui.baseuiStrings.value]
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var exclude: Boolean
    
    var excludeKind: js.UndefOr[ExcludeKind] = js.undefined
    
    def onApply(): Unit
    
    def onExcludeChange(): Unit
  }
  object Props {
    
    inline def apply(exclude: Boolean, onApply: () => Unit, onExcludeChange: () => Unit): Props = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], onApply = js.Any.fromFunction0(onApply), onExcludeChange = js.Any.fromFunction0(onExcludeChange))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeKind(value: ExcludeKind): Self = StObject.set(x, "excludeKind", value.asInstanceOf[js.Any])
      
      inline def setExcludeKindUndefined: Self = StObject.set(x, "excludeKind", js.undefined)
      
      inline def setOnApply(value: () => Unit): Self = StObject.set(x, "onApply", js.Any.fromFunction0(value))
      
      inline def setOnExcludeChange(value: () => Unit): Self = StObject.set(x, "onExcludeChange", js.Any.fromFunction0(value))
    }
  }
}
