package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListObjectVersionsInputMod {
  
  trait ListObjectVersionsInput
    extends StObject
       with _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Whether to use the bucket name as the endpoint for this request. The bucket
      * name must be a domain name with a CNAME record alias to an appropriate virtual
      * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
      * record of:
      *
      * ```
      * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
      * ```
      *
      * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
      */
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * _BucketName shape
      */
    var Bucket: String
    
    /**
      * <p>A delimiter is a character you use to group keys.</p>
      */
    var Delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.undefined
    
    /**
      * <p>Specifies the key to start with when listing objects in a bucket.</p>
      */
    var KeyMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
      */
    var MaxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Limits the response to keys that begin with the specified prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies the object version you want to start listing from.</p>
      */
    var VersionIdMarker: js.UndefOr[String] = js.undefined
  }
  object ListObjectVersionsInput {
    
    @scala.inline
    def apply(Bucket: String): ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListObjectVersionsInput]
    }
    
    @scala.inline
    implicit class ListObjectVersionsInputMutableBuilder[Self <: ListObjectVersionsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$bucketEndpoint(value: String): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      @scala.inline
      def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      @scala.inline
      def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: url | String): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
      
      @scala.inline
      def setKeyMarker(value: String): Self = StObject.set(x, "KeyMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMarkerUndefined: Self = StObject.set(x, "KeyMarker", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "MaxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "MaxKeys", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setVersionIdMarker(value: String): Self = StObject.set(x, "VersionIdMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdMarkerUndefined: Self = StObject.set(x, "VersionIdMarker", js.undefined)
    }
  }
}
