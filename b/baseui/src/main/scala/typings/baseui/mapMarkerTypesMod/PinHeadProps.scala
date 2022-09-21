package typings.baseui.mapMarkerTypesMod

import typings.baseui.anon.SizeNumber
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinHeadProps
  extends StObject
     with BadgeEnhancer
     with LabelEnhancer {
  
  var anchorType: js.UndefOr[FloatingMarkerAnchorType] = js.undefined
  
  var background: String
  
  var color: String
  
  var endEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var needle: js.UndefOr[NeedleSize] = js.undefined
  
  var overrides: js.UndefOr[FloatingMarkerOverrides | FixedMarkerOverrides] = js.undefined
  
  var size: js.UndefOr[PinHeadSize] = js.undefined
  
  var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var `type`: js.UndefOr[PinHead] = js.undefined
}
object PinHeadProps {
  
  inline def apply(background: String, color: String): PinHeadProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinHeadProps]
  }
  
  extension [Self <: PinHeadProps](x: Self) {
    
    inline def setAnchorType(value: FloatingMarkerAnchorType): Self = StObject.set(x, "anchorType", value.asInstanceOf[js.Any])
    
    inline def setAnchorTypeUndefined: Self = StObject.set(x, "anchorType", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNeedle(value: NeedleSize): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    inline def setOverrides(value: FloatingMarkerOverrides | FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: PinHeadSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    
    inline def setType(value: PinHead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
