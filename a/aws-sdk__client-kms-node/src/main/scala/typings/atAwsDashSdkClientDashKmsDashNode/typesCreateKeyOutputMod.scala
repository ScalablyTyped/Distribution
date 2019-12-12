package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreKeyMetadataMod._UnmarshalledKeyMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/CreateKeyOutput", JSImport.Namespace)
@js.native
object typesCreateKeyOutputMod extends js.Object {
  @js.native
  trait CreateKeyOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Metadata associated with the CMK.</p>
      */
    var KeyMetadata: js.UndefOr[_UnmarshalledKeyMetadata] = js.native
  }
  
}

