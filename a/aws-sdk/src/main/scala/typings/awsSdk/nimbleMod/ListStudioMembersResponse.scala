package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioMembersResponse extends StObject {
  
  /**
    * A list of admin members.
    */
  var members: js.UndefOr[StudioMembershipList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListStudioMembersResponse {
  
  inline def apply(): ListStudioMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudioMembersResponse]
  }
  
  extension [Self <: ListStudioMembersResponse](x: Self) {
    
    inline def setMembers(value: StudioMembershipList): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: StudioMembership*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
