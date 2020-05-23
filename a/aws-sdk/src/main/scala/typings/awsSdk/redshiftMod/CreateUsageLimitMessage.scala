package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUsageLimitMessage extends js.Object {
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
    LimitType: UsageLimitLimitType,
    BreachAction: UsageLimitBreachAction = null,
    Period: UsageLimitPeriod = null,
    Tags: TagList = null
  ): CreateUsageLimitMessage = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], FeatureType = FeatureType.asInstanceOf[js.Any], LimitType = LimitType.asInstanceOf[js.Any])
    if (BreachAction != null) __obj.updateDynamic("BreachAction")(BreachAction.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsageLimitMessage]
  }
}

