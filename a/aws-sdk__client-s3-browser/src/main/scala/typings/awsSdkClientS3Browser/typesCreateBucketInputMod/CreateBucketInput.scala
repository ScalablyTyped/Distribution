package typings.awsSdkClientS3Browser.typesCreateBucketInputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientS3Browser.typesCreateBucketConfigurationMod.CreateBucketConfiguration
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
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
    * <p>The canned ACL to apply to the bucket.</p>
    */
  var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.undefined
  /**
    * _BucketName shape
    */
  var Bucket: String
  /**
    * _CreateBucketConfiguration shape
    */
  var CreateBucketConfiguration: js.UndefOr[
    typings.awsSdkClientS3Browser.typesCreateBucketConfigurationMod.CreateBucketConfiguration
  ] = js.undefined
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
}

object CreateBucketInput {
  @scala.inline
  def apply(
    Bucket: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    ACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | String = null,
    CreateBucketConfiguration: CreateBucketConfiguration = null,
    GrantFullControl: String = null,
    GrantRead: String = null,
    GrantReadACP: String = null,
    GrantWrite: String = null,
    GrantWriteACP: String = null
  ): CreateBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration.asInstanceOf[js.Any])
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl.asInstanceOf[js.Any])
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead.asInstanceOf[js.Any])
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP.asInstanceOf[js.Any])
    if (GrantWrite != null) __obj.updateDynamic("GrantWrite")(GrantWrite.asInstanceOf[js.Any])
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketInput]
  }
}

