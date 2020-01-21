package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePreRollConfiguration extends js.Object {
  /**
    * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  /**
    * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to exceed this duration, regardless of the total duration of ads that the ADS returns.
    */
  var MaxDurationSeconds: js.UndefOr[integer] = js.native
}

object LivePreRollConfiguration {
  @scala.inline
  def apply(AdDecisionServerUrl: string = null, MaxDurationSeconds: Int | Double = null): LivePreRollConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdDecisionServerUrl != null) __obj.updateDynamic("AdDecisionServerUrl")(AdDecisionServerUrl.asInstanceOf[js.Any])
    if (MaxDurationSeconds != null) __obj.updateDynamic("MaxDurationSeconds")(MaxDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePreRollConfiguration]
  }
}

