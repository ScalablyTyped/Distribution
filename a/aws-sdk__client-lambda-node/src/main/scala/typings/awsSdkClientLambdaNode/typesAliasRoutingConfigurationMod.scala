package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasRoutingConfigurationMod {
  
  trait AliasRoutingConfiguration extends StObject {
    
    /**
      * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
      */
    var AdditionalVersionWeights: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
  }
  object AliasRoutingConfiguration {
    
    inline def apply(): AliasRoutingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasRoutingConfiguration]
    }
    
    extension [Self <: AliasRoutingConfiguration](x: Self) {
      
      inline def setAdditionalVersionWeights(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
      
      inline def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
    }
  }
  
  trait UnmarshalledAliasRoutingConfiguration
    extends StObject
       with AliasRoutingConfiguration {
    
    /**
      * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
      */
    @JSName("AdditionalVersionWeights")
    var AdditionalVersionWeights_UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object UnmarshalledAliasRoutingConfiguration {
    
    inline def apply(): UnmarshalledAliasRoutingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAliasRoutingConfiguration]
    }
    
    extension [Self <: UnmarshalledAliasRoutingConfiguration](x: Self) {
      
      inline def setAdditionalVersionWeights(value: StringDictionary[Double]): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
      
      inline def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
    }
  }
}
