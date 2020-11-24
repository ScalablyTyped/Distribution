package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  
  var PublicWorkforceTaskPrice: js.UndefOr[typings.awsSdk.sagemakerMod.PublicWorkforceTaskPrice] = js.native
  
  /**
    * The length of time that a task remains available for review by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.native
  
  /**
    * The number of distinct workers who will perform the same task on each object. For example, if TaskCount is set to 3 for an image classification labeling job, three workers will classify each input image. Increasing TaskCount can improve label accuracy.
    */
  var TaskCount: FlowDefinitionTaskCount = js.native
  
  /**
    * A description for the human worker task.
    */
  var TaskDescription: FlowDefinitionTaskDescription = js.native
  
  /**
    * Keywords used to describe the task so that workers can discover the task.
    */
  var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.native
  
  /**
    * The amount of time that a worker has to complete a task. The default value is 3,600 seconds (1 hour)
    */
  var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.native
  
  /**
    * A title for the human worker task.
    */
  var TaskTitle: FlowDefinitionTaskTitle = js.native
  
  /**
    * Amazon Resource Name (ARN) of a team of workers.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}
object HumanLoopConfig {
  
  @scala.inline
  def apply(
    HumanTaskUiArn: HumanTaskUiArn,
    TaskCount: FlowDefinitionTaskCount,
    TaskDescription: FlowDefinitionTaskDescription,
    TaskTitle: FlowDefinitionTaskTitle,
    WorkteamArn: WorkteamArn
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], TaskCount = TaskCount.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  
  @scala.inline
  implicit class HumanLoopConfigOps[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
    
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
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = this.set("HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskCount(value: FlowDefinitionTaskCount): Self = this.set("TaskCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDescription(value: FlowDefinitionTaskDescription): Self = this.set("TaskDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTitle(value: FlowDefinitionTaskTitle): Self = this.set("TaskTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicWorkforceTaskPrice(value: PublicWorkforceTaskPrice): Self = this.set("PublicWorkforceTaskPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicWorkforceTaskPrice: Self = this.set("PublicWorkforceTaskPrice", js.undefined)
    
    @scala.inline
    def setTaskAvailabilityLifetimeInSeconds(value: FlowDefinitionTaskAvailabilityLifetimeInSeconds): Self = this.set("TaskAvailabilityLifetimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskAvailabilityLifetimeInSeconds: Self = this.set("TaskAvailabilityLifetimeInSeconds", js.undefined)
    
    @scala.inline
    def setTaskKeywordsVarargs(value: FlowDefinitionTaskKeyword*): Self = this.set("TaskKeywords", js.Array(value :_*))
    
    @scala.inline
    def setTaskKeywords(value: FlowDefinitionTaskKeywords): Self = this.set("TaskKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskKeywords: Self = this.set("TaskKeywords", js.undefined)
    
    @scala.inline
    def setTaskTimeLimitInSeconds(value: FlowDefinitionTaskTimeLimitInSeconds): Self = this.set("TaskTimeLimitInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskTimeLimitInSeconds: Self = this.set("TaskTimeLimitInSeconds", js.undefined)
  }
}
