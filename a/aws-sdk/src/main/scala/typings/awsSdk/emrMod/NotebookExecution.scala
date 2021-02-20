package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookExecution extends StObject {
  
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
  implicit class NotebookExecutionMutableBuilder[Self <: NotebookExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: XmlStringMaxLen256): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setEditorId(value: XmlStringMaxLen256): Self = StObject.set(x, "EditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorIdUndefined: Self = StObject.set(x, "EditorId", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setExecutionEngine(value: ExecutionEngineConfig): Self = StObject.set(x, "ExecutionEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEngineUndefined: Self = StObject.set(x, "ExecutionEngine", js.undefined)
    
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookExecutionIdUndefined: Self = StObject.set(x, "NotebookExecutionId", js.undefined)
    
    @scala.inline
    def setNotebookExecutionName(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookExecutionNameUndefined: Self = StObject.set(x, "NotebookExecutionName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookInstanceSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceSecurityGroupIdUndefined: Self = StObject.set(x, "NotebookInstanceSecurityGroupId", js.undefined)
    
    @scala.inline
    def setNotebookParams(value: XmlString): Self = StObject.set(x, "NotebookParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookParamsUndefined: Self = StObject.set(x, "NotebookParams", js.undefined)
    
    @scala.inline
    def setOutputNotebookURI(value: XmlString): Self = StObject.set(x, "OutputNotebookURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputNotebookURIUndefined: Self = StObject.set(x, "OutputNotebookURI", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NotebookExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
