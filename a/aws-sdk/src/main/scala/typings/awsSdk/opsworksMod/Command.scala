package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  /**
    * Date and time when the command was acknowledged.
    */
  var AcknowledgedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The command ID.
    */
  var CommandId: js.UndefOr[String] = js.native
  
  /**
    * Date when the command completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * Date and time when the command was run.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The command deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.native
  
  /**
    * The command exit code.
    */
  var ExitCode: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the instance where the command was executed.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The URL of the command log.
    */
  var LogUrl: js.UndefOr[String] = js.native
  
  /**
    * The command status:   failed   successful   skipped   pending  
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The command type:    configure     deploy     execute_recipes     install_dependencies     restart     rollback     setup     start     stop     undeploy     update_custom_cookbooks     update_dependencies   
    */
  var Type: js.UndefOr[String] = js.native
}
object Command {
  
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
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
    def setAcknowledgedAt(value: DateTime): Self = this.set("AcknowledgedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledgedAt: Self = this.set("AcknowledgedAt", js.undefined)
    
    @scala.inline
    def setCommandId(value: String): Self = this.set("CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandId: Self = this.set("CommandId", js.undefined)
    
    @scala.inline
    def setCompletedAt(value: DateTime): Self = this.set("CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedAt: Self = this.set("CompletedAt", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setExitCode(value: Integer): Self = this.set("ExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("ExitCode", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setLogUrl(value: String): Self = this.set("LogUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUrl: Self = this.set("LogUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
