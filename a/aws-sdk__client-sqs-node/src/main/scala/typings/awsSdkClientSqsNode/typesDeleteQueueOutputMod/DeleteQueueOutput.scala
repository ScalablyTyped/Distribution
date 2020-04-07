package typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueueOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object DeleteQueueOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteQueueOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteQueueOutput]
  }
}

