package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod.AnalyticsAndOperator
import typings.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod.UnmarshalledAnalyticsAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
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
    var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.undefined
  }
  object AnalyticsFilter {
    
    inline def apply(): AnalyticsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsFilter]
    }
    
    extension [Self <: AnalyticsFilter](x: Self) {
      
      inline def setAnd(value: AnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
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
    
    inline def apply(): UnmarshalledAnalyticsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAnalyticsFilter]
    }
    
    extension [Self <: UnmarshalledAnalyticsFilter](x: Self) {
      
      inline def setAnd(value: UnmarshalledAnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
