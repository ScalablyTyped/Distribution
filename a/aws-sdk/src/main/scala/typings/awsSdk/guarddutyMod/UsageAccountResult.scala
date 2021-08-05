package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageAccountResult extends StObject {
  
  /**
    * The Account ID that generated usage.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.undefined
  
  /**
    * Represents the total of usage for the Account ID.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.undefined
}
object UsageAccountResult {
  
  inline def apply(): UsageAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageAccountResult]
  }
  
  extension [Self <: UsageAccountResult](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
