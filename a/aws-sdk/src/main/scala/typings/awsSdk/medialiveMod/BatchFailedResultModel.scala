package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchFailedResultModel extends js.Object {
  
  /**
    * ARN of the resource
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * Error code for the failed operation
    */
  var Code: js.UndefOr[string] = js.native
  
  /**
    * ID of the resource
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Error message for the failed operation
    */
  var Message: js.UndefOr[string] = js.native
}
object BatchFailedResultModel {
  
  @scala.inline
  def apply(): BatchFailedResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchFailedResultModel]
  }
  
  @scala.inline
  implicit class BatchFailedResultModelOps[Self <: BatchFailedResultModel] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCode(value: string): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
