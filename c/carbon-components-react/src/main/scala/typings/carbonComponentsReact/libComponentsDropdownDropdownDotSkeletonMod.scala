package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsListBoxListBoxPropTypesMod.ListBoxSize
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDropdownDropdownDotSkeletonMod extends Shortcut {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setSize(value: ListBoxSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DropdownSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDropdownDropdownDotSkeletonMod.foo` */
  override def _to: FC[DropdownSkeletonProps] = default
}
