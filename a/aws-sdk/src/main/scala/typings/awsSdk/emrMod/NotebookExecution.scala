package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookExecution extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the notebook execution.
    */
  var Arn: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The unique identifier of the EMR Notebook that is used for the notebook execution.
    */
  var EditorId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The timestamp when notebook execution ended.
    */
  var EndTime: js.UndefOr[Date] = js.native
  
  /**
    * The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook execution.
    */
  var ExecutionEngine: js.UndefOr[ExecutionEngineConfig] = js.native
  
  /**
    * The reason for the latest status change of the notebook execution.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  
  /**
    * The unique identifier of a notebook execution.
    */
  var NotebookExecutionId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * A name for the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more information see Specifying EC2 Security Groups for EMR Notebooks in the EMR Management Guide.
    */
  var NotebookInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
    */
  var NotebookParams: js.UndefOr[XmlString] = js.native
  
  /**
    * The location of the notebook execution's output file in Amazon S3.
    */
  var OutputNotebookURI: js.UndefOr[XmlString] = js.native
  
  /**
    * The timestamp when notebook execution started.
    */
  var StartTime: js.UndefOr[Date] = js.native
  
  /**
    * The status of the notebook execution.    START_PENDING indicates that the cluster has received the execution request but execution has not begun.    STARTING indicates that the execution is starting on the cluster.    RUNNING indicates that the execution is being processed by the cluster.    FINISHING indicates that execution processing is in the final stages.    FINISHED indicates that the execution has completed without error.    FAILING indicates that the execution is failing and will not finish successfully.    FAILED indicates that the execution failed.    STOP_PENDING indicates that the cluster has received a StopNotebookExecution request and the stop is pending.    STOPPING indicates that the cluster is in the process of stopping the execution as a result of a StopNotebookExecution request.    STOPPED indicates that the execution stopped because of a StopNotebookExecution request.  
    */
  var Status: js.UndefOr[NotebookExecutionStatus] = js.native
  
  /**
    * A list of tags associated with a notebook execution. Tags are user-defined key value pairs that consist of a required key string with a maximum of 128 characters and an optional value string with a maximum of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object NotebookExecution {
  
  @scala.inline
  def apply(): NotebookExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookExecution]
  }
  
  @scala.inline
  implicit class NotebookExecutionOps[Self <: NotebookExecution] (val x: Self) extends AnyVal {
    
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
    def setArn(value: XmlStringMaxLen256): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setEditorId(value: XmlStringMaxLen256): Self = this.set("EditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorId: Self = this.set("EditorId", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setExecutionEngine(value: ExecutionEngineConfig): Self = this.set("ExecutionEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionEngine: Self = this.set("ExecutionEngine", js.undefined)
    
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = this.set("LastStateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStateChangeReason: Self = this.set("LastStateChangeReason", js.undefined)
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = this.set("NotebookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutionId: Self = this.set("NotebookExecutionId", js.undefined)
    
    @scala.inline
    def setNotebookExecutionName(value: XmlStringMaxLen256): Self = this.set("NotebookExecutionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutionName: Self = this.set("NotebookExecutionName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = this.set("NotebookInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceSecurityGroupId: Self = this.set("NotebookInstanceSecurityGroupId", js.undefined)
    
    @scala.inline
    def setNotebookParams(value: XmlString): Self = this.set("NotebookParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookParams: Self = this.set("NotebookParams", js.undefined)
    
    @scala.inline
    def setOutputNotebookURI(value: XmlString): Self = this.set("OutputNotebookURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputNotebookURI: Self = this.set("OutputNotebookURI", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NotebookExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
