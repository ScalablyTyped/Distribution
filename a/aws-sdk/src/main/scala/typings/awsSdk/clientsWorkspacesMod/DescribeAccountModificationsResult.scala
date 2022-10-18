package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountModificationsResult extends StObject {
  
  /**
    * The list of modifications to the configuration of BYOL.
    */
  var AccountModifications: js.UndefOr[AccountModificationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeAccountModificationsResult {
  
  inline def apply(): DescribeAccountModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountModificationsResult]
  }
  
  extension [Self <: DescribeAccountModificationsResult](x: Self) {
    
    inline def setAccountModifications(value: AccountModificationList): Self = StObject.set(x, "AccountModifications", value.asInstanceOf[js.Any])
    
    inline def setAccountModificationsUndefined: Self = StObject.set(x, "AccountModifications", js.undefined)
    
    inline def setAccountModificationsVarargs(value: AccountModification*): Self = StObject.set(x, "AccountModifications", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
