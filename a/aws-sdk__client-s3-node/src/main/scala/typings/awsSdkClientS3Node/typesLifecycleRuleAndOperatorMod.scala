package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleRuleAndOperatorMod {
  
  @js.native
  trait LifecycleRuleAndOperator extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.native
  }
  object LifecycleRuleAndOperator {
    
    @scala.inline
    def apply(): LifecycleRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleRuleAndOperator]
    }
    
    @scala.inline
    implicit class LifecycleRuleAndOperatorMutableBuilder[Self <: LifecycleRuleAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[Tag] | Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledLifecycleRuleAndOperator extends LifecycleRuleAndOperator {
    
    /**
      * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledLifecycleRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
  }
  object UnmarshalledLifecycleRuleAndOperator {
    
    @scala.inline
    def apply(): UnmarshalledLifecycleRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledLifecycleRuleAndOperator]
    }
    
    @scala.inline
    implicit class UnmarshalledLifecycleRuleAndOperatorMutableBuilder[Self <: UnmarshalledLifecycleRuleAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
