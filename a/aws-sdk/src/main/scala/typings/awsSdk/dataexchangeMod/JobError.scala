package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobError extends js.Object {
  
  /**
    * The code for the job error.
    */
  var Code: typings.awsSdk.dataexchangeMod.Code = js.native
  
  var Details: js.UndefOr[typings.awsSdk.dataexchangeMod.Details] = js.native
  
  /**
    * The name of the limit that was reached.
    */
  var LimitName: js.UndefOr[JobErrorLimitName] = js.native
  
  /**
    * The value of the exceeded limit.
    */
  var LimitValue: js.UndefOr[double] = js.native
  
  /**
    * The message related to the job error.
    */
  var Message: string = js.native
  
  /**
    * The unique identifier for the resource related to the error.
    */
  var ResourceId: js.UndefOr[string] = js.native
  
  /**
    * The type of resource related to the error.
    */
  var ResourceType: js.UndefOr[JobErrorResourceTypes] = js.native
}
object JobError {
  
  @scala.inline
  def apply(Code: Code, Message: string): JobError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
  
  @scala.inline
  implicit class JobErrorOps[Self <: JobError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Code): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Details): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setLimitName(value: JobErrorLimitName): Self = this.set("LimitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitName: Self = this.set("LimitName", js.undefined)
    
    @scala.inline
    def setLimitValue(value: double): Self = this.set("LimitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitValue: Self = this.set("LimitValue", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: JobErrorResourceTypes): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
