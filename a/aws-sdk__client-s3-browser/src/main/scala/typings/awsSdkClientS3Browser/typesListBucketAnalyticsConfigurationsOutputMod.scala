package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketAnalyticsConfigurationsOutputMod {
  
  @js.native
  trait ListBucketAnalyticsConfigurationsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The list of analytics configurations for a bucket.</p>
      */
    var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.native
    
    /**
      * <p>The ContinuationToken that represents where this request began.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    
    /**
      * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.native
  }
  object ListBucketAnalyticsConfigurationsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
    }
    
    @scala.inline
    implicit class ListBucketAnalyticsConfigurationsOutputMutableBuilder[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsConfigurationList(value: js.Array[UnmarshalledAnalyticsConfiguration]): Self = StObject.set(x, "AnalyticsConfigurationList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsConfigurationListUndefined: Self = StObject.set(x, "AnalyticsConfigurationList", js.undefined)
      
      @scala.inline
      def setAnalyticsConfigurationListVarargs(value: UnmarshalledAnalyticsConfiguration*): Self = StObject.set(x, "AnalyticsConfigurationList", js.Array(value :_*))
      
      @scala.inline
      def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    }
  }
}
