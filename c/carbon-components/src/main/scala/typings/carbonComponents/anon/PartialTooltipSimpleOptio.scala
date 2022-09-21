package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/tooltip/tooltip--simple.TooltipSimpleOptions> */
trait PartialTooltipSimpleOptio extends StObject {
  
  var classTooltipHidden: js.UndefOr[String] = js.undefined
  
  var classTooltipVisible: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorTriggerButton: js.UndefOr[String] = js.undefined
}
object PartialTooltipSimpleOptio {
  
  inline def apply(): PartialTooltipSimpleOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipSimpleOptio]
  }
  
  extension [Self <: PartialTooltipSimpleOptio](x: Self) {
    
    inline def setClassTooltipHidden(value: String): Self = StObject.set(x, "classTooltipHidden", value.asInstanceOf[js.Any])
    
    inline def setClassTooltipHiddenUndefined: Self = StObject.set(x, "classTooltipHidden", js.undefined)
    
    inline def setClassTooltipVisible(value: String): Self = StObject.set(x, "classTooltipVisible", value.asInstanceOf[js.Any])
    
    inline def setClassTooltipVisibleUndefined: Self = StObject.set(x, "classTooltipVisible", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorTriggerButton(value: String): Self = StObject.set(x, "selectorTriggerButton", value.asInstanceOf[js.Any])
    
    inline def setSelectorTriggerButtonUndefined: Self = StObject.set(x, "selectorTriggerButton", js.undefined)
  }
}
