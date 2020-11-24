package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShardCountOutput extends js.Object {
  
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.native
  
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.native
}
object UpdateShardCountOutput {
  
  @scala.inline
  def apply(): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  
  @scala.inline
  implicit class UpdateShardCountOutputOps[Self <: UpdateShardCountOutput] (val x: Self) extends AnyVal {
    
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
    def setCurrentShardCount(value: PositiveIntegerObject): Self = this.set("CurrentShardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentShardCount: Self = this.set("CurrentShardCount", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
    
    @scala.inline
    def setTargetShardCount(value: PositiveIntegerObject): Self = this.set("TargetShardCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetShardCount: Self = this.set("TargetShardCount", js.undefined)
  }
}
