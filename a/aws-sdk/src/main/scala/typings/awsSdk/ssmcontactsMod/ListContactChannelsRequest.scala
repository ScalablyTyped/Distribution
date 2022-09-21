package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactChannelsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact. 
    */
  var ContactId: SsmContactsArn
  
  /**
    * The maximum number of contact channels per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListContactChannelsRequest {
  
  inline def apply(ContactId: SsmContactsArn): ListContactChannelsRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactChannelsRequest]
  }
  
  extension [Self <: ListContactChannelsRequest](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
