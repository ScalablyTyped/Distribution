package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionDetails extends js.Object {
  /**
    * An AwsLambdaFunctionCode object.
    */
  var Code: js.UndefOr[AwsLambdaFunctionCode] = js.native
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig] = js.native
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[AwsLambdaFunctionEnvironment] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[NonEmptyString] = js.native
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KmsKeyArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's layers.
    */
  var Layers: js.UndefOr[AwsLambdaFunctionLayerList] = js.native
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[Integer] = js.native
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[NonEmptyString] = js.native
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[Integer] = js.native
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.native
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.native
}

object AwsLambdaFunctionDetails {
  @scala.inline
  def apply(): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
  @scala.inline
  implicit class AwsLambdaFunctionDetailsOps[Self <: AwsLambdaFunctionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: AwsLambdaFunctionCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setCodeSha256(value: NonEmptyString): Self = this.set("CodeSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSha256: Self = this.set("CodeSha256", js.undefined)
    @scala.inline
    def setDeadLetterConfig(value: AwsLambdaFunctionDeadLetterConfig): Self = this.set("DeadLetterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("DeadLetterConfig", js.undefined)
    @scala.inline
    def setEnvironment(value: AwsLambdaFunctionEnvironment): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setFunctionName(value: NonEmptyString): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("FunctionName", js.undefined)
    @scala.inline
    def setHandler(value: NonEmptyString): Self = this.set("Handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("Handler", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: NonEmptyString): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
    @scala.inline
    def setLastModified(value: NonEmptyString): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setLayersVarargs(value: AwsLambdaFunctionLayer*): Self = this.set("Layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: AwsLambdaFunctionLayerList): Self = this.set("Layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("Layers", js.undefined)
    @scala.inline
    def setMasterArn(value: NonEmptyString): Self = this.set("MasterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterArn: Self = this.set("MasterArn", js.undefined)
    @scala.inline
    def setMemorySize(value: Integer): Self = this.set("MemorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemorySize: Self = this.set("MemorySize", js.undefined)
    @scala.inline
    def setRevisionId(value: NonEmptyString): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    @scala.inline
    def setRole(value: NonEmptyString): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    @scala.inline
    def setRuntime(value: NonEmptyString): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("Runtime", js.undefined)
    @scala.inline
    def setTimeout(value: Integer): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    @scala.inline
    def setTracingConfig(value: AwsLambdaFunctionTracingConfig): Self = this.set("TracingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingConfig: Self = this.set("TracingConfig", js.undefined)
    @scala.inline
    def setVersion(value: NonEmptyString): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    @scala.inline
    def setVpcConfig(value: AwsLambdaFunctionVpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

