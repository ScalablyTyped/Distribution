package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobData extends js.Object {
  
  /**
    * Represents information about an action configuration.
    */
  var actionConfiguration: js.UndefOr[ActionConfiguration] = js.native
  
  /**
    * Represents information about an action type.
    */
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  
  /**
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the S3 bucket used to store artifacts for the pipeline in AWS CodePipeline.
    */
  var artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.native
  
  /**
    * A system-generated token, such as a AWS CodeDeploy deployment ID, required by a job to continue the job asynchronously.
    */
  var continuationToken: js.UndefOr[ContinuationToken] = js.native
  
  /**
    * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. 
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.native
  
  /**
    * The artifact supplied to the job.
    */
  var inputArtifacts: js.UndefOr[ArtifactList] = js.native
  
  /**
    * The output of the job.
    */
  var outputArtifacts: js.UndefOr[ArtifactList] = js.native
  
  /**
    * Represents information about a pipeline to a job worker.  Includes pipelineArn and pipelineExecutionId for custom jobs. 
    */
  var pipelineContext: js.UndefOr[PipelineContext] = js.native
}
object JobData {
  
  @scala.inline
  def apply(): JobData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobData]
  }
  
  @scala.inline
  implicit class JobDataOps[Self <: JobData] (val x: Self) extends AnyVal {
    
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
    def setActionConfiguration(value: ActionConfiguration): Self = this.set("actionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionConfiguration: Self = this.set("actionConfiguration", js.undefined)
    
    @scala.inline
    def setActionTypeId(value: ActionTypeId): Self = this.set("actionTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionTypeId: Self = this.set("actionTypeId", js.undefined)
    
    @scala.inline
    def setArtifactCredentials(value: AWSSessionCredentials): Self = this.set("artifactCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactCredentials: Self = this.set("artifactCredentials", js.undefined)
    
    @scala.inline
    def setContinuationToken(value: ContinuationToken): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("continuationToken", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setInputArtifactsVarargs(value: Artifact*): Self = this.set("inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifacts(value: ArtifactList): Self = this.set("inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputArtifacts: Self = this.set("inputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputArtifactsVarargs(value: Artifact*): Self = this.set("outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: ArtifactList): Self = this.set("outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("outputArtifacts", js.undefined)
    
    @scala.inline
    def setPipelineContext(value: PipelineContext): Self = this.set("pipelineContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineContext: Self = this.set("pipelineContext", js.undefined)
  }
}
