package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificatesResult extends StObject {
  
  /**
    * An object that describes certificates.
    */
  var certificates: js.UndefOr[CertificateSummaryList] = js.native
}
object GetCertificatesResult {
  
  @scala.inline
  def apply(): GetCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificatesResult]
  }
  
  @scala.inline
  implicit class GetCertificatesResultMutableBuilder[Self <: GetCertificatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: CertificateSummaryList): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: CertificateSummary*): Self = StObject.set(x, "certificates", js.Array(value :_*))
  }
}
