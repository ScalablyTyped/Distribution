package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsV2Output extends StObject {
  
  /**
    * All of the keys (up to 1,000) rolled up into a common prefix count as a single return when calculating the number of returns. A response can contain CommonPrefixes only if you specify a delimiter.  CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter.  CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the number of returns. 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.undefined
  
  /**
    *  If ContinuationToken was sent with the request, it is included in the response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the CommonPrefixes collection. These rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against the MaxKeys value.
    */
  var Delimiter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Delimiter] = js.undefined
  
  /**
    * Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify the encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, Prefix, Key, and StartAfter.
    */
  var EncodingType: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.EncodingType] = js.undefined
  
  /**
    * Set to false if all of the results were returned. Set to true if more keys are available to return. If the number of results exceeds that specified by MaxKeys, all of the results might not be returned.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * KeyCount is the number of keys returned with this request. KeyCount will always be less than or equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
    */
  var KeyCount: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.KeyCount] = js.undefined
  
  /**
    * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key names. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.MaxKeys] = js.undefined
  
  /**
    * The bucket name. When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  
  /**
    *  NextContinuationToken is sent when isTruncated is true, which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  Keys that begin with the indicated prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * If StartAfter was sent with the request, it is included in the response.
    */
  var StartAfter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.StartAfter] = js.undefined
}
object ListObjectsV2Output {
  
  inline def apply(): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectsV2Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListObjectsV2Output] (val x: Self) extends AnyVal {
    
    inline def setCommonPrefixes(value: CommonPrefixList): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
    
    inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
    
    inline def setCommonPrefixesVarargs(value: CommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value*))
    
    inline def setContents(value: ObjectList): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
    
    inline def setContentsVarargs(value: Object*): Self = StObject.set(x, "Contents", js.Array(value*))
    
    inline def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setKeyCount(value: KeyCount): Self = StObject.set(x, "KeyCount", value.asInstanceOf[js.Any])
    
    inline def setKeyCountUndefined: Self = StObject.set(x, "KeyCount", js.undefined)
    
    inline def setMaxKeys(value: MaxKeys): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
    
    inline def setName(value: BucketName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setStartAfter(value: StartAfter): Self = StObject.set(x, "StartAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "StartAfter", js.undefined)
  }
}
