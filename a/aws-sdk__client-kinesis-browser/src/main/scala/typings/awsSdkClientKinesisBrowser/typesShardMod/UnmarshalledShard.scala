package typings.awsSdkClientKinesisBrowser.typesShardMod

import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.UnmarshalledHashKeyRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.UnmarshalledSequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledShard extends Shard {
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  @JSName("HashKeyRange")
  var HashKeyRange_UnmarshalledShard: UnmarshalledHashKeyRange
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  @JSName("SequenceNumberRange")
  var SequenceNumberRange_UnmarshalledShard: UnmarshalledSequenceNumberRange
}

object UnmarshalledShard {
  @scala.inline
  def apply(
    HashKeyRange: UnmarshalledHashKeyRange,
    SequenceNumberRange: UnmarshalledSequenceNumberRange,
    ShardId: String,
    AdjacentParentShardId: String = null,
    ParentShardId: String = null
  ): UnmarshalledShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId.asInstanceOf[js.Any])
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledShard]
  }
}

