package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketAnalyticsConfigurationsOutputMod {
  
  trait ListBucketAnalyticsConfigurationsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The list of analytics configurations for a bucket.</p>
      */
    var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.undefined
    
    /**
      * <p>The ContinuationToken that represents where this request began.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.undefined
  }
  object ListBucketAnalyticsConfigurationsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
      
      inline def setAnalyticsConfigurationList(value: js.Array[UnmarshalledAnalyticsConfiguration]): Self = StObject.set(x, "AnalyticsConfigurationList", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsConfigurationListUndefined: Self = StObject.set(x, "AnalyticsConfigurationList", js.undefined)
      
      inline def setAnalyticsConfigurationListVarargs(value: UnmarshalledAnalyticsConfiguration*): Self = StObject.set(x, "AnalyticsConfigurationList", js.Array(value*))
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    }
  }
}
