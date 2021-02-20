package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesRuleMod.Rule
import typings.awsSdkClientS3Browser.typesRuleMod.UnmarshalledRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleConfigurationMod {
  
  @js.native
  trait LifecycleConfiguration extends StObject {
    
    /**
      * _Rules shape
      */
    var Rules: js.Array[Rule] | Iterable[Rule] = js.native
  }
  object LifecycleConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[Rule] | Iterable[Rule]): LifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleConfiguration]
    }
    
    @scala.inline
    implicit class LifecycleConfigurationMutableBuilder[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[Rule] | Iterable[Rule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledLifecycleConfiguration extends LifecycleConfiguration {
    
    /**
      * _Rules shape
      */
    @JSName("Rules")
    var Rules_UnmarshalledLifecycleConfiguration: js.Array[UnmarshalledRule] = js.native
  }
  object UnmarshalledLifecycleConfiguration {
    
    @scala.inline
    def apply(Rules: js.Array[UnmarshalledRule]): UnmarshalledLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLifecycleConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledLifecycleConfigurationMutableBuilder[Self <: UnmarshalledLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
