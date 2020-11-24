package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetChannelRequest extends js.Object {
  
  /**
    * Array of ARNs, one per channel.
    */
  var arns: ChannelArnList = js.native
}
object BatchGetChannelRequest {
  
  @scala.inline
  def apply(arns: ChannelArnList): BatchGetChannelRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetChannelRequest]
  }
  
  @scala.inline
  implicit class BatchGetChannelRequestOps[Self <: BatchGetChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setArnsVarargs(value: ChannelArn*): Self = this.set("arns", js.Array(value :_*))
    
    @scala.inline
    def setArns(value: ChannelArnList): Self = this.set("arns", value.asInstanceOf[js.Any])
  }
}
