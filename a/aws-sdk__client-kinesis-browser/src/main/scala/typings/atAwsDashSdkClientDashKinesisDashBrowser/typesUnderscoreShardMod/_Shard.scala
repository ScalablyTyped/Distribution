package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreShardMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreHashKeyRangeMod._HashKeyRange
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSequenceNumberRangeMod._SequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Shard extends js.Object {
  /**
    * <p>The shard ID of the shard adjacent to the shard's parent.</p>
    */
  var AdjacentParentShardId: js.UndefOr[String] = js.undefined
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  var HashKeyRange: _HashKeyRange
  /**
    * <p>The shard ID of the shard's parent.</p>
    */
  var ParentShardId: js.UndefOr[String] = js.undefined
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  var SequenceNumberRange: _SequenceNumberRange
  /**
    * <p>The unique identifier of the shard within the stream.</p>
    */
  var ShardId: String
}

object _Shard {
  @scala.inline
  def apply(
    HashKeyRange: _HashKeyRange,
    SequenceNumberRange: _SequenceNumberRange,
    ShardId: String,
    AdjacentParentShardId: String = null,
    ParentShardId: String = null
  ): _Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange, SequenceNumberRange = SequenceNumberRange, ShardId = ShardId)
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId)
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId)
    __obj.asInstanceOf[_Shard]
  }
}

