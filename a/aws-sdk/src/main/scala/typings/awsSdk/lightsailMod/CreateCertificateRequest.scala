package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateRequest extends StObject {
  
  /**
    * The name for the certificate.
    */
  var certificateName: CertificateName
  
  /**
    * The domain name (e.g., example.com) for the certificate.
    */
  var domainName: DomainName
  
  /**
    * An array of strings that specify the alternate domains (e.g., example2.com) and subdomains (e.g., blog.example.com) for the certificate. You can specify a maximum of nine alternate domains (in addition to the primary domain name). Wildcard domain entries (e.g., *.example.com) are not supported.
    */
  var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNameList] = js.undefined
  
  /**
    * The tag keys and optional values to add to the certificate during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateCertificateRequest {
  
  inline def apply(certificateName: CertificateName, domainName: DomainName): CreateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateRequest]
  }
  
  extension [Self <: CreateCertificateRequest](x: Self) {
    
    inline def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNames(value: SubjectAlternativeNameList): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    inline def setSubjectAlternativeNamesVarargs(value: DomainName*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
