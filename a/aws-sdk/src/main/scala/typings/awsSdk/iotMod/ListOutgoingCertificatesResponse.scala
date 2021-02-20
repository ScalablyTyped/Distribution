package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOutgoingCertificatesResponse extends StObject {
  
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.native
}
object ListOutgoingCertificatesResponse {
  
  @scala.inline
  def apply(): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListOutgoingCertificatesResponseMutableBuilder[Self <: ListOutgoingCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    @scala.inline
    def setOutgoingCertificates(value: OutgoingCertificates): Self = StObject.set(x, "outgoingCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingCertificatesUndefined: Self = StObject.set(x, "outgoingCertificates", js.undefined)
    
    @scala.inline
    def setOutgoingCertificatesVarargs(value: OutgoingCertificate*): Self = StObject.set(x, "outgoingCertificates", js.Array(value :_*))
  }
}
