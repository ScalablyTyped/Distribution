package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountQuota extends js.Object {
  
  /**
    * The name of the Amazon RDS quota for this AWS account.
    */
  var AccountQuotaName: js.UndefOr[String] = js.native
  
  /**
    * The maximum allowed value for the quota.
    */
  var Max: js.UndefOr[Long] = js.native
  
  /**
    * The amount currently used toward the quota maximum.
    */
  var Used: js.UndefOr[Long] = js.native
}
object AccountQuota {
  
  @scala.inline
  def apply(): AccountQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountQuota]
  }
  
  @scala.inline
  implicit class AccountQuotaOps[Self <: AccountQuota] (val x: Self) extends AnyVal {
    
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
    def setAccountQuotaName(value: String): Self = this.set("AccountQuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountQuotaName: Self = this.set("AccountQuotaName", js.undefined)
    
    @scala.inline
    def setMax(value: Long): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("Max", js.undefined)
    
    @scala.inline
    def setUsed(value: Long): Self = this.set("Used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed: Self = this.set("Used", js.undefined)
  }
}
