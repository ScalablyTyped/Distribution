package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesFilterRuleMod.FilterRule
import typings.awsSdkClientS3Browser.typesFilterRuleMod.UnmarshalledFilterRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3KeyFilterMod {
  
  @js.native
  trait S3KeyFilter extends StObject {
    
    /**
      * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
      */
    var FilterRules: js.UndefOr[js.Array[FilterRule] | Iterable[FilterRule]] = js.native
  }
  object S3KeyFilter {
    
    @scala.inline
    def apply(): S3KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3KeyFilter]
    }
    
    @scala.inline
    implicit class S3KeyFilterMutableBuilder[Self <: S3KeyFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterRules(value: js.Array[FilterRule] | Iterable[FilterRule]): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
      
      @scala.inline
      def setFilterRulesVarargs(value: FilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledS3KeyFilter extends S3KeyFilter {
    
    /**
      * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
      */
    @JSName("FilterRules")
    var FilterRules_UnmarshalledS3KeyFilter: js.UndefOr[js.Array[UnmarshalledFilterRule]] = js.native
  }
  object UnmarshalledS3KeyFilter {
    
    @scala.inline
    def apply(): UnmarshalledS3KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledS3KeyFilter]
    }
    
    @scala.inline
    implicit class UnmarshalledS3KeyFilterMutableBuilder[Self <: UnmarshalledS3KeyFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterRules(value: js.Array[UnmarshalledFilterRule]): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
      
      @scala.inline
      def setFilterRulesVarargs(value: UnmarshalledFilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value :_*))
    }
  }
}
