package typings.baseui

import typings.baseui.baseuiStrings.cell
import typings.baseui.baseuiStrings.module
import typings.baseui.baseuiStrings.section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerTypesMod {
  
  trait DividerProps extends StObject {
    
    @JSName("$size")
    var $size: js.UndefOr[cell | section | module] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def set$size(value: cell | section | module): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
