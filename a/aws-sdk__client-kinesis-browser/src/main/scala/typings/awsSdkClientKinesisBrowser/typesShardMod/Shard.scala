package typings.awsSdkClientKinesisBrowser.typesShardMod

import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * <p>The shard ID of the shard adjacent to the shard's parent.</p>
    */
  var AdjacentParentShardId: js.UndefOr[String] = js.native
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  var HashKeyRange: typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange = js.native
  /**
    * <p>The shard ID of the shard's parent.</p>
    */
  var ParentShardId: js.UndefOr[String] = js.native
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  var SequenceNumberRange: typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange = js.native
  /**
    * <p>The unique identifier of the shard within the stream.</p>
    */
  var ShardId: String = js.native
}

object Shard {
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: String): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHashKeyRange(value: HashKeyRange): Self = this.set("HashKeyRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumberRange(value: SequenceNumberRange): Self = this.set("SequenceNumberRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardId(value: String): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdjacentParentShardId(value: String): Self = this.set("AdjacentParentShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjacentParentShardId: Self = this.set("AdjacentParentShardId", js.undefined)
    @scala.inline
    def setParentShardId(value: String): Self = this.set("ParentShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentShardId: Self = this.set("ParentShardId", js.undefined)
  }
  
}

