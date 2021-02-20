package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesMetricsAndOperatorMod.MetricsAndOperator
import typings.awsSdkClientS3Node.typesMetricsAndOperatorMod.UnmarshalledMetricsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsFilterMod {
  
  @js.native
  trait MetricsFilter extends StObject {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
      */
    var And: js.UndefOr[MetricsAndOperator] = js.native
    
    /**
      * <p>The prefix used when evaluating a metrics filter.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>The tag used when evaluating a metrics filter.</p>
      */
    var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.native
  }
  object MetricsFilter {
    
    @scala.inline
    def apply(): MetricsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricsFilter]
    }
    
    @scala.inline
    implicit class MetricsFilterMutableBuilder[Self <: MetricsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: MetricsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMetricsFilter extends MetricsFilter {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
      */
    @JSName("And")
    var And_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledMetricsAndOperator] = js.native
    
    /**
      * <p>The tag used when evaluating a metrics filter.</p>
      */
    @JSName("Tag")
    var Tag_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledTag] = js.native
  }
  object UnmarshalledMetricsFilter {
    
    @scala.inline
    def apply(): UnmarshalledMetricsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMetricsFilter]
    }
    
    @scala.inline
    implicit class UnmarshalledMetricsFilterMutableBuilder[Self <: UnmarshalledMetricsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: UnmarshalledMetricsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      @scala.inline
      def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
