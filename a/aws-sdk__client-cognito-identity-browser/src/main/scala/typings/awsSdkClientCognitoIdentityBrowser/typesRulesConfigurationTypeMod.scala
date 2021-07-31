package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.MappingRule
import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.UnmarshalledMappingRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRulesConfigurationTypeMod {
  
  trait RulesConfigurationType extends StObject {
    
    /**
      * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
      */
    var Rules: js.Array[MappingRule] | Iterable[MappingRule]
  }
  object RulesConfigurationType {
    
    @scala.inline
    def apply(Rules: js.Array[MappingRule] | Iterable[MappingRule]): RulesConfigurationType = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesConfigurationType]
    }
    
    @scala.inline
    implicit class RulesConfigurationTypeMutableBuilder[Self <: RulesConfigurationType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[MappingRule] | Iterable[MappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: MappingRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
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
    
    @scala.inline
    def apply(Rules: js.Array[UnmarshalledMappingRule]): UnmarshalledRulesConfigurationType = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRulesConfigurationType]
    }
    
    @scala.inline
    implicit class UnmarshalledRulesConfigurationTypeMutableBuilder[Self <: UnmarshalledRulesConfigurationType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledMappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledMappingRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
