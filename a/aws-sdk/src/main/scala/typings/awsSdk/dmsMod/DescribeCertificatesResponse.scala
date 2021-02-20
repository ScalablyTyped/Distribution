package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificatesResponse extends StObject {
  
  /**
    * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  
  /**
    * The pagination token.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeCertificatesResponse {
  
  @scala.inline
  def apply(): DescribeCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificatesResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificatesResponseMutableBuilder[Self <: DescribeCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
