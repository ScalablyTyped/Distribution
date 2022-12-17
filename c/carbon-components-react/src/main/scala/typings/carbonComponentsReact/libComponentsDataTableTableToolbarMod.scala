package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.normal
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.carbonComponentsReactStrings.small
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableToolbarMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableToolbar", JSImport.Default)
  @js.native
  val default: FC[TableToolbarProps] = js.native
  
  trait TableToolbarProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var size: js.UndefOr[lg | normal | sm | small] = js.undefined
  }
  object TableToolbarProps {
    
    inline def apply(): TableToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableToolbarProps]
    }
    
    extension [Self <: TableToolbarProps](x: Self) {
      
      inline def setSize(value: lg | normal | sm | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableToolbarMod.foo` */
  override def _to: FC[TableToolbarProps] = default
}
