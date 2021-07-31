package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.AnalyticsAndOperator
import typings.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.UnmarshalledAnalyticsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsFilterMod {
  
  trait AnalyticsFilter extends StObject {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
      */
    var And: js.UndefOr[AnalyticsAndOperator] = js.undefined
    
    /**
      * <p>The prefix to use when evaluating an analytics filter.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The tag to use when evaluating an analytics filter.</p>
      */
    var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.undefined
  }
  object AnalyticsFilter {
    
    @scala.inline
    def apply(): AnalyticsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsFilter]
    }
    
    @scala.inline
    implicit class AnalyticsFilterMutableBuilder[Self <: AnalyticsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: AnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
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
  
  trait UnmarshalledAnalyticsFilter
    extends StObject
       with AnalyticsFilter {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
      */
    @JSName("And")
    var And_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledAnalyticsAndOperator] = js.undefined
    
    /**
      * <p>The tag to use when evaluating an analytics filter.</p>
      */
    @JSName("Tag")
    var Tag_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledTag] = js.undefined
  }
  object UnmarshalledAnalyticsFilter {
    
    @scala.inline
    def apply(): UnmarshalledAnalyticsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAnalyticsFilter]
    }
    
    @scala.inline
    implicit class UnmarshalledAnalyticsFilterMutableBuilder[Self <: UnmarshalledAnalyticsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: UnmarshalledAnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      @scala.inline
      def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
