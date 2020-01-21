package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/GetKeyRotationStatusOutput", JSImport.Namespace)
@js.native
object typesGetKeyRotationStatusOutputMod extends js.Object {
  @js.native
  trait GetKeyRotationStatusOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A Boolean value that specifies whether key rotation is enabled.</p>
      */
    var KeyRotationEnabled: js.UndefOr[Boolean] = js.native
  }
  
}

