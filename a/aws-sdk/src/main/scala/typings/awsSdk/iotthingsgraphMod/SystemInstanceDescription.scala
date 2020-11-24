package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInstanceDescription extends js.Object {
  
  var definition: js.UndefOr[DefinitionDocument] = js.native
  
  /**
    * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS services that the flow uses.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  
  /**
    * The Amazon Simple Storage Service bucket where information about a system instance is stored.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  
  /**
    * An object that contains summary information about a system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
  
  /**
    * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a system instance.
    */
  var validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.native
  
  /**
    * The version of the user's namespace against which the system instance was validated.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}
object SystemInstanceDescription {
  
  @scala.inline
  def apply(): SystemInstanceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceDescription]
  }
  
  @scala.inline
  implicit class SystemInstanceDescriptionOps[Self <: SystemInstanceDescription] (val x: Self) extends AnyVal {
    
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
    def setDefinition(value: DefinitionDocument): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setFlowActionsRoleArn(value: RoleArn): Self = this.set("flowActionsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowActionsRoleArn: Self = this.set("flowActionsRoleArn", js.undefined)
    
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = this.set("metricsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsConfiguration: Self = this.set("metricsConfiguration", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
    
    @scala.inline
    def setSummary(value: SystemInstanceSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setValidatedDependencyRevisionsVarargs(value: DependencyRevision*): Self = this.set("validatedDependencyRevisions", js.Array(value :_*))
    
    @scala.inline
    def setValidatedDependencyRevisions(value: DependencyRevisions): Self = this.set("validatedDependencyRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatedDependencyRevisions: Self = this.set("validatedDependencyRevisions", js.undefined)
    
    @scala.inline
    def setValidatedNamespaceVersion(value: Version): Self = this.set("validatedNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatedNamespaceVersion: Self = this.set("validatedNamespaceVersion", js.undefined)
  }
}
