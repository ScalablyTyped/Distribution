package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertPattern extends StObject {
  
  /**
    * List of URIs to which the user can be directed in case
    * no certificates that match this pattern are found.
    */
  var EnrollmentURI: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set, pattern against which X.509 issuer settings should be matched.
    */
  var Issuer: js.UndefOr[IssuerSubjectPattern] = js.native
  
  /**
    * List of certificate issuer CA certificates.
    * A certificate must be signed by one of them in order to match this pattern.
    */
  var IssuerCARef: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set, pattern against which X.509 subject settings should be matched.
    */
  var IssuerSubjectPattern: js.UndefOr[typings.chromeApps.chrome.networking.onc.IssuerSubjectPattern] = js.native
}
object CertPattern {
  
  @scala.inline
  def apply(): CertPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPattern]
  }
  
  @scala.inline
  implicit class CertPatternMutableBuilder[Self <: CertPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrollmentURI(value: js.Array[String]): Self = StObject.set(x, "EnrollmentURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentURIUndefined: Self = StObject.set(x, "EnrollmentURI", js.undefined)
    
    @scala.inline
    def setEnrollmentURIVarargs(value: String*): Self = StObject.set(x, "EnrollmentURI", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: IssuerSubjectPattern): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerCARef(value: js.Array[String]): Self = StObject.set(x, "IssuerCARef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerCARefUndefined: Self = StObject.set(x, "IssuerCARef", js.undefined)
    
    @scala.inline
    def setIssuerCARefVarargs(value: String*): Self = StObject.set(x, "IssuerCARef", js.Array(value :_*))
    
    @scala.inline
    def setIssuerSubjectPattern(value: IssuerSubjectPattern): Self = StObject.set(x, "IssuerSubjectPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerSubjectPatternUndefined: Self = StObject.set(x, "IssuerSubjectPattern", js.undefined)
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
  }
}
