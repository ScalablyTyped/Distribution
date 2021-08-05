package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DkimAttributes extends StObject {
  
  /**
    * A string that indicates how DKIM was configured for the identity. There are two possible values:    AWS_SES – Indicates that DKIM was configured for the identity by using Easy DKIM.    EXTERNAL – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM (BYODKIM).  
    */
  var SigningAttributesOrigin: js.UndefOr[DkimSigningAttributesOrigin] = js.undefined
  
  /**
    * If the value is true, then the messages that you send from the identity are signed using DKIM. If the value is false, then the messages that you send from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain.    SUCCESS – The verification process completed successfully.    FAILED – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain.    TEMPORARY_FAILURE – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain.    NOT_STARTED – The DKIM verification process hasn't been initiated for the domain.  
    */
  var Status: js.UndefOr[DkimStatus] = js.undefined
  
  /**
    * If you used Easy DKIM to configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. If you configured DKIM authentication for the domain by providing your own public-private key pair, then this object contains the selector for the public key. Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS configuration of the domain for up to 72 hours.
    */
  var Tokens: js.UndefOr[DnsTokenList] = js.undefined
}
object DkimAttributes {
  
  inline def apply(): DkimAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DkimAttributes]
  }
  
  extension [Self <: DkimAttributes](x: Self) {
    
    inline def setSigningAttributesOrigin(value: DkimSigningAttributesOrigin): Self = StObject.set(x, "SigningAttributesOrigin", value.asInstanceOf[js.Any])
    
    inline def setSigningAttributesOriginUndefined: Self = StObject.set(x, "SigningAttributesOrigin", js.undefined)
    
    inline def setSigningEnabled(value: Enabled): Self = StObject.set(x, "SigningEnabled", value.asInstanceOf[js.Any])
    
    inline def setSigningEnabledUndefined: Self = StObject.set(x, "SigningEnabled", js.undefined)
    
    inline def setStatus(value: DkimStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTokens(value: DnsTokenList): Self = StObject.set(x, "Tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "Tokens", js.undefined)
    
    inline def setTokensVarargs(value: DnsToken*): Self = StObject.set(x, "Tokens", js.Array(value :_*))
  }
}
