package typings.baseui.anon

import typings.baseui.toastTypesMod.PlacementType
import typings.baseui.toastTypesMod.ToasterOverrides
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/toast/types.ToasterProps> */
trait PartialToasterProps extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var overrides: js.UndefOr[ToasterOverrides] = js.undefined
  
  var placement: js.UndefOr[PlacementType] = js.undefined
  
  var resetAutoHideTimerOnUpdate: js.UndefOr[Boolean] = js.undefined
  
  var usePortal: js.UndefOr[Boolean] = js.undefined
}
object PartialToasterProps {
  
  inline def apply(): PartialToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToasterProps]
  }
  
  extension [Self <: PartialToasterProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    inline def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setResetAutoHideTimerOnUpdate(value: Boolean): Self = StObject.set(x, "resetAutoHideTimerOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setResetAutoHideTimerOnUpdateUndefined: Self = StObject.set(x, "resetAutoHideTimerOnUpdate", js.undefined)
    
    inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
