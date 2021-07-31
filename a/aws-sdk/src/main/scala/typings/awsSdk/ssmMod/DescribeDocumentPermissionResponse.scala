package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentPermissionResponse extends StObject {
  
  /**
    * The account IDs that have permission to use this document. The ID can be either an AWS account or All.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * A list of AWS accounts where the current document is shared and the version shared with each account.
    */
  var AccountSharingInfoList: js.UndefOr[typings.awsSdk.ssmMod.AccountSharingInfoList] = js.undefined
}
object DescribeDocumentPermissionResponse {
  
  @scala.inline
  def apply(): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
  
  @scala.inline
  implicit class DescribeDocumentPermissionResponseMutableBuilder[Self <: DescribeDocumentPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountSharingInfoList(value: AccountSharingInfoList): Self = StObject.set(x, "AccountSharingInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountSharingInfoListUndefined: Self = StObject.set(x, "AccountSharingInfoList", js.undefined)
    
    @scala.inline
    def setAccountSharingInfoListVarargs(value: AccountSharingInfo*): Self = StObject.set(x, "AccountSharingInfoList", js.Array(value :_*))
  }
}
