package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsResponse extends StObject {
  
  /**
    * A list containing details about each domain in the Amazon Web Services account.
    */
  var DomainSummaries: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainSummaries] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDomainsResponse {
  
  inline def apply(): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainSummaries(value: DomainSummaries): Self = StObject.set(x, "DomainSummaries", value.asInstanceOf[js.Any])
    
    inline def setDomainSummariesUndefined: Self = StObject.set(x, "DomainSummaries", js.undefined)
    
    inline def setDomainSummariesVarargs(value: DomainSummary*): Self = StObject.set(x, "DomainSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
