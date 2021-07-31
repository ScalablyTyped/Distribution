package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateMessage extends StObject {
  
  /**
    * The list of Certificate objects for the AWS account.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CertificateMessage {
  
  @scala.inline
  def apply(): CertificateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateMessage]
  }
  
  @scala.inline
  implicit class CertificateMessageMutableBuilder[Self <: CertificateMessage] (val x: Self) extends AnyVal {
    
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
