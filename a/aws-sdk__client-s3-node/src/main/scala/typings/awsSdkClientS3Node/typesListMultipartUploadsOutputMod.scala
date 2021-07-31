package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesMultipartUploadMod.UnmarshalledMultipartUpload
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListMultipartUploadsOutputMod {
  
  trait ListMultipartUploadsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Name of the bucket to which the multipart upload was initiated.</p>
      */
    var Bucket: js.UndefOr[String] = js.undefined
    
    /**
      * _CommonPrefixList shape
      */
    var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.undefined
    
    /**
      * _Delimiter shape
      */
    var Delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.undefined
    
    /**
      * <p>Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The key at or after which the listing began.</p>
      */
    var KeyMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Maximum number of multipart uploads that could have been included in the response.</p>
      */
    var MaxUploads: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.</p>
      */
    var NextKeyMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.</p>
      */
    var NextUploadIdMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Upload ID after which listing began.</p>
      */
    var UploadIdMarker: js.UndefOr[String] = js.undefined
    
    /**
      * _MultipartUploadList shape
      */
    var Uploads: js.UndefOr[js.Array[UnmarshalledMultipartUpload]] = js.undefined
  }
  object ListMultipartUploadsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListMultipartUploadsOutput]
    }
    
    @scala.inline
    implicit class ListMultipartUploadsOutputMutableBuilder[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      @scala.inline
      def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = StObject.set(x, "CommonPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPrefixesUndefined: Self = StObject.set(x, "CommonPrefixes", js.undefined)
      
      @scala.inline
      def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = StObject.set(x, "CommonPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setKeyMarker(value: String): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
      
      @scala.inline
      def setMaxUploads(value: Double): Self = StObject.set(x, "MaxUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadsUndefined: Self = StObject.set(x, "MaxUploads", js.undefined)
      
      @scala.inline
      def setNextKeyMarker(value: String): Self = StObject.set(x, "NextKeyMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextKeyMarkerUndefined: Self = StObject.set(x, "NextKeyMarker", js.undefined)
      
      @scala.inline
      def setNextUploadIdMarker(value: String): Self = StObject.set(x, "NextUploadIdMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUploadIdMarkerUndefined: Self = StObject.set(x, "NextUploadIdMarker", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setUploadIdMarker(value: String): Self = StObject.set(x, "UploadIdMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdMarkerUndefined: Self = StObject.set(x, "UploadIdMarker", js.undefined)
      
      @scala.inline
      def setUploads(value: js.Array[UnmarshalledMultipartUpload]): Self = StObject.set(x, "Uploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsUndefined: Self = StObject.set(x, "Uploads", js.undefined)
      
      @scala.inline
      def setUploadsVarargs(value: UnmarshalledMultipartUpload*): Self = StObject.set(x, "Uploads", js.Array(value :_*))
    }
  }
}
