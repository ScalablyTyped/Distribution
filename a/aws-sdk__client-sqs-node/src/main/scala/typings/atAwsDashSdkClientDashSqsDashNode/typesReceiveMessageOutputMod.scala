package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageMod._UnmarshalledMessage
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/ReceiveMessageOutput", JSImport.Namespace)
@js.native
object typesReceiveMessageOutputMod extends js.Object {
  @js.native
  trait ReceiveMessageOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of messages.</p>
      */
    var Messages: js.UndefOr[js.Array[_UnmarshalledMessage]] = js.native
  }
  
}

