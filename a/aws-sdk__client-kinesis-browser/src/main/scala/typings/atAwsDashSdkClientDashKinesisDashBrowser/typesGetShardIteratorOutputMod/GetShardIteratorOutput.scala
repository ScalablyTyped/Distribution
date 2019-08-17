package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShardIteratorOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.</p>
    */
  var ShardIterator: js.UndefOr[String] = js.undefined
}

object GetShardIteratorOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ShardIterator: String = null): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ShardIterator != null) __obj.updateDynamic("ShardIterator")(ShardIterator)
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
}

