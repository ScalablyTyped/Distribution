package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAutomationExecutionRequest extends js.Object {
  
  /**
    * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and can't be reused.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.native
  
  /**
    * The name of the Automation document to use for this execution.
    */
  var DocumentName: DocumentARN = js.native
  
  /**
    * The version of the Automation document to use for this execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a percentage, such as 10%. The default value is 10.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The number of errors that are allowed before the system stops running the automation on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If you specify 0, then the system stops running the automation on additional targets after the first error result is returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the automation on additional targets when the sixth error is received. Executions that are already running an automation when max-errors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set max-concurrency to 1 so the executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode is Auto.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  
  /**
    * A key-value map of execution parameters, which match the declared parameters in the Automation document.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an automation. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an automation to identify an environment or operating system. In this case, you could specify the following key name/value pairs:    Key=environment,Value=test     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this action to start an Automation in multiple Regions and multiple accounts. For more information, see Running Automation workflows in multiple AWS Regions and accounts in the AWS Systems Manager User Guide. 
    */
  var TargetLocations: js.UndefOr[typings.awsSdk.ssmMod.TargetLocations] = js.native
  
  /**
    * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified together.
    */
  var TargetMaps: js.UndefOr[typings.awsSdk.ssmMod.TargetMaps] = js.native
  
  /**
    * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify targets.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  
  /**
    * A key-value mapping to target resources. Required if you specify TargetParameterName.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
}
object StartAutomationExecutionRequest {
  
  @scala.inline
  def apply(DocumentName: DocumentARN): StartAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAutomationExecutionRequest]
  }
  
  @scala.inline
  implicit class StartAutomationExecutionRequestOps[Self <: StartAutomationExecutionRequest] (val x: Self) extends AnyVal {
    
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
    def setDocumentName(value: DocumentARN): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: IdempotencyToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = this.set("MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxErrors: Self = this.set("MaxErrors", js.undefined)
    
    @scala.inline
    def setMode(value: ExecutionMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setParameters(value: AutomationParameterMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTargetLocationsVarargs(value: TargetLocation*): Self = this.set("TargetLocations", js.Array(value :_*))
    
    @scala.inline
    def setTargetLocations(value: TargetLocations): Self = this.set("TargetLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLocations: Self = this.set("TargetLocations", js.undefined)
    
    @scala.inline
    def setTargetMapsVarargs(value: TargetMap*): Self = this.set("TargetMaps", js.Array(value :_*))
    
    @scala.inline
    def setTargetMaps(value: TargetMaps): Self = this.set("TargetMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetMaps: Self = this.set("TargetMaps", js.undefined)
    
    @scala.inline
    def setTargetParameterName(value: AutomationParameterKey): Self = this.set("TargetParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetParameterName: Self = this.set("TargetParameterName", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
}
