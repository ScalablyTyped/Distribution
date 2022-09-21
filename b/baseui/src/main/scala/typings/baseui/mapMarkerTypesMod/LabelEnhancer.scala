package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelEnhancer extends StObject {
  
  var labelEnhancerContent: js.UndefOr[String] = js.undefined
  
  var labelEnhancerPosition: js.UndefOr[LabelEnhancerPosition] = js.undefined
}
object LabelEnhancer {
  
  inline def apply(): LabelEnhancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelEnhancer]
  }
  
  extension [Self <: LabelEnhancer](x: Self) {
    
    inline def setLabelEnhancerContent(value: String): Self = StObject.set(x, "labelEnhancerContent", value.asInstanceOf[js.Any])
    
    inline def setLabelEnhancerContentUndefined: Self = StObject.set(x, "labelEnhancerContent", js.undefined)
    
    inline def setLabelEnhancerPosition(value: LabelEnhancerPosition): Self = StObject.set(x, "labelEnhancerPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelEnhancerPositionUndefined: Self = StObject.set(x, "labelEnhancerPosition", js.undefined)
  }
}
