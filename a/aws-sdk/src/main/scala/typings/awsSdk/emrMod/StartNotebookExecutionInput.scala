package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartNotebookExecutionInput extends js.Object {
  
  /**
    * The unique identifier of the EMR Notebook to use for notebook execution.
    */
  var EditorId: XmlStringMaxLen256 = js.native
  
  /**
    * Specifies the execution engine (cluster) that runs the notebook execution.
    */
  var ExecutionEngine: ExecutionEngineConfig = js.native
  
  /**
    * An optional name for the notebook execution.
    */
  var NotebookExecutionName: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The unique identifier of the Amazon EC2 security group to associate with the EMR Notebook for this notebook execution.
    */
  var NotebookInstanceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
    */
  var NotebookParams: js.UndefOr[XmlString] = js.native
  
  /**
    * The path and file name of the notebook file for this execution, relative to the path specified for the EMR Notebook. For example, if you specify a path of s3://MyBucket/MyNotebooks when you create an EMR Notebook for a notebook with an ID of e-ABCDEFGHIJK1234567890ABCD (the EditorID of this request), and you specify a RelativePath of my_notebook_executions/notebook_execution.ipynb, the location of the file for the notebook execution is s3://MyBucket/MyNotebooks/e-ABCDEFGHIJK1234567890ABCD/my_notebook_executions/notebook_execution.ipynb.
    */
  var RelativePath: XmlString = js.native
  
  /**
    * The name or ARN of the IAM role that is used as the service role for Amazon EMR (the EMR role) for the notebook execution.
    */
  var ServiceRole: XmlString = js.native
  
  /**
    * A list of tags associated with a notebook execution. Tags are user-defined key value pairs that consist of a required key string with a maximum of 128 characters and an optional value string with a maximum of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object StartNotebookExecutionInput {
  
  @scala.inline
  def apply(
    EditorId: XmlStringMaxLen256,
    ExecutionEngine: ExecutionEngineConfig,
    RelativePath: XmlString,
    ServiceRole: XmlString
  ): StartNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(EditorId = EditorId.asInstanceOf[js.Any], ExecutionEngine = ExecutionEngine.asInstanceOf[js.Any], RelativePath = RelativePath.asInstanceOf[js.Any], ServiceRole = ServiceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNotebookExecutionInput]
  }
  
  @scala.inline
  implicit class StartNotebookExecutionInputOps[Self <: StartNotebookExecutionInput] (val x: Self) extends AnyVal {
    
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
    def setEditorId(value: XmlStringMaxLen256): Self = this.set("EditorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEngine(value: ExecutionEngineConfig): Self = this.set("ExecutionEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: XmlString): Self = this.set("RelativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRole(value: XmlString): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
