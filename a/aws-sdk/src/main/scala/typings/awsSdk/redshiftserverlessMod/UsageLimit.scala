package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageLimit extends StObject {
  
  /**
    * The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is in terabytes (TB). The value must be a positive number.
    */
  var amount: js.UndefOr[Long] = js.undefined
  
  /**
    * The action that Amazon Redshift Serverless takes when the limit is reached.
    */
  var breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
    */
  var period: js.UndefOr[UsageLimitPeriod] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the usage limit.
    */
  var usageLimitArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the usage limit.
    */
  var usageLimitId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Redshift Serverless feature to limit.
    */
  var usageType: js.UndefOr[UsageLimitUsageType] = js.undefined
}
object UsageLimit {
  
  inline def apply(): UsageLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageLimit]
  }
  
  extension [Self <: UsageLimit](x: Self) {
    
    inline def setAmount(value: Long): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "breachAction", value.asInstanceOf[js.Any])
    
    inline def setBreachActionUndefined: Self = StObject.set(x, "breachAction", js.undefined)
    
    inline def setPeriod(value: UsageLimitPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setUsageLimitArn(value: String): Self = StObject.set(x, "usageLimitArn", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitArnUndefined: Self = StObject.set(x, "usageLimitArn", js.undefined)
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "usageLimitId", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitIdUndefined: Self = StObject.set(x, "usageLimitId", js.undefined)
    
    inline def setUsageType(value: UsageLimitUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
