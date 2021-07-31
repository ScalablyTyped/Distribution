package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsAndOperatorMod {
  
  trait MetricsAndOperator extends StObject {
    
    /**
      * <p>The prefix used when evaluating an AND predicate.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The list of tags used when evaluating an AND predicate.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.undefined
  }
  object MetricsAndOperator {
    
    @scala.inline
    def apply(): MetricsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricsAndOperator]
    }
    
    @scala.inline
    implicit class MetricsAndOperatorMutableBuilder[Self <: MetricsAndOperator] (val x: Self) extends AnyVal {
      
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
  
  trait UnmarshalledMetricsAndOperator
    extends StObject
       with MetricsAndOperator {
    
    /**
      * <p>The list of tags used when evaluating an AND predicate.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
  }
  object UnmarshalledMetricsAndOperator {
    
    @scala.inline
    def apply(): UnmarshalledMetricsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMetricsAndOperator]
    }
    
    @scala.inline
    implicit class UnmarshalledMetricsAndOperatorMutableBuilder[Self <: UnmarshalledMetricsAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
