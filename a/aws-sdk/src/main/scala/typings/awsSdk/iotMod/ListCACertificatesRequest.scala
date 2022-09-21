package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCACertificatesRequest extends StObject {
  
  /**
    * Determines the order of the results.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The name of the provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.undefined
}
object ListCACertificatesRequest {
  
  inline def apply(): ListCACertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCACertificatesRequest]
  }
  
  extension [Self <: ListCACertificatesRequest](x: Self) {
    
    inline def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    inline def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
