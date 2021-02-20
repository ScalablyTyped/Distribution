package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketMetricsConfigurationsOutputMod {
  
  @js.native
  trait ListBucketMetricsConfigurationsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    
    /**
      * <p>Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The list of metrics configurations for a bucket.</p>
      */
    var MetricsConfigurationList: js.UndefOr[js.Array[UnmarshalledMetricsConfiguration]] = js.native
    
    /**
      * <p>The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.native
  }
  object ListBucketMetricsConfigurationsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
    }
    
    @scala.inline
    implicit class ListBucketMetricsConfigurationsOutputMutableBuilder[Self <: ListBucketMetricsConfigurationsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setMetricsConfigurationList(value: js.Array[UnmarshalledMetricsConfiguration]): Self = StObject.set(x, "MetricsConfigurationList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsConfigurationListUndefined: Self = StObject.set(x, "MetricsConfigurationList", js.undefined)
      
      @scala.inline
      def setMetricsConfigurationListVarargs(value: UnmarshalledMetricsConfiguration*): Self = StObject.set(x, "MetricsConfigurationList", js.Array(value :_*))
      
      @scala.inline
      def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    }
  }
}
