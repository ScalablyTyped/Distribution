package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificatesByCAResponse extends StObject {
  
  /**
    * The device certificates signed by the specified CA certificate.
    */
  var certificates: js.UndefOr[Certificates] = js.native
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}
object ListCertificatesByCAResponse {
  
  @scala.inline
  def apply(): ListCertificatesByCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesByCAResponse]
  }
  
  @scala.inline
  implicit class ListCertificatesByCAResponseMutableBuilder[Self <: ListCertificatesByCAResponse] (val x: Self) extends AnyVal {
    
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
