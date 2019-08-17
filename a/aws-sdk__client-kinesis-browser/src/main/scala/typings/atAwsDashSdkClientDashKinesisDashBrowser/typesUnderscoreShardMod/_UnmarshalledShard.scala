package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreShardMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreHashKeyRangeMod._UnmarshalledHashKeyRange
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSequenceNumberRangeMod._UnmarshalledSequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledShard extends _Shard {
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  @JSName("HashKeyRange")
  var HashKeyRange__UnmarshalledShard: _UnmarshalledHashKeyRange
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  @JSName("SequenceNumberRange")
  var SequenceNumberRange__UnmarshalledShard: _UnmarshalledSequenceNumberRange
}

object _UnmarshalledShard {
  @scala.inline
  def apply(
    HashKeyRange: _UnmarshalledHashKeyRange,
    SequenceNumberRange: _UnmarshalledSequenceNumberRange,
    ShardId: String,
    AdjacentParentShardId: String = null,
    ParentShardId: String = null
  ): _UnmarshalledShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange, SequenceNumberRange = SequenceNumberRange, ShardId = ShardId)
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId)
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId)
    __obj.asInstanceOf[_UnmarshalledShard]
  }
}

