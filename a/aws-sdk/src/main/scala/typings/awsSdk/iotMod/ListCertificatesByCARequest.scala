package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesByCARequest extends StObject {
  
  /**
    * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  
  /**
    * The ID of the CA certificate. This operation will list all registered device certificate that were signed by this CA certificate.
    */
  var caCertificateId: CertificateId
  
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
}
object ListCertificatesByCARequest {
  
  inline def apply(caCertificateId: CertificateId): ListCertificatesByCARequest = {
    val __obj = js.Dynamic.literal(caCertificateId = caCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesByCARequest]
  }
  
  extension [Self <: ListCertificatesByCARequest](x: Self) {
    
    inline def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    inline def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    inline def setCaCertificateId(value: CertificateId): Self = StObject.set(x, "caCertificateId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
