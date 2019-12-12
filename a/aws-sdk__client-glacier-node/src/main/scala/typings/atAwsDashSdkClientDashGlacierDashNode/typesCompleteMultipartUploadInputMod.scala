package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/CompleteMultipartUploadInput", JSImport.Namespace)
@js.native
object typesCompleteMultipartUploadInputMod extends js.Object {
  @js.native
  trait CompleteMultipartUploadInput extends _InputTypesUnion {
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
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.</p>
      */
    var accountId: String = js.native
    /**
      * <p>The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual parts that you uploaded.</p>
      */
    var archiveSize: js.UndefOr[String] = js.native
    /**
      * <p>The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.</p>
      */
    var checksum: js.UndefOr[String] = js.native
    /**
      * <p>The upload ID of the multipart upload.</p>
      */
    var uploadId: String = js.native
    /**
      * <p>The name of the vault.</p>
      */
    var vaultName: String = js.native
  }
  
}

