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

@js.native
trait CreateBucketInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
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
    * <p>The canned ACL to apply to the bucket.</p>
    */
  var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.native
  /**
    * _BucketName shape
    */
  var Bucket: String = js.native
  /**
    * _CreateBucketConfiguration shape
    */
  var CreateBucketConfiguration: js.UndefOr[
    typings.awsSdkClientS3Browser.typesCreateBucketConfigurationMod.CreateBucketConfiguration
  ] = js.native
  /**
    * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
    */
  var GrantFullControl: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to list the objects in the bucket.</p>
    */
  var GrantRead: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to read the bucket ACL.</p>
    */
  var GrantReadACP: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
    */
  var GrantWrite: js.UndefOr[String] = js.native
  /**
    * <p>Allows grantee to write the ACL for the applicable bucket.</p>
    */
  var GrantWriteACP: js.UndefOr[String] = js.native
}

object CreateBucketInput {
  @scala.inline
  def apply(Bucket: String): CreateBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketInput]
  }
  @scala.inline
  implicit class CreateBucketInputOps[Self <: CreateBucketInput] (val x: Self) extends AnyVal {
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
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setACL(value: `private` | `public-read` | `public-read-write` | `authenticated-read` | String): Self = this.set("ACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    @scala.inline
    def setCreateBucketConfiguration(value: CreateBucketConfiguration): Self = this.set("CreateBucketConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateBucketConfiguration: Self = this.set("CreateBucketConfiguration", js.undefined)
    @scala.inline
    def setGrantFullControl(value: String): Self = this.set("GrantFullControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantFullControl: Self = this.set("GrantFullControl", js.undefined)
    @scala.inline
    def setGrantRead(value: String): Self = this.set("GrantRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantRead: Self = this.set("GrantRead", js.undefined)
    @scala.inline
    def setGrantReadACP(value: String): Self = this.set("GrantReadACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantReadACP: Self = this.set("GrantReadACP", js.undefined)
    @scala.inline
    def setGrantWrite(value: String): Self = this.set("GrantWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantWrite: Self = this.set("GrantWrite", js.undefined)
    @scala.inline
    def setGrantWriteACP(value: String): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
  }
  
}

