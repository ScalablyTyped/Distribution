package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/toolbar/toolbar.ToolbarOptions> */
trait PartialToolbarOptions extends StObject {
  
  var classSearchActive: js.UndefOr[String] = js.undefined
  
  var classTallRows: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorRowHeight: js.UndefOr[String] = js.undefined
  
  var selectorSearch: js.UndefOr[String] = js.undefined
}
object PartialToolbarOptions {
  
  inline def apply(): PartialToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToolbarOptions]
  }
  
  extension [Self <: PartialToolbarOptions](x: Self) {
    
    inline def setClassSearchActive(value: String): Self = StObject.set(x, "classSearchActive", value.asInstanceOf[js.Any])
    
    inline def setClassSearchActiveUndefined: Self = StObject.set(x, "classSearchActive", js.undefined)
    
    inline def setClassTallRows(value: String): Self = StObject.set(x, "classTallRows", value.asInstanceOf[js.Any])
    
    inline def setClassTallRowsUndefined: Self = StObject.set(x, "classTallRows", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorRowHeight(value: String): Self = StObject.set(x, "selectorRowHeight", value.asInstanceOf[js.Any])
    
    inline def setSelectorRowHeightUndefined: Self = StObject.set(x, "selectorRowHeight", js.undefined)
    
    inline def setSelectorSearch(value: String): Self = StObject.set(x, "selectorSearch", value.asInstanceOf[js.Any])
    
    inline def setSelectorSearchUndefined: Self = StObject.set(x, "selectorSearch", js.undefined)
  }
}
