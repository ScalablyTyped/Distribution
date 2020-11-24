package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInfo extends js.Object {
  
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object InstanceInfo {
  
  @scala.inline
  def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  
  @scala.inline
  implicit class InstanceInfoOps[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
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
    def setDeregisterTime(value: Timestamp): Self = this.set("deregisterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeregisterTime: Self = this.set("deregisterTime", js.undefined)
    
    @scala.inline
    def setIamSessionArn(value: IamSessionArn): Self = this.set("iamSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamSessionArn: Self = this.set("iamSessionArn", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: IamUserArn): Self = this.set("iamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamUserArn: Self = this.set("iamUserArn", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceArn: Self = this.set("instanceArn", js.undefined)
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    
    @scala.inline
    def setRegisterTime(value: Timestamp): Self = this.set("registerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterTime: Self = this.set("registerTime", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
