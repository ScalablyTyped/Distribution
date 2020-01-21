package typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAliasRoutingConfiguration extends AliasRoutingConfiguration {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  @JSName("AdditionalVersionWeights")
  var AdditionalVersionWeights_UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object UnmarshalledAliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: StringDictionary[Double] = null): UnmarshalledAliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAliasRoutingConfiguration]
  }
}

