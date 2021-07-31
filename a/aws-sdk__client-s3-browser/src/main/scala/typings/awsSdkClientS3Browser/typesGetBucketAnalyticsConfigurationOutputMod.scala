package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketAnalyticsConfigurationOutputMod {
  
  trait GetBucketAnalyticsConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The configuration and any analyses for the analytics filter.</p>
      */
    var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.undefined
  }
  object GetBucketAnalyticsConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    implicit class GetBucketAnalyticsConfigurationOutputMutableBuilder[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsConfiguration(value: UnmarshalledAnalyticsConfiguration): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
    }
  }
}
