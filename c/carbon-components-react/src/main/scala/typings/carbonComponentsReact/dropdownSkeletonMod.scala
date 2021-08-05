package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.listBoxPropTypesMod.ListBoxSize
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Dropdown/Dropdown.Skeleton", JSImport.Default)
  @js.native
  val default: FC[DropdownSkeletonProps] = js.native
  
  trait DropdownSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * @deprecated
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ListBoxSize] = js.undefined
  }
  object DropdownSkeletonProps {
    
    inline def apply(): DropdownSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownSkeletonProps]
    }
    
    extension [Self <: DropdownSkeletonProps](x: Self) {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setSize(value: ListBoxSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropdownSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownSkeletonMod.foo` */
  override def _to: FC[DropdownSkeletonProps] = default
}
