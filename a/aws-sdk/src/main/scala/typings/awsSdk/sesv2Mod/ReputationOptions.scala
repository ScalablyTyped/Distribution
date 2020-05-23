package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReputationOptions extends js.Object {
  /**
    * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
    */
  var LastFreshStart: js.UndefOr[typings.awsSdk.sesv2Mod.LastFreshStart] = js.native
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.native
}

object ReputationOptions {
  @scala.inline
  def apply(
    LastFreshStart: LastFreshStart = null,
    ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  ): ReputationOptions = {
    val __obj = js.Dynamic.literal()
    if (LastFreshStart != null) __obj.updateDynamic("LastFreshStart")(LastFreshStart.asInstanceOf[js.Any])
    if (!js.isUndefined(ReputationMetricsEnabled)) __obj.updateDynamic("ReputationMetricsEnabled")(ReputationMetricsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReputationOptions]
  }
}

