package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMailDomainsResponse extends StObject {
  
  /**
    * The list of mail domain summaries, specifying domains that exist in the specified WorkMail organization, along with the information about whether the domain is or isn't the default.
    */
  var MailDomains: js.UndefOr[typings.awsSdk.clientsWorkmailMod.MailDomains] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The value becomes null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
}
object ListMailDomainsResponse {
  
  inline def apply(): ListMailDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMailDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setMailDomains(value: MailDomains): Self = StObject.set(x, "MailDomains", value.asInstanceOf[js.Any])
    
    inline def setMailDomainsUndefined: Self = StObject.set(x, "MailDomains", js.undefined)
    
    inline def setMailDomainsVarargs(value: MailDomainSummary*): Self = StObject.set(x, "MailDomains", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
