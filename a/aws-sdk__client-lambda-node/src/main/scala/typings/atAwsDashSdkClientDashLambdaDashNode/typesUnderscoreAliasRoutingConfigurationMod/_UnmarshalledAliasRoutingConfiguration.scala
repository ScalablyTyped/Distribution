package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAliasRoutingConfiguration extends _AliasRoutingConfiguration {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  @JSName("AdditionalVersionWeights")
  var AdditionalVersionWeights__UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object _UnmarshalledAliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: StringDictionary[Double] = null): _UnmarshalledAliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights)
    __obj.asInstanceOf[_UnmarshalledAliasRoutingConfiguration]
  }
}

