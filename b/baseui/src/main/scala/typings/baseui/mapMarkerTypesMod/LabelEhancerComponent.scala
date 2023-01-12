package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelEhancerComponent
  extends StObject
     with LabelEnhancer {
  
  var needleHeight: Double
  
  var overrides: js.UndefOr[FixedMarkerOverrides] = js.undefined
  
  var size: PinHeadSize
}
object LabelEhancerComponent {
  
  inline def apply(needleHeight: Double, size: PinHeadSize): LabelEhancerComponent = {
    val __obj = js.Dynamic.literal(needleHeight = needleHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelEhancerComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelEhancerComponent] (val x: Self) extends AnyVal {
    
    inline def setNeedleHeight(value: Double): Self = StObject.set(x, "needleHeight", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: PinHeadSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
