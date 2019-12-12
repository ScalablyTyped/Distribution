package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester_
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetObjectInput", JSImport.Namespace)
@js.native
object typesGetObjectInputMod extends js.Object {
  @js.native
  trait GetObjectInput extends _InputTypesUnion {
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
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
      */
    @JSName("$serverSideEncryptionKey")
    var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.native
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
      * <p>Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).</p>
      */
    var IfMatch: js.UndefOr[String] = js.native
    /**
      * <p>Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).</p>
      */
    var IfModifiedSince: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).</p>
      */
    var IfNoneMatch: js.UndefOr[String] = js.native
    /**
      * <p>Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).</p>
      */
    var IfUnmodifiedSince: js.UndefOr[Date | String | Double] = js.native
    /**
      * _ObjectKey shape
      */
    var Key: String = js.native
    /**
      * <p>Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.native
    /**
      * <p>Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.</p>
      */
    var Range: js.UndefOr[String] = js.native
    /**
      * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
      */
    var RequestPayer: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Sets the Cache-Control header of the response.</p>
      */
    var ResponseCacheControl: js.UndefOr[String] = js.native
    /**
      * <p>Sets the Content-Disposition header of the response</p>
      */
    var ResponseContentDisposition: js.UndefOr[String] = js.native
    /**
      * <p>Sets the Content-Encoding header of the response.</p>
      */
    var ResponseContentEncoding: js.UndefOr[String] = js.native
    /**
      * <p>Sets the Content-Language header of the response.</p>
      */
    var ResponseContentLanguage: js.UndefOr[String] = js.native
    /**
      * <p>Sets the Content-Type header of the response.</p>
      */
    var ResponseContentType: js.UndefOr[String] = js.native
    /**
      * <p>Sets the Expires header of the response.</p>
      */
    var ResponseExpires: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * <p>VersionId used to reference a specific version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

