package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketInventoryConfigurationsOutputMod {
  
  trait ListBucketInventoryConfigurationsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>If sent in the request, the marker that is used as a starting point for this inventory configuration list response.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The list of inventory configurations for a bucket.</p>
      */
    var InventoryConfigurationList: js.UndefOr[js.Array[UnmarshalledInventoryConfiguration]] = js.undefined
    
    /**
      * <p>Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.undefined
  }
  object ListBucketInventoryConfigurationsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
    }
    
    extension [Self <: ListBucketInventoryConfigurationsOutput](x: Self) {
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      inline def setInventoryConfigurationList(value: js.Array[UnmarshalledInventoryConfiguration]): Self = StObject.set(x, "InventoryConfigurationList", value.asInstanceOf[js.Any])
      
      inline def setInventoryConfigurationListUndefined: Self = StObject.set(x, "InventoryConfigurationList", js.undefined)
      
      inline def setInventoryConfigurationListVarargs(value: UnmarshalledInventoryConfiguration*): Self = StObject.set(x, "InventoryConfigurationList", js.Array(value*))
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    }
  }
}
