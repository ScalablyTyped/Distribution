package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesResponse extends StObject {
  
  /**
    * The descriptions of the certificates.
    */
  var certificates: js.UndefOr[Certificates] = js.undefined
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListCertificatesResponse {
  
  @scala.inline
  def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListCertificatesResponseMutableBuilder[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: Certificates): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
