package typings.blueprintjsCore

import typings.react.mod.Context
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalProviderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/context/portal/portalProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/context/portal/portalProvider", "PortalContext")
  @js.native
  val PortalContext: Context[PortalContextOptions] = js.native
  
  inline def PortalProvider(hasChildrenOptions: PropsWithChildren[PortalContextOptions]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PortalProvider")(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PortalContextOptions extends StObject {
    
    /** Additional CSS classes to add to all `Portal` elements in this React context. */
    var portalClassName: js.UndefOr[String] = js.undefined
  }
  object PortalContextOptions {
    
    inline def apply(): PortalContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalContextOptions]
    }
    
    extension [Self <: PortalContextOptions](x: Self) {
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
    }
  }
}
