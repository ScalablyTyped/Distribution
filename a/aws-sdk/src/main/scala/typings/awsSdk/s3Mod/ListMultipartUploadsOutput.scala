package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultipartUploadsOutput extends StObject {
  
  /**
    * The name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the delimiter in a CommonPrefixes element. The distinct key prefixes are returned in the Prefix child element.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  
  /**
    * Contains the delimiter you specified in the request. If you don't specify a delimiter in your request, this element is absent from the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.undefined
  
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, KeyMarker, Prefix, NextKeyMarker, Key.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.undefined
  
  /**
    * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.undefined
  
  /**
    * The key at or after which the listing began.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.undefined
  
  /**
    * Maximum number of multipart uploads that could have been included in the response.
    */
  var MaxUploads: js.UndefOr[typings.awsSdk.s3Mod.MaxUploads] = js.undefined
  
  /**
    * When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsSdk.s3Mod.NextKeyMarker] = js.undefined
  
  /**
    * When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.
    */
  var NextUploadIdMarker: js.UndefOr[typings.awsSdk.s3Mod.NextUploadIdMarker] = js.undefined
  
  /**
    * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * Upload ID after which listing began.
    */
  var UploadIdMarker: js.UndefOr[typings.awsSdk.s3Mod.UploadIdMarker] = js.undefined
  
  /**
    * Container for elements related to a particular multipart upload. A response can contain zero or more Upload elements.
    */
  var Uploads: js.UndefOr[MultipartUploadList] = js.undefined
}
object ListMultipartUploadsOutput {
  
  inline def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  
  extension [Self <: ListMultipartUploadsOutput](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setCommonPrefixes(value: CommonPrefixList): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
    
    inline def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
    
    inline def setCommonPrefixesVarargs(value: CommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setKeyMarker(value: KeyMarker): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
    
    inline def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
    
    inline def setMaxUploads(value: MaxUploads): Self = StObject.set(x, "MaxUploads", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadsUndefined: Self = StObject.set(x, "MaxUploads", js.undefined)
    
    inline def setNextKeyMarker(value: NextKeyMarker): Self = StObject.set(x, "NextKeyMarker", value.asInstanceOf[js.Any])
    
    inline def setNextKeyMarkerUndefined: Self = StObject.set(x, "NextKeyMarker", js.undefined)
    
    inline def setNextUploadIdMarker(value: NextUploadIdMarker): Self = StObject.set(x, "NextUploadIdMarker", value.asInstanceOf[js.Any])
    
    inline def setNextUploadIdMarkerUndefined: Self = StObject.set(x, "NextUploadIdMarker", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setUploadIdMarker(value: UploadIdMarker): Self = StObject.set(x, "UploadIdMarker", value.asInstanceOf[js.Any])
    
    inline def setUploadIdMarkerUndefined: Self = StObject.set(x, "UploadIdMarker", js.undefined)
    
    inline def setUploads(value: MultipartUploadList): Self = StObject.set(x, "Uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsUndefined: Self = StObject.set(x, "Uploads", js.undefined)
    
    inline def setUploadsVarargs(value: MultipartUpload*): Self = StObject.set(x, "Uploads", js.Array(value :_*))
  }
}
