package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesMetricsAndOperatorMod.MetricsAndOperator
import typings.awsSdkClientS3Browser.typesMetricsAndOperatorMod.UnmarshalledMetricsAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricsFilterMod {
  
  trait MetricsFilter extends StObject {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
      */
    var And: js.UndefOr[MetricsAndOperator] = js.undefined
    
    /**
      * <p>The prefix used when evaluating a metrics filter.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The tag used when evaluating a metrics filter.</p>
      */
    var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.undefined
  }
  object MetricsFilter {
    
    inline def apply(): MetricsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricsFilter]
    }
    
    extension [Self <: MetricsFilter](x: Self) {
      
      inline def setAnd(value: MetricsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait UnmarshalledMetricsFilter
    extends StObject
       with MetricsFilter {
    
    /**
      * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
      */
    @JSName("And")
    var And_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledMetricsAndOperator] = js.undefined
    
    /**
      * <p>The tag used when evaluating a metrics filter.</p>
      */
    @JSName("Tag")
    var Tag_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledTag] = js.undefined
  }
  object UnmarshalledMetricsFilter {
    
    inline def apply(): UnmarshalledMetricsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMetricsFilter]
    }
    
    extension [Self <: UnmarshalledMetricsFilter](x: Self) {
      
      inline def setAnd(value: UnmarshalledMetricsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      inline def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
