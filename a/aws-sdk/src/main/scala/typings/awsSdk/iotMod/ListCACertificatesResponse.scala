package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCACertificatesResponse extends StObject {
  
  /**
    * The CA certificates registered in your AWS account.
    */
  var certificates: js.UndefOr[CACertificates] = js.undefined
  
  /**
    * The current position within the list of CA certificates.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListCACertificatesResponse {
  
  @scala.inline
  def apply(): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
  
  @scala.inline
  implicit class ListCACertificatesResponseMutableBuilder[Self <: ListCACertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: CACertificates): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: CACertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
