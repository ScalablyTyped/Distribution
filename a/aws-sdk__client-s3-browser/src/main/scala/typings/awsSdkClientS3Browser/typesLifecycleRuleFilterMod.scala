package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.LifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.UnmarshalledLifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleRuleFilterMod {
  
  trait LifecycleRuleFilter extends StObject {
    
    /**
      * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
      */
    var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
    
    /**
      * <p>Prefix identifying one or more objects to which the rule applies.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
      */
    var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.undefined
  }
  object LifecycleRuleFilter {
    
    inline def apply(): LifecycleRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleRuleFilter]
    }
    
    extension [Self <: LifecycleRuleFilter](x: Self) {
      
      inline def setAnd(value: LifecycleRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait UnmarshalledLifecycleRuleFilter
    extends StObject
       with LifecycleRuleFilter {
    
    /**
      * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
      */
    @JSName("And")
    var And_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledLifecycleRuleAndOperator] = js.undefined
    
    /**
      * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
      */
    @JSName("Tag")
    var Tag_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledTag] = js.undefined
  }
  object UnmarshalledLifecycleRuleFilter {
    
    inline def apply(): UnmarshalledLifecycleRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledLifecycleRuleFilter]
    }
    
    extension [Self <: UnmarshalledLifecycleRuleFilter](x: Self) {
      
      inline def setAnd(value: UnmarshalledLifecycleRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
