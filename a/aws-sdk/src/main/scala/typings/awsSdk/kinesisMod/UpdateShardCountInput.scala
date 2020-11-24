package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShardCountInput extends js.Object {
  
  /**
    * The scaling type. Uniform scaling creates shards of equal size.
    */
  var ScalingType: typings.awsSdk.kinesisMod.ScalingType = js.native
  
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  
  /**
    * The new number of shards. This value has the following default limits. By default, you cannot do the following:    Set this value to more than double your current shard count for a stream.   Set this value below half your current shard count for a stream.   Set this value to more than 500 shards in a stream (the default limit for shard count per stream is 500 per account per region), unless you request a limit increase.   Scale a stream with more than 500 shards down unless you set this value to less than 500 shards.  
    */
  var TargetShardCount: PositiveIntegerObject = js.native
}
object UpdateShardCountInput {
  
  @scala.inline
  def apply(ScalingType: ScalingType, StreamName: StreamName, TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
    val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountInput]
  }
  
  @scala.inline
  implicit class UpdateShardCountInputOps[Self <: UpdateShardCountInput] (val x: Self) extends AnyVal {
    
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
    def setScalingType(value: ScalingType): Self = this.set("ScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetShardCount(value: PositiveIntegerObject): Self = this.set("TargetShardCount", value.asInstanceOf[js.Any])
  }
}
