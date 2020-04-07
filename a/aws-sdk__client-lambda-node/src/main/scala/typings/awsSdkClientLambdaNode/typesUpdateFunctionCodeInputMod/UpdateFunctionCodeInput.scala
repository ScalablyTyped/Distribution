package typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod

import typings.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFunctionCodeInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>This boolean parameter can be used to test your request to AWS Lambda to update the Lambda function and publish a version as an atomic operation. It will do all necessary computation and validation of your code but will not upload it or a publish a version. Each time this operation is invoked, the <code>CodeSha256</code> hash value of the provided code will also be computed and returned in the response.</p>
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
    */
  var FunctionName: String
  /**
    * <p>This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as an atomic operation.</p>
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>An optional value you can use to ensure you are updating the latest update of the function version or alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias, it will fail with an error message, advising you to retrieve the latest function version or alias <code>RevisionID</code> using either using using either <a>GetFunction</a> or <a>GetAlias</a>.</p>
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * <p>Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside in the same AWS Region where you are creating the Lambda function.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon S3 object (the deployment package) key name you want to upload.</p>
    */
  var S3Key: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon S3 object (the deployment package) version you want to upload.</p>
    */
  var S3ObjectVersion: js.UndefOr[String] = js.undefined
  /**
    * <p>The contents of your zip file containing your deployment package. If you are using the web API directly, the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for you. For more information about creating a .zip file, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution Permissions</a>. </p>
    */
  var ZipFile: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
}

object UpdateFunctionCodeInput {
  @scala.inline
  def apply(
    FunctionName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Publish: js.UndefOr[Boolean] = js.undefined,
    RevisionId: String = null,
    S3Bucket: String = null,
    S3Key: String = null,
    S3ObjectVersion: String = null,
    ZipFile: ArrayBuffer | ArrayBufferView | String = null
  ): UpdateFunctionCodeInput = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(Publish)) __obj.updateDynamic("Publish")(Publish.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion.asInstanceOf[js.Any])
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeInput]
  }
}

