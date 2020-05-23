package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consistency extends js.Object {
  var consistency: js.UndefOr[consistencies] = js.undefined
  var graphOptions: js.UndefOr[Language] = js.undefined
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  var serialConsistency: js.UndefOr[consistencies] = js.undefined
}

object Consistency {
  @scala.inline
  def apply(
    consistency: consistencies = null,
    graphOptions: Language = null,
    loadBalancing: LoadBalancingPolicy = null,
    readTimeout: js.UndefOr[Double] = js.undefined,
    retry: RetryPolicy = null,
    serialConsistency: consistencies = null
  ): Consistency = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (graphOptions != null) __obj.updateDynamic("graphOptions")(graphOptions.asInstanceOf[js.Any])
    if (loadBalancing != null) __obj.updateDynamic("loadBalancing")(loadBalancing.asInstanceOf[js.Any])
    if (!js.isUndefined(readTimeout)) __obj.updateDynamic("readTimeout")(readTimeout.get.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (serialConsistency != null) __obj.updateDynamic("serialConsistency")(serialConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consistency]
  }
}

