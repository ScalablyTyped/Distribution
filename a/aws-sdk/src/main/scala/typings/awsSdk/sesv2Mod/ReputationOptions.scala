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
  def apply(): ReputationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReputationOptions]
  }
  @scala.inline
  implicit class ReputationOptionsOps[Self <: ReputationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastFreshStart(value: LastFreshStart): Self = this.set("LastFreshStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFreshStart: Self = this.set("LastFreshStart", js.undefined)
    @scala.inline
    def setReputationMetricsEnabled(value: Enabled): Self = this.set("ReputationMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReputationMetricsEnabled: Self = this.set("ReputationMetricsEnabled", js.undefined)
  }
  
}

