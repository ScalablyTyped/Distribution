package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUsageLimitMessage extends StObject {
  
  /**
    * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number. 
    */
  var Amount: Long = js.native
  
  /**
    * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about this parameter, see UsageLimit.
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  
  /**
    * The identifier of the cluster that you want to limit usage.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The Amazon Redshift feature that you want to limit.
    */
  var FeatureType: UsageLimitFeatureType = js.native
  
  /**
    * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is spectrum, then LimitType must be data-scanned. If FeatureType is concurrency-scaling, then LimitType must be time. 
    */
  var LimitType: UsageLimitLimitType = js.native
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly. 
    */
  var Period: js.UndefOr[UsageLimitPeriod] = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateUsageLimitMessage {
  
  @scala.inline
  def apply(
    Amount: Long,
    ClusterIdentifier: String,
    FeatureType: UsageLimitFeatureType,
    LimitType: UsageLimitLimitType
  ): CreateUsageLimitMessage = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], FeatureType = FeatureType.asInstanceOf[js.Any], LimitType = LimitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsageLimitMessage]
  }
  
  @scala.inline
  implicit class CreateUsageLimitMessageMutableBuilder[Self <: CreateUsageLimitMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Long): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachActionUndefined: Self = StObject.set(x, "BreachAction", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureType(value: UsageLimitFeatureType): Self = StObject.set(x, "FeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitType(value: UsageLimitLimitType): Self = StObject.set(x, "LimitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: UsageLimitPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
