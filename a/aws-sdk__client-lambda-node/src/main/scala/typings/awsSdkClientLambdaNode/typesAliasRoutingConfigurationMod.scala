package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasRoutingConfigurationMod {
  
  @js.native
  trait AliasRoutingConfiguration extends StObject {
    
    /**
      * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
      */
    var AdditionalVersionWeights: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.native
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
      def setAdditionalVersionWeights(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAliasRoutingConfiguration extends AliasRoutingConfiguration {
    
    /**
      * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
      */
    @JSName("AdditionalVersionWeights")
    var AdditionalVersionWeights_UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.native
  }
  object UnmarshalledAliasRoutingConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledAliasRoutingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAliasRoutingConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledAliasRoutingConfigurationMutableBuilder[Self <: UnmarshalledAliasRoutingConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalVersionWeights(value: StringDictionary[Double]): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
    }
  }
}
