package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerEventSourceAccountsResponse extends StObject {
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.undefined
  
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.undefined
}
object ListPartnerEventSourceAccountsResponse {
  
  @scala.inline
  def apply(): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
  
  @scala.inline
  implicit class ListPartnerEventSourceAccountsResponseMutableBuilder[Self <: ListPartnerEventSourceAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPartnerEventSourceAccounts(value: PartnerEventSourceAccountList): Self = StObject.set(x, "PartnerEventSourceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerEventSourceAccountsUndefined: Self = StObject.set(x, "PartnerEventSourceAccounts", js.undefined)
    
    @scala.inline
    def setPartnerEventSourceAccountsVarargs(value: PartnerEventSourceAccount*): Self = StObject.set(x, "PartnerEventSourceAccounts", js.Array(value :_*))
  }
}
