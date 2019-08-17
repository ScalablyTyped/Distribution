package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreShardMod._UnmarshalledShard
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListShardsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards. For more information about the use of this pagination token when calling the <code>ListShards</code> operation, see <a>ListShardsInput$NextToken</a>.</p> <important> <p>Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.</p> </important>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending hash keys and the starting and ending sequence numbers for the shard.</p>
    */
  var Shards: js.UndefOr[js.Array[_UnmarshalledShard]] = js.undefined
}

object ListShardsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, NextToken: String = null, Shards: js.Array[_UnmarshalledShard] = null): ListShardsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Shards != null) __obj.updateDynamic("Shards")(Shards)
    __obj.asInstanceOf[ListShardsOutput]
  }
}

