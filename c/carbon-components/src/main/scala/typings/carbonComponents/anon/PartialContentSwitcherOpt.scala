package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/content-switcher/content-switcher.ContentSwitcherOptions> */
trait PartialContentSwitcherOpt extends StObject {
  
  var classActive: js.UndefOr[String] = js.undefined
  
  var eventAfterSelected: js.UndefOr[String] = js.undefined
  
  var eventBeforeSelected: js.UndefOr[String] = js.undefined
  
  var selectorButton: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialContentSwitcherOpt {
  
  inline def apply(): PartialContentSwitcherOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContentSwitcherOpt]
  }
  
  extension [Self <: PartialContentSwitcherOpt](x: Self) {
    
    inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
    
    inline def setClassActiveUndefined: Self = StObject.set(x, "classActive", js.undefined)
    
    inline def setEventAfterSelected(value: String): Self = StObject.set(x, "eventAfterSelected", value.asInstanceOf[js.Any])
    
    inline def setEventAfterSelectedUndefined: Self = StObject.set(x, "eventAfterSelected", js.undefined)
    
    inline def setEventBeforeSelected(value: String): Self = StObject.set(x, "eventBeforeSelected", value.asInstanceOf[js.Any])
    
    inline def setEventBeforeSelectedUndefined: Self = StObject.set(x, "eventBeforeSelected", js.undefined)
    
    inline def setSelectorButton(value: String): Self = StObject.set(x, "selectorButton", value.asInstanceOf[js.Any])
    
    inline def setSelectorButtonUndefined: Self = StObject.set(x, "selectorButton", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
