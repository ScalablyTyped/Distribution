package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetStreamKeyRequest extends js.Object {
  
  /**
    * Array of ARNs, one per channel.
    */
  var arns: StreamKeyArnList = js.native
}
object BatchGetStreamKeyRequest {
  
  @scala.inline
  def apply(arns: StreamKeyArnList): BatchGetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetStreamKeyRequest]
  }
  
  @scala.inline
  implicit class BatchGetStreamKeyRequestOps[Self <: BatchGetStreamKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setArnsVarargs(value: StreamKeyArn*): Self = this.set("arns", js.Array(value :_*))
    
    @scala.inline
    def setArns(value: StreamKeyArnList): Self = this.set("arns", value.asInstanceOf[js.Any])
  }
}
