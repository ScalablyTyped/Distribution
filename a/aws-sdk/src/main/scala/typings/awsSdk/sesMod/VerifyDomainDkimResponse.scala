package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyDomainDkimResponse extends StObject {
  
  /**
    * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens represent the domain of that address. Using these tokens, you need to create DNS CNAME records that point to DKIM public keys that are hosted by Amazon SES. Amazon Web Services eventually detects that you've updated your DNS records. This detection process might take up to 72 hours. After successful detection, Amazon SES is able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, see the Amazon SES Developer Guide.
    */
  var DkimTokens: VerificationTokenList
}
object VerifyDomainDkimResponse {
  
  @scala.inline
  def apply(DkimTokens: VerificationTokenList): VerifyDomainDkimResponse = {
    val __obj = js.Dynamic.literal(DkimTokens = DkimTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainDkimResponse]
  }
  
  @scala.inline
  implicit class VerifyDomainDkimResponseMutableBuilder[Self <: VerifyDomainDkimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimTokens(value: VerificationTokenList): Self = StObject.set(x, "DkimTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimTokensVarargs(value: VerificationToken*): Self = StObject.set(x, "DkimTokens", js.Array(value :_*))
  }
}
