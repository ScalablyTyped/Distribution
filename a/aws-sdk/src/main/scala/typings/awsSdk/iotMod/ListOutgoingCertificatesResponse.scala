package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutgoingCertificatesResponse extends StObject {
  
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined
}
object ListOutgoingCertificatesResponse {
  
  inline def apply(): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
  
  extension [Self <: ListOutgoingCertificatesResponse](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    inline def setOutgoingCertificates(value: OutgoingCertificates): Self = StObject.set(x, "outgoingCertificates", value.asInstanceOf[js.Any])
    
    inline def setOutgoingCertificatesUndefined: Self = StObject.set(x, "outgoingCertificates", js.undefined)
    
    inline def setOutgoingCertificatesVarargs(value: OutgoingCertificate*): Self = StObject.set(x, "outgoingCertificates", js.Array(value*))
  }
}
