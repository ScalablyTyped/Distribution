package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/TagQueueOutput", JSImport.Namespace)
@js.native
object typesTagQueueOutputMod extends js.Object {
  @js.native
  trait TagQueueOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
  }
  
}

