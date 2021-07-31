package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectVersionsRequest extends StObject {
  
  /**
    * The bucket name that contains the objects. 
    */
  var Bucket: BucketName
  
  /**
    * A delimiter is a character that you specify to group keys. All keys that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a single result element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not returned elsewhere in the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.undefined
  
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Specifies the key to start with when listing objects in a bucket.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.undefined
  
  /**
    * Sets the maximum number of keys returned in the response. By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more. If additional keys satisfy the search criteria, but were not returned because max-keys was exceeded, the response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker and version-id-marker.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.undefined
  
  /**
    * Use this parameter to select only those keys that begin with the specified prefix. You can use prefixes to separate a bucket into different groupings of keys. (You can think of using prefix to make groups in the same way you'd use a folder in a file system.) You can use prefix with delimiter to roll up numerous objects into a single result under CommonPrefixes. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * Specifies the object version you want to start listing from.
    */
  var VersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.VersionIdMarker] = js.undefined
}
object ListObjectVersionsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): ListObjectVersionsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsRequest]
  }
  
  @scala.inline
  implicit class ListObjectVersionsRequestMutableBuilder[Self <: ListObjectVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    @scala.inline
    def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setKeyMarker(value: KeyMarker): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setVersionIdMarker(value: VersionIdMarker): Self = StObject.set(x, "VersionIdMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdMarkerUndefined: Self = StObject.set(x, "VersionIdMarker", js.undefined)
  }
}
