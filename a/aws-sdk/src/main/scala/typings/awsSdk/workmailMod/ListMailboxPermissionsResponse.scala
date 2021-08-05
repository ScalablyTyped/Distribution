package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMailboxPermissionsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
  
  /**
    * One page of the user, group, or resource mailbox permissions.
    */
  var Permissions: js.UndefOr[typings.awsSdk.workmailMod.Permissions] = js.undefined
}
object ListMailboxPermissionsResponse {
  
  inline def apply(): ListMailboxPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMailboxPermissionsResponse]
  }
  
  extension [Self <: ListMailboxPermissionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissions(value: Permissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
  }
}
