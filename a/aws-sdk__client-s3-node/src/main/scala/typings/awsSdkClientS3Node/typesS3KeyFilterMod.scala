package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesFilterRuleMod.FilterRule
import typings.awsSdkClientS3Node.typesFilterRuleMod.UnmarshalledFilterRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3KeyFilterMod {
  
  trait S3KeyFilter extends StObject {
    
    /**
      * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
      */
    var FilterRules: js.UndefOr[js.Array[FilterRule] | Iterable[FilterRule]] = js.undefined
  }
  object S3KeyFilter {
    
    inline def apply(): S3KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3KeyFilter]
    }
    
    extension [Self <: S3KeyFilter](x: Self) {
      
      inline def setFilterRules(value: js.Array[FilterRule] | Iterable[FilterRule]): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
      
      inline def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
      
      inline def setFilterRulesVarargs(value: FilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledS3KeyFilter
    extends StObject
       with S3KeyFilter {
    
    /**
      * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
      */
    @JSName("FilterRules")
    var FilterRules_UnmarshalledS3KeyFilter: js.UndefOr[js.Array[UnmarshalledFilterRule]] = js.undefined
  }
  object UnmarshalledS3KeyFilter {
    
    inline def apply(): UnmarshalledS3KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledS3KeyFilter]
    }
    
    extension [Self <: UnmarshalledS3KeyFilter](x: Self) {
      
      inline def setFilterRules(value: js.Array[UnmarshalledFilterRule]): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
      
      inline def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
      
      inline def setFilterRulesVarargs(value: UnmarshalledFilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value :_*))
    }
  }
}
