package typings.blueprintjsCore.anon

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/collapse/collapse.CollapseProps> */
trait PartialCollapseProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ElementType[Any]] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var keepChildrenMounted: js.UndefOr[Boolean] = js.undefined
  
  var transitionDuration: js.UndefOr[Double] = js.undefined
}
object PartialCollapseProps {
  
  inline def apply(): PartialCollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapseProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCollapseProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setKeepChildrenMounted(value: Boolean): Self = StObject.set(x, "keepChildrenMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepChildrenMountedUndefined: Self = StObject.set(x, "keepChildrenMounted", js.undefined)
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
  }
}
