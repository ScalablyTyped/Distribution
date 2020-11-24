package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountWithRestoreAccess extends js.Object {
  
  /**
    * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an AWS customer account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.native
}
object AccountWithRestoreAccess {
  
  @scala.inline
  def apply(): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
  
  @scala.inline
  implicit class AccountWithRestoreAccessOps[Self <: AccountWithRestoreAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountAlias(value: String): Self = this.set("AccountAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAlias: Self = this.set("AccountAlias", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
  }
}
