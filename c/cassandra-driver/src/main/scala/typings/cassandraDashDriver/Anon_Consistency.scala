package typings.cassandraDashDriver

import typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDashDriver.libTypesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consistency extends js.Object {
  var consistency: js.UndefOr[consistencies] = js.undefined
  var graphOptions: js.UndefOr[Anon_Language] = js.undefined
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  var serialConsistency: js.UndefOr[consistencies] = js.undefined
}

object Anon_Consistency {
  @scala.inline
  def apply(
    consistency: consistencies = null,
    graphOptions: Anon_Language = null,
    loadBalancing: LoadBalancingPolicy = null,
    readTimeout: Int | Double = null,
    retry: RetryPolicy = null,
    serialConsistency: consistencies = null
  ): Anon_Consistency = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (graphOptions != null) __obj.updateDynamic("graphOptions")(graphOptions.asInstanceOf[js.Any])
    if (loadBalancing != null) __obj.updateDynamic("loadBalancing")(loadBalancing.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (serialConsistency != null) __obj.updateDynamic("serialConsistency")(serialConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Consistency]
  }
}

