package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageLimit extends js.Object {
  /**
    * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
    */
  var Amount: js.UndefOr[Long] = js.native
  /**
    * The action that Amazon Redshift takes when the limit is reached. Possible values are:     log - To log an event in a system table. The default is log.    emit-metric - To emit CloudWatch metrics.    disable - To disable the feature until the next usage period begins.  
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  /**
    * The identifier of the cluster with a usage limit.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Redshift feature to which the limit applies.
    */
  var FeatureType: js.UndefOr[UsageLimitFeatureType] = js.native
  /**
    * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
    */
  var LimitType: js.UndefOr[UsageLimitLimitType] = js.native
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly. 
    */
  var Period: js.UndefOr[UsageLimitPeriod] = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The identifier of the usage limit.
    */
  var UsageLimitId: js.UndefOr[String] = js.native
}

object UsageLimit {
  @scala.inline
  def apply(
    Amount: js.UndefOr[Long] = js.undefined,
    BreachAction: UsageLimitBreachAction = null,
    ClusterIdentifier: String = null,
    FeatureType: UsageLimitFeatureType = null,
    LimitType: UsageLimitLimitType = null,
    Period: UsageLimitPeriod = null,
    Tags: TagList = null,
    UsageLimitId: String = null
  ): UsageLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Amount)) __obj.updateDynamic("Amount")(Amount.get.asInstanceOf[js.Any])
    if (BreachAction != null) __obj.updateDynamic("BreachAction")(BreachAction.asInstanceOf[js.Any])
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (FeatureType != null) __obj.updateDynamic("FeatureType")(FeatureType.asInstanceOf[js.Any])
    if (LimitType != null) __obj.updateDynamic("LimitType")(LimitType.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UsageLimitId != null) __obj.updateDynamic("UsageLimitId")(UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageLimit]
  }
}

