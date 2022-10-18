package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupMembersResponse extends StObject {
  
  /**
    * The members associated to the group.
    */
  var Members: js.UndefOr[typings.awsSdk.clientsWorkmailMod.Members] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
}
object ListGroupMembersResponse {
  
  inline def apply(): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
  
  extension [Self <: ListGroupMembersResponse](x: Self) {
    
    inline def setMembers(value: Members): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
