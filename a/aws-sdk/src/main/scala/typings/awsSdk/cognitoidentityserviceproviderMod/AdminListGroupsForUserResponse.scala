package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminListGroupsForUserResponse extends StObject {
  
  /**
    * The groups that the user belongs to.
    */
  var Groups: js.UndefOr[GroupListType] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object AdminListGroupsForUserResponse {
  
  inline def apply(): AdminListGroupsForUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListGroupsForUserResponse]
  }
  
  extension [Self <: AdminListGroupsForUserResponse](x: Self) {
    
    inline def setGroups(value: GroupListType): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupType*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
