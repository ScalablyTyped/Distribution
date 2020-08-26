package typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
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
  var $bucketEndpoint: js.UndefOr[String] = js.native
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * _BucketName shape
    */
  var Bucket: String = js.native
  /**
    * <p>A delimiter is a character you use to group keys.</p>
    */
  var Delimiter: js.UndefOr[String] = js.native
  /**
    * <p>Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.native
  /**
    * <p>Specifies the key to start with when listing objects in a bucket.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
    */
  var MaxKeys: js.UndefOr[Double] = js.native
  /**
    * <p>Limits the response to keys that begin with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>Specifies the object version you want to start listing from.</p>
    */
  var VersionIdMarker: js.UndefOr[String] = js.native
}

object ListObjectVersionsInput {
  @scala.inline
  def apply(Bucket: String): ListObjectVersionsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsInput]
  }
  @scala.inline
  implicit class ListObjectVersionsInputOps[Self <: ListObjectVersionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$bucketEndpoint(value: String): Self = this.set("$bucketEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bucketEndpoint: Self = this.set("$bucketEndpoint", js.undefined)
    @scala.inline
    def set$forcePathStyle(value: Boolean): Self = this.set("$forcePathStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$forcePathStyle: Self = this.set("$forcePathStyle", js.undefined)
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def set$useAccelerateEndpoint(value: Boolean): Self = this.set("$useAccelerateEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$useAccelerateEndpoint: Self = this.set("$useAccelerateEndpoint", js.undefined)
    @scala.inline
    def set$useDualstackEndpoint(value: Boolean): Self = this.set("$useDualstackEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$useDualstackEndpoint: Self = this.set("$useDualstackEndpoint", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: url | String): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setKeyMarker(value: String): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setVersionIdMarker(value: String): Self = this.set("VersionIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionIdMarker: Self = this.set("VersionIdMarker", js.undefined)
  }
  
}

