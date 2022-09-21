package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMailDomainResponse extends StObject {
  
  /**
    * Indicates the status of a DKIM verification.
    */
  var DkimVerificationStatus: js.UndefOr[DnsRecordVerificationStatus] = js.undefined
  
  /**
    * Specifies whether the domain is the default domain for your organization.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the domain is a test domain provided by WorkMail, or a custom domain.
    */
  var IsTestDomain: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Indicates the status of the domain ownership verification.
    */
  var OwnershipVerificationStatus: js.UndefOr[DnsRecordVerificationStatus] = js.undefined
  
  /**
    * A list of the DNS records that Amazon WorkMail recommends adding in your DNS provider for the best user experience. The records configure your domain with DMARC, SPF, DKIM, and direct incoming email traffic to SES. See admin guide for more details.
    */
  var Records: js.UndefOr[DnsRecords] = js.undefined
}
object GetMailDomainResponse {
  
  inline def apply(): GetMailDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMailDomainResponse]
  }
  
  extension [Self <: GetMailDomainResponse](x: Self) {
    
    inline def setDkimVerificationStatus(value: DnsRecordVerificationStatus): Self = StObject.set(x, "DkimVerificationStatus", value.asInstanceOf[js.Any])
    
    inline def setDkimVerificationStatusUndefined: Self = StObject.set(x, "DkimVerificationStatus", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setIsTestDomain(value: Boolean): Self = StObject.set(x, "IsTestDomain", value.asInstanceOf[js.Any])
    
    inline def setIsTestDomainUndefined: Self = StObject.set(x, "IsTestDomain", js.undefined)
    
    inline def setOwnershipVerificationStatus(value: DnsRecordVerificationStatus): Self = StObject.set(x, "OwnershipVerificationStatus", value.asInstanceOf[js.Any])
    
    inline def setOwnershipVerificationStatusUndefined: Self = StObject.set(x, "OwnershipVerificationStatus", js.undefined)
    
    inline def setRecords(value: DnsRecords): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setRecordsVarargs(value: DnsRecord*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
