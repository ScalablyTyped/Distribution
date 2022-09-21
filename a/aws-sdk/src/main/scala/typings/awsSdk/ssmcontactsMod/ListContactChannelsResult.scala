package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactChannelsResult extends StObject {
  
  /**
    * A list of contact channels related to the specified contact.
    */
  var ContactChannels: ContactChannelList
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListContactChannelsResult {
  
  inline def apply(ContactChannels: ContactChannelList): ListContactChannelsResult = {
    val __obj = js.Dynamic.literal(ContactChannels = ContactChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactChannelsResult]
  }
  
  extension [Self <: ListContactChannelsResult](x: Self) {
    
    inline def setContactChannels(value: ContactChannelList): Self = StObject.set(x, "ContactChannels", value.asInstanceOf[js.Any])
    
    inline def setContactChannelsVarargs(value: ContactChannel*): Self = StObject.set(x, "ContactChannels", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
