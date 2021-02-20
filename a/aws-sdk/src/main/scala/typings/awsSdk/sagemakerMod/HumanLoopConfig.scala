package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopConfig extends StObject {
  
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
  implicit class HumanLoopConfigMutableBuilder[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicWorkforceTaskPrice(value: PublicWorkforceTaskPrice): Self = StObject.set(x, "PublicWorkforceTaskPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicWorkforceTaskPriceUndefined: Self = StObject.set(x, "PublicWorkforceTaskPrice", js.undefined)
    
    @scala.inline
    def setTaskAvailabilityLifetimeInSeconds(value: FlowDefinitionTaskAvailabilityLifetimeInSeconds): Self = StObject.set(x, "TaskAvailabilityLifetimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskAvailabilityLifetimeInSecondsUndefined: Self = StObject.set(x, "TaskAvailabilityLifetimeInSeconds", js.undefined)
    
    @scala.inline
    def setTaskCount(value: FlowDefinitionTaskCount): Self = StObject.set(x, "TaskCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDescription(value: FlowDefinitionTaskDescription): Self = StObject.set(x, "TaskDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskKeywords(value: FlowDefinitionTaskKeywords): Self = StObject.set(x, "TaskKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskKeywordsUndefined: Self = StObject.set(x, "TaskKeywords", js.undefined)
    
    @scala.inline
    def setTaskKeywordsVarargs(value: FlowDefinitionTaskKeyword*): Self = StObject.set(x, "TaskKeywords", js.Array(value :_*))
    
    @scala.inline
    def setTaskTimeLimitInSeconds(value: FlowDefinitionTaskTimeLimitInSeconds): Self = StObject.set(x, "TaskTimeLimitInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTimeLimitInSecondsUndefined: Self = StObject.set(x, "TaskTimeLimitInSeconds", js.undefined)
    
    @scala.inline
    def setTaskTitle(value: FlowDefinitionTaskTitle): Self = StObject.set(x, "TaskTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
  }
}
