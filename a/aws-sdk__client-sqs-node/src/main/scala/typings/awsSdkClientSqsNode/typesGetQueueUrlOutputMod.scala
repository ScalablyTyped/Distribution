package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/GetQueueUrlOutput", JSImport.Namespace)
@js.native
object typesGetQueueUrlOutputMod extends js.Object {
  @js.native
  trait GetQueueUrlOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The URL of the queue.</p>
      */
    var QueueUrl: js.UndefOr[String] = js.native
  }
  
}

