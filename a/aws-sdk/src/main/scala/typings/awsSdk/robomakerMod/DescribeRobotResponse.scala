package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRobotResponse extends js.Object {
  
  /**
    * The target architecture of the robot application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.native
  
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  
  /**
    * The time of the last deployment job.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the fleet.
    */
  var status: js.UndefOr[RobotStatus] = js.native
  
  /**
    * The list of all tags added to the specified robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object DescribeRobotResponse {
  
  @scala.inline
  def apply(): DescribeRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRobotResponse]
  }
  
  @scala.inline
  implicit class DescribeRobotResponseOps[Self <: DescribeRobotResponse] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: Architecture): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setFleetArn(value: Arn): Self = this.set("fleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetArn: Self = this.set("fleetArn", js.undefined)
    
    @scala.inline
    def setGreengrassGroupId(value: Id): Self = this.set("greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassGroupId: Self = this.set("greengrassGroupId", js.undefined)
    
    @scala.inline
    def setLastDeploymentJob(value: Arn): Self = this.set("lastDeploymentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentJob: Self = this.set("lastDeploymentJob", js.undefined)
    
    @scala.inline
    def setLastDeploymentTime(value: CreatedAt): Self = this.set("lastDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentTime: Self = this.set("lastDeploymentTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: RobotStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
