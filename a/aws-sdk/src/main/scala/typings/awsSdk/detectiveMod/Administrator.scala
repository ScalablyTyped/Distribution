package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Administrator extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the Detective administrator account for the organization.
    */
  var AccountId: js.UndefOr[typings.awsSdk.detectiveMod.AccountId] = js.undefined
  
  /**
    * The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var DelegationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the organization behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.detectiveMod.GraphArn] = js.undefined
}
object Administrator {
  
  inline def apply(): Administrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Administrator]
  }
  
  extension [Self <: Administrator](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDelegationTime(value: js.Date): Self = StObject.set(x, "DelegationTime", value.asInstanceOf[js.Any])
    
    inline def setDelegationTimeUndefined: Self = StObject.set(x, "DelegationTime", js.undefined)
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
  }
}
