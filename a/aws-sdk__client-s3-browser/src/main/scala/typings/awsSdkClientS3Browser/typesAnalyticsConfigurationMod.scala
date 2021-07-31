package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesAnalyticsFilterMod.AnalyticsFilter
import typings.awsSdkClientS3Browser.typesAnalyticsFilterMod.UnmarshalledAnalyticsFilter
import typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.StorageClassAnalysis
import typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.UnmarshalledStorageClassAnalysis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsConfigurationMod {
  
  trait AnalyticsConfiguration extends StObject {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    var Filter: js.UndefOr[AnalyticsFilter] = js.undefined
    
    /**
      * <p>The identifier used to represent an analytics configuration.</p>
      */
    var Id: String
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    var StorageClassAnalysis: typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.StorageClassAnalysis
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
  
  trait UnmarshalledAnalyticsConfiguration
    extends StObject
       with AnalyticsConfiguration {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledAnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsFilter] = js.undefined
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    @JSName("StorageClassAnalysis")
    var StorageClassAnalysis_UnmarshalledAnalyticsConfiguration: UnmarshalledStorageClassAnalysis
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
