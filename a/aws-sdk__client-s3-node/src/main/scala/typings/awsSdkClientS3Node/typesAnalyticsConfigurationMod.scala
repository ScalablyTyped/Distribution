package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesAnalyticsFilterMod.AnalyticsFilter
import typings.awsSdkClientS3Node.typesAnalyticsFilterMod.UnmarshalledAnalyticsFilter
import typings.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis
import typings.awsSdkClientS3Node.typesStorageClassAnalysisMod.UnmarshalledStorageClassAnalysis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsConfigurationMod {
  
  @js.native
  trait AnalyticsConfiguration extends StObject {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    var Filter: js.UndefOr[AnalyticsFilter] = js.native
    
    /**
      * <p>The identifier used to represent an analytics configuration.</p>
      */
    var Id: String = js.native
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    var StorageClassAnalysis: typings.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis = js.native
  }
  object AnalyticsConfiguration {
    
    @scala.inline
    def apply(Id: String, StorageClassAnalysis: StorageClassAnalysis): AnalyticsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsConfiguration]
    }
    
    @scala.inline
    implicit class AnalyticsConfigurationMutableBuilder[Self <: AnalyticsConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: AnalyticsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassAnalysis(value: StorageClassAnalysis): Self = StObject.set(x, "StorageClassAnalysis", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledAnalyticsConfiguration extends AnalyticsConfiguration {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledAnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsFilter] = js.native
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    @JSName("StorageClassAnalysis")
    var StorageClassAnalysis_UnmarshalledAnalyticsConfiguration: UnmarshalledStorageClassAnalysis = js.native
  }
  object UnmarshalledAnalyticsConfiguration {
    
    @scala.inline
    def apply(Id: String, StorageClassAnalysis: UnmarshalledStorageClassAnalysis): UnmarshalledAnalyticsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAnalyticsConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledAnalyticsConfigurationMutableBuilder[Self <: UnmarshalledAnalyticsConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: UnmarshalledAnalyticsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setStorageClassAnalysis(value: UnmarshalledStorageClassAnalysis): Self = StObject.set(x, "StorageClassAnalysis", value.asInstanceOf[js.Any])
    }
  }
}
