package typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasRoutingConfiguration extends js.Object {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  var AdditionalVersionWeights: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
}

object AliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]]) = null): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
}

