package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketMetricsConfigurationsOutputMod {
  
  trait ListBucketMetricsConfigurationsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The list of metrics configurations for a bucket.</p>
      */
    var MetricsConfigurationList: js.UndefOr[js.Array[UnmarshalledMetricsConfiguration]] = js.undefined
    
    /**
      * <p>The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.undefined
  }
  object ListBucketMetricsConfigurationsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
    }
    
    extension [Self <: ListBucketMetricsConfigurationsOutput](x: Self) {
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setMetricsConfigurationList(value: js.Array[UnmarshalledMetricsConfiguration]): Self = StObject.set(x, "MetricsConfigurationList", value.asInstanceOf[js.Any])
      
      inline def setMetricsConfigurationListUndefined: Self = StObject.set(x, "MetricsConfigurationList", js.undefined)
      
      inline def setMetricsConfigurationListVarargs(value: UnmarshalledMetricsConfiguration*): Self = StObject.set(x, "MetricsConfigurationList", js.Array(value*))
      
      inline def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    }
  }
}
