package typings.baseui.anon

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.toastMod.ToasterOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/toast.ToasterProps> */
trait ReadonlyToasterProps extends StObject {
  
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  
  val overrides: js.UndefOr[ToasterOverrides] = js.undefined
  
  val placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
  
  val usePortal: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyToasterProps {
  
  inline def apply(): ReadonlyToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyToasterProps]
  }
  
  extension [Self <: ReadonlyToasterProps](x: Self) {
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
