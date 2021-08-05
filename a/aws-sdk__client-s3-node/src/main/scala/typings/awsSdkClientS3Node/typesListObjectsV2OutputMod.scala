package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesObjectMod.UnmarshalledObject
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListObjectsV2OutputMod {
  
  trait ListObjectsV2Output
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by delimiter</p>
      */
    var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.undefined
    
    /**
      * <p>Metadata about each object returned.</p>
      */
    var Contents: js.UndefOr[js.Array[UnmarshalledObject]] = js.undefined
    
    /**
      * <p>ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A delimiter is a character you use to group keys.</p>
      */
    var Delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.undefined
    
    /**
      * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys </p>
      */
    var KeyCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
      */
    var MaxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Name of the bucket to list.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>NextContinuationToken is sent when isTruncated is true which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Limits the response to keys that begin with the specified prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket</p>
      */
    var StartAfter: js.UndefOr[String] = js.undefined
  }
  object ListObjectsV2Output {
    
    inline def apply($metadata: ResponseMetadata): ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListObjectsV2Output]
    }
    
    extension [Self <: ListObjectsV2Output](x: Self) {
      
      inline def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
      
      inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
      
      inline def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
      
      inline def setContents(value: js.Array[UnmarshalledObject]): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      inline def setContentsVarargs(value: UnmarshalledObject*): Self = StObject.set(x, "Contents", js.Array(value :_*))
      
      inline def setContinuationToken(value: String): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      inline def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setKeyCount(value: Double): Self = StObject.set(x, "KeyCount", value.asInstanceOf[js.Any])
      
      inline def setKeyCountUndefined: Self = StObject.set(x, "KeyCount", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setNextContinuationToken(value: String): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
      
      inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setStartAfter(value: String): Self = StObject.set(x, "StartAfter", value.asInstanceOf[js.Any])
      
      inline def setStartAfterUndefined: Self = StObject.set(x, "StartAfter", js.undefined)
    }
  }
}
