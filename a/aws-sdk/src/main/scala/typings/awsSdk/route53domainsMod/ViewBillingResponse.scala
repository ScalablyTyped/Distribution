package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBillingResponse extends StObject {
  
  /**
    * A summary of billing records.
    */
  var BillingRecords: js.UndefOr[typings.awsSdk.route53domainsMod.BillingRecords] = js.undefined
  
  /**
    * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
}
object ViewBillingResponse {
  
  inline def apply(): ViewBillingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingResponse]
  }
  
  extension [Self <: ViewBillingResponse](x: Self) {
    
    inline def setBillingRecords(value: BillingRecords): Self = StObject.set(x, "BillingRecords", value.asInstanceOf[js.Any])
    
    inline def setBillingRecordsUndefined: Self = StObject.set(x, "BillingRecords", js.undefined)
    
    inline def setBillingRecordsVarargs(value: BillingRecord*): Self = StObject.set(x, "BillingRecords", js.Array(value :_*))
    
    inline def setNextPageMarker(value: PageMarker): Self = StObject.set(x, "NextPageMarker", value.asInstanceOf[js.Any])
    
    inline def setNextPageMarkerUndefined: Self = StObject.set(x, "NextPageMarker", js.undefined)
  }
}
