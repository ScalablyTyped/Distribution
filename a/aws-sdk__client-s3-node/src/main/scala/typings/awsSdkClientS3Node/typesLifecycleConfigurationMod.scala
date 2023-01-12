package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesRuleMod.Rule
import typings.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleConfigurationMod {
  
  trait LifecycleConfiguration extends StObject {
    
    /**
      * _Rules shape
      */
    var Rules: js.Array[Rule] | js.Iterable[Rule]
  }
  object LifecycleConfiguration {
    
    inline def apply(Rules: js.Array[Rule] | js.Iterable[Rule]): LifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[Rule] | js.Iterable[Rule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
  
  trait UnmarshalledLifecycleConfiguration
    extends StObject
       with LifecycleConfiguration {
    
    /**
      * _Rules shape
      */
    @JSName("Rules")
    var Rules_UnmarshalledLifecycleConfiguration: js.Array[UnmarshalledRule]
  }
  object UnmarshalledLifecycleConfiguration {
    
    inline def apply(Rules: js.Array[UnmarshalledRule]): UnmarshalledLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLifecycleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[UnmarshalledRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: UnmarshalledRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
