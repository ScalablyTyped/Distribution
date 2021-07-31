package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsResponse extends StObject {
  
  /**
    * The list of domains.
    */
  var Domains: js.UndefOr[DomainList] = js.undefined
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListDomainsResponse {
  
  @scala.inline
  def apply(): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  @scala.inline
  implicit class ListDomainsResponseMutableBuilder[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: DomainList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: DomainDetails*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
