package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to store artifacts for the pipeline in AWS CodePipeline.
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
  def apply(
    actionConfiguration: ActionConfiguration = null,
    actionTypeId: ActionTypeId = null,
    artifactCredentials: AWSSessionCredentials = null,
    continuationToken: ContinuationToken = null,
    encryptionKey: EncryptionKey = null,
    inputArtifacts: ArtifactList = null,
    outputArtifacts: ArtifactList = null,
    pipelineContext: PipelineContext = null
  ): JobData = {
    val __obj = js.Dynamic.literal()
    if (actionConfiguration != null) __obj.updateDynamic("actionConfiguration")(actionConfiguration.asInstanceOf[js.Any])
    if (actionTypeId != null) __obj.updateDynamic("actionTypeId")(actionTypeId.asInstanceOf[js.Any])
    if (artifactCredentials != null) __obj.updateDynamic("artifactCredentials")(artifactCredentials.asInstanceOf[js.Any])
    if (continuationToken != null) __obj.updateDynamic("continuationToken")(continuationToken.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (pipelineContext != null) __obj.updateDynamic("pipelineContext")(pipelineContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobData]
  }
}

