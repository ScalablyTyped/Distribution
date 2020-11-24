package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountSettingsResponse extends js.Object {
  
  /**
    * Limits that are related to concurrency and code storage.
    */
  var AccountLimit: js.UndefOr[typings.awsSdk.lambdaMod.AccountLimit] = js.native
  
  /**
    * The number of functions and amount of storage in use.
    */
  var AccountUsage: js.UndefOr[typings.awsSdk.lambdaMod.AccountUsage] = js.native
}
object GetAccountSettingsResponse {
  
  @scala.inline
  def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  
  @scala.inline
  implicit class GetAccountSettingsResponseOps[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountLimit(value: AccountLimit): Self = this.set("AccountLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountLimit: Self = this.set("AccountLimit", js.undefined)
    
    @scala.inline
    def setAccountUsage(value: AccountUsage): Self = this.set("AccountUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountUsage: Self = this.set("AccountUsage", js.undefined)
  }
}
