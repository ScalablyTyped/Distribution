package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleRuleAndOperatorMod {
  
  trait LifecycleRuleAndOperator extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
  }
  object LifecycleRuleAndOperator {
    
    inline def apply(): LifecycleRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleRuleAndOperator]
    }
    
    extension [Self <: LifecycleRuleAndOperator](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTags(value: js.Array[Tag] | Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledLifecycleRuleAndOperator
    extends StObject
       with LifecycleRuleAndOperator {
    
    /**
      * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledLifecycleRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
  }
  object UnmarshalledLifecycleRuleAndOperator {
    
    inline def apply(): UnmarshalledLifecycleRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledLifecycleRuleAndOperator]
    }
    
    extension [Self <: UnmarshalledLifecycleRuleAndOperator](x: Self) {
      
      inline def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
