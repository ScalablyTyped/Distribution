package typings.blueprintjsCore.anon

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.PortalProps> */
trait PartialPortalProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialPortalProps {
  
  inline def apply(): PartialPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPortalProps]
  }
  
  extension [Self <: PartialPortalProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setOnChildrenMount(value: () => Unit): Self = StObject.set(x, "onChildrenMount", js.Any.fromFunction0(value))
    
    inline def setOnChildrenMountUndefined: Self = StObject.set(x, "onChildrenMount", js.undefined)
  }
}
