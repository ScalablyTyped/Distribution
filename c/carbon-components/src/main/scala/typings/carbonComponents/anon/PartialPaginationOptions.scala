package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/pagination/pagination.PaginationOptions> */
trait PartialPaginationOptions extends StObject {
  
  var eventItemsPerPage: js.UndefOr[String] = js.undefined
  
  var eventPageChange: js.UndefOr[String] = js.undefined
  
  var eventPageNumber: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorItemsPerPageInput: js.UndefOr[String] = js.undefined
  
  var selectorPageBackward: js.UndefOr[String] = js.undefined
  
  var selectorPageForward: js.UndefOr[String] = js.undefined
  
  var selectorPageNumberInput: js.UndefOr[String] = js.undefined
}
object PartialPaginationOptions {
  
  inline def apply(): PartialPaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginationOptions]
  }
  
  extension [Self <: PartialPaginationOptions](x: Self) {
    
    inline def setEventItemsPerPage(value: String): Self = StObject.set(x, "eventItemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setEventItemsPerPageUndefined: Self = StObject.set(x, "eventItemsPerPage", js.undefined)
    
    inline def setEventPageChange(value: String): Self = StObject.set(x, "eventPageChange", value.asInstanceOf[js.Any])
    
    inline def setEventPageChangeUndefined: Self = StObject.set(x, "eventPageChange", js.undefined)
    
    inline def setEventPageNumber(value: String): Self = StObject.set(x, "eventPageNumber", value.asInstanceOf[js.Any])
    
    inline def setEventPageNumberUndefined: Self = StObject.set(x, "eventPageNumber", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorItemsPerPageInput(value: String): Self = StObject.set(x, "selectorItemsPerPageInput", value.asInstanceOf[js.Any])
    
    inline def setSelectorItemsPerPageInputUndefined: Self = StObject.set(x, "selectorItemsPerPageInput", js.undefined)
    
    inline def setSelectorPageBackward(value: String): Self = StObject.set(x, "selectorPageBackward", value.asInstanceOf[js.Any])
    
    inline def setSelectorPageBackwardUndefined: Self = StObject.set(x, "selectorPageBackward", js.undefined)
    
    inline def setSelectorPageForward(value: String): Self = StObject.set(x, "selectorPageForward", value.asInstanceOf[js.Any])
    
    inline def setSelectorPageForwardUndefined: Self = StObject.set(x, "selectorPageForward", js.undefined)
    
    inline def setSelectorPageNumberInput(value: String): Self = StObject.set(x, "selectorPageNumberInput", value.asInstanceOf[js.Any])
    
    inline def setSelectorPageNumberInputUndefined: Self = StObject.set(x, "selectorPageNumberInput", js.undefined)
  }
}
