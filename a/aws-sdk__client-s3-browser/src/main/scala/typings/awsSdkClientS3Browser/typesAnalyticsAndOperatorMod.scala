package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsAndOperatorMod {
  
  trait AnalyticsAndOperator extends StObject {
    
    /**
      * <p>The prefix to use when evaluating an AND predicate.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The list of tags to use when evaluating an AND predicate.</p>
      */
    var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.undefined
  }
  object AnalyticsAndOperator {
    
    inline def apply(): AnalyticsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsAndOperator]
    }
    
    extension [Self <: AnalyticsAndOperator](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTags(value: js.Array[Tag] | js.Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  trait UnmarshalledAnalyticsAndOperator
    extends StObject
       with AnalyticsAndOperator {
    
    /**
      * <p>The list of tags to use when evaluating an AND predicate.</p>
      */
    @JSName("Tags")
    var Tags_UnmarshalledAnalyticsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
  }
  object UnmarshalledAnalyticsAndOperator {
    
    inline def apply(): UnmarshalledAnalyticsAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAnalyticsAndOperator]
    }
    
    extension [Self <: UnmarshalledAnalyticsAndOperator](x: Self) {
      
      inline def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
}
