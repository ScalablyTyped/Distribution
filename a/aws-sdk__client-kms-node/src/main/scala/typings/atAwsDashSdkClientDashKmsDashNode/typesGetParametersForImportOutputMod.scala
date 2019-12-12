package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/GetParametersForImportOutput", JSImport.Namespace)
@js.native
object typesGetParametersForImportOutputMod extends js.Object {
  @js.native
  trait GetParametersForImportOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The import token to send in a subsequent <a>ImportKeyMaterial</a> request.</p>
      */
    var ImportToken: js.UndefOr[Uint8Array] = js.native
    /**
      * <p>The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified in the <code>GetParametersForImport</code> request.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    /**
      * <p>The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to get new ones.</p>
      */
    var ParametersValidTo: js.UndefOr[Date] = js.native
    /**
      * <p>The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.</p>
      */
    var PublicKey: js.UndefOr[Uint8Array] = js.native
  }
  
}

