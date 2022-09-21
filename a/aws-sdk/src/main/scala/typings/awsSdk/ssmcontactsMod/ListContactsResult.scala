package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsResult extends StObject {
  
  /**
    * A list of the contacts and escalation plans in your Incident Manager account.
    */
  var Contacts: js.UndefOr[ContactsList] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListContactsResult {
  
  inline def apply(): ListContactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsResult]
  }
  
  extension [Self <: ListContactsResult](x: Self) {
    
    inline def setContacts(value: ContactsList): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "Contacts", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
