package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplayRequest extends js.Object {
  
  /**
    * The name of the replay to retrieve.
    */
  var ReplayName: typings.awsSdk.cloudwatcheventsMod.ReplayName = js.native
}
object DescribeReplayRequest {
  
  @scala.inline
  def apply(ReplayName: ReplayName): DescribeReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplayRequest]
  }
  
  @scala.inline
  implicit class DescribeReplayRequestOps[Self <: DescribeReplayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplayName(value: ReplayName): Self = this.set("ReplayName", value.asInstanceOf[js.Any])
  }
}
