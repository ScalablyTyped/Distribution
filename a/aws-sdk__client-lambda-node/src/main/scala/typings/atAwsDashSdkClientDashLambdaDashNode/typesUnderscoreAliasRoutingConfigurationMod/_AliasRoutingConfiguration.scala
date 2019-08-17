package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AliasRoutingConfiguration extends js.Object {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  var AdditionalVersionWeights: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
}

object _AliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]]) = null): _AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AliasRoutingConfiguration]
  }
}

