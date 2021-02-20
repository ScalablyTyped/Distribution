package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageAccountResult extends StObject {
  
  /**
    * The Account ID that generated usage.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  
  /**
    * Represents the total of usage for the Account ID.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.native
}
object UsageAccountResult {
  
  @scala.inline
  def apply(): UsageAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageAccountResult]
  }
  
  @scala.inline
  implicit class UsageAccountResultMutableBuilder[Self <: UsageAccountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
