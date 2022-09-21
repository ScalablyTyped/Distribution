package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUsageLimitRequest extends StObject {
  
  /**
    * The new limit amount. For more information about this parameter.
    */
  var amount: js.UndefOr[Long] = js.undefined
  
  /**
    * The new action that Amazon Redshift Serverless takes when the limit is reached.
    */
  var breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined
  
  /**
    * The identifier of the usage limit to update.
    */
  var usageLimitId: String
}
object UpdateUsageLimitRequest {
  
  inline def apply(usageLimitId: String): UpdateUsageLimitRequest = {
    val __obj = js.Dynamic.literal(usageLimitId = usageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsageLimitRequest]
  }
  
  extension [Self <: UpdateUsageLimitRequest](x: Self) {
    
    inline def setAmount(value: Long): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "breachAction", value.asInstanceOf[js.Any])
    
    inline def setBreachActionUndefined: Self = StObject.set(x, "breachAction", js.undefined)
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "usageLimitId", value.asInstanceOf[js.Any])
  }
}
