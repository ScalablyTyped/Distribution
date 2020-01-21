package typings.awsSdkClientKinesisBrowser.typesShardMod

import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  /**
    * <p>The shard ID of the shard adjacent to the shard's parent.</p>
    */
  var AdjacentParentShardId: js.UndefOr[String] = js.undefined
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  var HashKeyRange: typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
  /**
    * <p>The shard ID of the shard's parent.</p>
    */
  var ParentShardId: js.UndefOr[String] = js.undefined
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  var SequenceNumberRange: typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
  /**
    * <p>The unique identifier of the shard within the stream.</p>
    */
  var ShardId: String
}

object Shard {
  @scala.inline
  def apply(
    HashKeyRange: HashKeyRange,
    SequenceNumberRange: SequenceNumberRange,
    ShardId: String,
    AdjacentParentShardId: String = null,
    ParentShardId: String = null
  ): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    if (AdjacentParentShardId != null) __obj.updateDynamic("AdjacentParentShardId")(AdjacentParentShardId.asInstanceOf[js.Any])
    if (ParentShardId != null) __obj.updateDynamic("ParentShardId")(ParentShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
}

