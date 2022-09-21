package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.MappingRule
import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.UnmarshalledMappingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRulesConfigurationTypeMod {
  
  trait RulesConfigurationType extends StObject {
    
    /**
      * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
      */
    var Rules: js.Array[MappingRule] | js.Iterable[MappingRule]
  }
  object RulesConfigurationType {
    
    inline def apply(Rules: js.Array[MappingRule] | js.Iterable[MappingRule]): RulesConfigurationType = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesConfigurationType]
    }
    
    extension [Self <: RulesConfigurationType](x: Self) {
      
      inline def setRules(value: js.Array[MappingRule] | js.Iterable[MappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: MappingRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
  
  trait UnmarshalledRulesConfigurationType
    extends StObject
       with RulesConfigurationType {
    
    /**
      * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledRulesConfigurationType: js.Array[UnmarshalledMappingRule]
  }
  object UnmarshalledRulesConfigurationType {
    
    inline def apply(Rules: js.Array[UnmarshalledMappingRule]): UnmarshalledRulesConfigurationType = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRulesConfigurationType]
    }
    
    extension [Self <: UnmarshalledRulesConfigurationType](x: Self) {
      
      inline def setRules(value: js.Array[UnmarshalledMappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: UnmarshalledMappingRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
