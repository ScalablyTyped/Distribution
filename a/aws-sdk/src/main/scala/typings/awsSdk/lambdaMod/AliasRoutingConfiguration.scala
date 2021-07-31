package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasRoutingConfiguration extends StObject {
  
  /**
    * The second version, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[typings.awsSdk.lambdaMod.AdditionalVersionWeights] = js.undefined
}
object AliasRoutingConfiguration {
  
  @scala.inline
  def apply(): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
  
  @scala.inline
  implicit class AliasRoutingConfigurationMutableBuilder[Self <: AliasRoutingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalVersionWeights(value: AdditionalVersionWeights): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
  }
}
