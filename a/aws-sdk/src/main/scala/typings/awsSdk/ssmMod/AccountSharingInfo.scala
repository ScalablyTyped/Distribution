package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSharingInfo extends StObject {
  
  /**
    * The AWS account ID where the current document is shared.
    */
  var AccountId: js.UndefOr[typings.awsSdk.ssmMod.AccountId] = js.native
  
  /**
    * The version of the current document shared with the account.
    */
  var SharedDocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.SharedDocumentVersion] = js.native
}
object AccountSharingInfo {
  
  @scala.inline
  def apply(): AccountSharingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSharingInfo]
  }
  
  @scala.inline
  implicit class AccountSharingInfoMutableBuilder[Self <: AccountSharingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setSharedDocumentVersion(value: SharedDocumentVersion): Self = StObject.set(x, "SharedDocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDocumentVersionUndefined: Self = StObject.set(x, "SharedDocumentVersion", js.undefined)
  }
}
