package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/ListQueuesOutput", JSImport.Namespace)
@js.native
object typesListQueuesOutputMod extends js.Object {
  @js.native
  trait ListQueuesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of queue URLs, up to 1,000 entries.</p>
      */
    var QueueUrls: js.UndefOr[js.Array[String]] = js.native
  }
  
}

