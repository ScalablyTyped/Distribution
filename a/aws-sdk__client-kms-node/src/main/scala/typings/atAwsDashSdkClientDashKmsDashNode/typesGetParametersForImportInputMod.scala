package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.RSAES_OAEP_SHA_1
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.RSAES_OAEP_SHA_256
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.RSAES_PKCS1_V1_5
import typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.RSA_2048
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/GetParametersForImportInput", JSImport.Namespace)
@js.native
object typesGetParametersForImportInputMod extends js.Object {
  @js.native
  trait GetParametersForImportInput extends InputTypesUnion {
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
      * <p>The identifier of the CMK into which you will import key material. The CMK's <code>Origin</code> must be <code>EXTERNAL</code>.</p> <p>Specify the key ID or the Amazon Resource Name (ARN) of the CMK.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
      */
    var KeyId: String = js.native
    /**
      * <p>The algorithm you use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String = js.native
    /**
      * <p>The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.</p>
      */
    var WrappingKeySpec: RSA_2048 | String = js.native
  }
  
}

