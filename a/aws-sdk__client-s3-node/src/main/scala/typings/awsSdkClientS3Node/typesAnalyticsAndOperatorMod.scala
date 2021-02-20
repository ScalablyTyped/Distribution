package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsAndOperatorMod {
  
  @js.native
  trait AnalyticsAndOperator extends StObject {
    
    /**
      * <p>The prefix to use when evaluating an AND predicate.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>The list of tags to use when evaluating an AND predicate.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.native
  }
  object AnalyticsAndOperator {
    
    @scala.inline
    def apply(): AnalyticsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsAndOperator]
    }
    
    @scala.inline
    implicit class AnalyticsAndOperatorMutableBuilder[Self <: AnalyticsAndOperator] (val x: Self) extends AnyVal {
      
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
  trait UnmarshalledAnalyticsAndOperator extends AnalyticsAndOperator {
    
    /**
      * <p>The list of tags to use when evaluating an AND predicate.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledAnalyticsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
  }
  object UnmarshalledAnalyticsAndOperator {
    
    @scala.inline
    def apply(): UnmarshalledAnalyticsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAnalyticsAndOperator]
    }
    
    @scala.inline
    implicit class UnmarshalledAnalyticsAndOperatorMutableBuilder[Self <: UnmarshalledAnalyticsAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
