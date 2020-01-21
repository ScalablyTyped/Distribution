package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/ListQueueTagsOutput", JSImport.Namespace)
@js.native
object typesListQueueTagsOutputMod extends js.Object {
  @js.native
  trait ListQueueTagsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The list of all tags added to the specified queue.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  
}

