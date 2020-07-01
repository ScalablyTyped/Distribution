package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfiguration extends js.Object {
  /**
    * The second version, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[typings.awsSdk.lambdaMod.AdditionalVersionWeights] = js.native
}

object AliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: AdditionalVersionWeights = null): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
}

