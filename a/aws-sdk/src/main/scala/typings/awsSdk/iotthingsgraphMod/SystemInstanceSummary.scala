package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInstanceSummary extends js.Object {
  
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.native
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.native
  
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.native
  
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.native
  
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object SystemInstanceSummary {
  
  @scala.inline
  def apply(): SystemInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceSummary]
  }
  
  @scala.inline
  implicit class SystemInstanceSummaryOps[Self <: SystemInstanceSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setGreengrassGroupId(value: GreengrassGroupId): Self = this.set("greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassGroupId: Self = this.set("greengrassGroupId", js.undefined)
    
    @scala.inline
    def setGreengrassGroupName(value: GroupName): Self = this.set("greengrassGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassGroupName: Self = this.set("greengrassGroupName", js.undefined)
    
    @scala.inline
    def setGreengrassGroupVersionId(value: GreengrassGroupVersionId): Self = this.set("greengrassGroupVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassGroupVersionId: Self = this.set("greengrassGroupVersionId", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setStatus(value: SystemInstanceDeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTarget(value: DeploymentTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
