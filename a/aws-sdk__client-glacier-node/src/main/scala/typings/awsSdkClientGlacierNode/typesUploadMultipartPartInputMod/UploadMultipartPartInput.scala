package typings.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod

import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMultipartPartInput[StreamType] extends js.Object {
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
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. </p>
    */
  var accountId: String
  /**
    * <p>The data to upload.</p>
    */
  var body: js.UndefOr[ArrayBuffer | ArrayBufferView | String | StreamType] = js.undefined
  /**
    * <p>The SHA256 tree hash of the data being uploaded.</p>
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * <p>Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An example header is Content-Range:bytes 0-4194303/ *.</p>
    */
  var range: js.UndefOr[String] = js.undefined
  /**
    * <p>The upload ID of the multipart upload.</p>
    */
  var uploadId: String
  /**
    * <p>The name of the vault.</p>
    */
  var vaultName: String
}

object UploadMultipartPartInput {
  @scala.inline
  def apply[StreamType](
    accountId: String,
    uploadId: String,
    vaultName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    body: ArrayBuffer | ArrayBufferView | String | StreamType = null,
    checksum: String = null,
    range: String = null
  ): UploadMultipartPartInput[StreamType] = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMultipartPartInput[StreamType]]
  }
}

