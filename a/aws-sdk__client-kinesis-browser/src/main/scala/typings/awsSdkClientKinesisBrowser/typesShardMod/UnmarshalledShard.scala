package typings.awsSdkClientKinesisBrowser.typesShardMod

import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.UnmarshalledHashKeyRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.UnmarshalledSequenceNumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledShard extends Shard {
  /**
    * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
    */
  @JSName("HashKeyRange")
  var HashKeyRange_UnmarshalledShard: UnmarshalledHashKeyRange = js.native
  /**
    * <p>The range of possible sequence numbers for the shard.</p>
    */
  @JSName("SequenceNumberRange")
  var SequenceNumberRange_UnmarshalledShard: UnmarshalledSequenceNumberRange = js.native
}

object UnmarshalledShard {
  @scala.inline
  def apply(
    HashKeyRange: UnmarshalledHashKeyRange,
    SequenceNumberRange: UnmarshalledSequenceNumberRange,
    ShardId: String
  ): UnmarshalledShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledShard]
  }
  @scala.inline
  implicit class UnmarshalledShardOps[Self <: UnmarshalledShard] (val x: Self) extends AnyVal {
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
    def setHashKeyRange(value: UnmarshalledHashKeyRange): Self = this.set("HashKeyRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumberRange(value: UnmarshalledSequenceNumberRange): Self = this.set("SequenceNumberRange", value.asInstanceOf[js.Any])
  }
  
}

