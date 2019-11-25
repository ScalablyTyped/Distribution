package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutObjectAclInputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`authenticated-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`aws-exec-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`bucket-owner-full-control`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`bucket-owner-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`private`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`public-read-write`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`public-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAccessControlPolicyMod._AccessControlPolicy
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectAclInput extends _InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
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
    * <p>The canned ACL to apply to the object.</p>
    */
  var ACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.undefined
  /**
    * _AccessControlPolicy shape
    */
  var AccessControlPolicy: js.UndefOr[_AccessControlPolicy] = js.undefined
  /**
    * _BucketName shape
    */
  var Bucket: String
  /**
    * _ContentMD5 shape
    */
  var ContentMD5: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
    */
  var GrantFullControl: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to list the objects in the bucket.</p>
    */
  var GrantRead: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to read the bucket ACL.</p>
    */
  var GrantReadACP: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
    */
  var GrantWrite: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to write the ACL for the applicable bucket.</p>
    */
  var GrantWriteACP: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: String
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>VersionId used to reference a specific version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object PutObjectAclInput {
  @scala.inline
  def apply(
    Bucket: String,
    Key: String,
    $abortSignal: AbortSignal = null,
    $bucketEndpoint: String = null,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    ACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    AccessControlPolicy: _AccessControlPolicy = null,
    ContentMD5: String = null,
    GrantFullControl: String = null,
    GrantRead: String = null,
    GrantReadACP: String = null,
    GrantWrite: String = null,
    GrantWriteACP: String = null,
    RequestPayer: requester_ | String = null,
    VersionId: String = null
  ): PutObjectAclInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($bucketEndpoint != null) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint.asInstanceOf[js.Any])
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (AccessControlPolicy != null) __obj.updateDynamic("AccessControlPolicy")(AccessControlPolicy.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl.asInstanceOf[js.Any])
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead.asInstanceOf[js.Any])
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP.asInstanceOf[js.Any])
    if (GrantWrite != null) __obj.updateDynamic("GrantWrite")(GrantWrite.asInstanceOf[js.Any])
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectAclInput]
  }
}

