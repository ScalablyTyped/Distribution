package typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromVaultOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object RemoveTagsFromVaultOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): RemoveTagsFromVaultOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromVaultOutput]
  }
}

