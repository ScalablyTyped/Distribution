package typings.cassandraDriver

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsistency extends js.Object {
  var consistency: js.UndefOr[consistencies] = js.undefined
  var graphOptions: js.UndefOr[AnonLanguage] = js.undefined
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  var serialConsistency: js.UndefOr[consistencies] = js.undefined
}

object AnonConsistency {
  @scala.inline
  def apply(
    consistency: consistencies = null,
    graphOptions: AnonLanguage = null,
    loadBalancing: LoadBalancingPolicy = null,
    readTimeout: Int | Double = null,
    retry: RetryPolicy = null,
    serialConsistency: consistencies = null
  ): AnonConsistency = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (graphOptions != null) __obj.updateDynamic("graphOptions")(graphOptions.asInstanceOf[js.Any])
    if (loadBalancing != null) __obj.updateDynamic("loadBalancing")(loadBalancing.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (serialConsistency != null) __obj.updateDynamic("serialConsistency")(serialConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsistency]
  }
}

