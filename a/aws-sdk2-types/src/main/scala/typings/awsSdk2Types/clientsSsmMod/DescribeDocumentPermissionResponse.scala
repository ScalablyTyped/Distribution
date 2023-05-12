package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentPermissionResponse extends StObject {
  
  /**
    * The account IDs that have permission to use this document. The ID can be either an Amazon Web Services account or All.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * A list of Amazon Web Services accounts where the current document is shared and the version shared with each account.
    */
  var AccountSharingInfoList: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AccountSharingInfoList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
}
object DescribeDocumentPermissionResponse {
  
  inline def apply(): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDocumentPermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setAccountSharingInfoList(value: AccountSharingInfoList): Self = StObject.set(x, "AccountSharingInfoList", value.asInstanceOf[js.Any])
    
    inline def setAccountSharingInfoListUndefined: Self = StObject.set(x, "AccountSharingInfoList", js.undefined)
    
    inline def setAccountSharingInfoListVarargs(value: AccountSharingInfo*): Self = StObject.set(x, "AccountSharingInfoList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
