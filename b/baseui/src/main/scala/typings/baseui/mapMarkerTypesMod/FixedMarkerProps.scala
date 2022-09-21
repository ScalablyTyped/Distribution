package typings.baseui.mapMarkerTypesMod

import typings.baseui.anon.SizeNumber
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedMarkerProps
  extends StObject
     with BadgeEnhancer
     with LabelEnhancer {
  
  var dragging: js.UndefOr[Boolean] = js.undefined
  
  var endEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var kind: js.UndefOr[Kind] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var needle: js.UndefOr[NeedleSize] = js.undefined
  
  var overrides: js.UndefOr[FixedMarkerOverrides] = js.undefined
  
  var size: js.UndefOr[PinHeadSize] = js.undefined
  
  var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
}
object FixedMarkerProps {
  
  inline def apply(): FixedMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedMarkerProps]
  }
  
  extension [Self <: FixedMarkerProps](x: Self) {
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    inline def setEndEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNeedle(value: NeedleSize): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    inline def setOverrides(value: FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: PinHeadSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
  }
}
