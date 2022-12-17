package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/Table", JSImport.Default)
  @js.native
  val default: FC[TableProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.compact
    - typings.carbonComponentsReact.carbonComponentsReactStrings.lg
    - typings.carbonComponentsReact.carbonComponentsReactStrings.md
    - typings.carbonComponentsReact.carbonComponentsReactStrings.normal
    - typings.carbonComponentsReact.carbonComponentsReactStrings.short
    - typings.carbonComponentsReact.carbonComponentsReactStrings.sm
    - typings.carbonComponentsReact.carbonComponentsReactStrings.tall
    - typings.carbonComponentsReact.carbonComponentsReactStrings.xl
    - typings.carbonComponentsReact.carbonComponentsReactStrings.xs
  */
  trait DataTableSize extends StObject
  object DataTableSize {
    
    inline def compact: typings.carbonComponentsReact.carbonComponentsReactStrings.compact = "compact".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.compact]
    
    inline def lg: typings.carbonComponentsReact.carbonComponentsReactStrings.lg = "lg".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.lg]
    
    inline def md: typings.carbonComponentsReact.carbonComponentsReactStrings.md = "md".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.md]
    
    inline def normal: typings.carbonComponentsReact.carbonComponentsReactStrings.normal = "normal".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.normal]
    
    inline def short: typings.carbonComponentsReact.carbonComponentsReactStrings.short = "short".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.short]
    
    inline def sm: typings.carbonComponentsReact.carbonComponentsReactStrings.sm = "sm".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.sm]
    
    inline def tall: typings.carbonComponentsReact.carbonComponentsReactStrings.tall = "tall".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.tall]
    
    inline def xl: typings.carbonComponentsReact.carbonComponentsReactStrings.xl = "xl".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xl]
    
    inline def xs: typings.carbonComponentsReact.carbonComponentsReactStrings.xs = "xs".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xs]
  }
  
  type InheritedProps = TableHTMLAttributes[HTMLTableElement]
  
  trait TableCarbonProps extends StObject {
    
    var isSortable: js.UndefOr[Boolean] = js.undefined
    
    var overflowMenuOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var shouldShowBorder: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[DataTableSize] = js.undefined
    
    var useStaticWidth: js.UndefOr[Boolean] = js.undefined
    
    var useZebraStyles: js.UndefOr[Boolean] = js.undefined
  }
  object TableCarbonProps {
    
    inline def apply(): TableCarbonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCarbonProps]
    }
    
    extension [Self <: TableCarbonProps](x: Self) {
      
      inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      inline def setOverflowMenuOnHover(value: Boolean): Self = StObject.set(x, "overflowMenuOnHover", value.asInstanceOf[js.Any])
      
      inline def setOverflowMenuOnHoverUndefined: Self = StObject.set(x, "overflowMenuOnHover", js.undefined)
      
      inline def setShouldShowBorder(value: Boolean): Self = StObject.set(x, "shouldShowBorder", value.asInstanceOf[js.Any])
      
      inline def setShouldShowBorderUndefined: Self = StObject.set(x, "shouldShowBorder", js.undefined)
      
      inline def setSize(value: DataTableSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseStaticWidth(value: Boolean): Self = StObject.set(x, "useStaticWidth", value.asInstanceOf[js.Any])
      
      inline def setUseStaticWidthUndefined: Self = StObject.set(x, "useStaticWidth", js.undefined)
      
      inline def setUseZebraStyles(value: Boolean): Self = StObject.set(x, "useZebraStyles", value.asInstanceOf[js.Any])
      
      inline def setUseZebraStylesUndefined: Self = StObject.set(x, "useZebraStyles", js.undefined)
    }
  }
  
  trait TableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with TableCarbonProps
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
  }
  
  type _To = FC[TableProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableMod.foo` */
  override def _to: FC[TableProps] = default
}
