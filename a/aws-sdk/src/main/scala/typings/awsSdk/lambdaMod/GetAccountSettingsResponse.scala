package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountSettingsResponse extends StObject {
  
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
  implicit class GetAccountSettingsResponseMutableBuilder[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountLimit(value: AccountLimit): Self = StObject.set(x, "AccountLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLimitUndefined: Self = StObject.set(x, "AccountLimit", js.undefined)
    
    @scala.inline
    def setAccountUsage(value: AccountUsage): Self = StObject.set(x, "AccountUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUsageUndefined: Self = StObject.set(x, "AccountUsage", js.undefined)
  }
}
