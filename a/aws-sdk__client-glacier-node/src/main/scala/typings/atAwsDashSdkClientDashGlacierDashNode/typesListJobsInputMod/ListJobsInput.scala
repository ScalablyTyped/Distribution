package typings.atAwsDashSdkClientDashGlacierDashNode.typesListJobsInputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsInput extends _InputTypesUnion {
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
    * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. </p>
    */
  var accountId: String
  /**
    * <p>The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.</p>
    */
  var completed: js.UndefOr[String] = js.undefined
  /**
    * <p>The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer than the specified limit, but the number of returned jobs never exceeds the limit.</p>
    */
  var limit: js.UndefOr[String] = js.undefined
  /**
    * <p>An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of results started in a previous List Jobs request.</p>
    */
  var marker: js.UndefOr[String] = js.undefined
  /**
    * <p>The type of job status to return. You can specify the following values: <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>.</p>
    */
  var statuscode: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the vault.</p>
    */
  var vaultName: String
}

object ListJobsInput {
  @scala.inline
  def apply(
    accountId: String,
    vaultName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    completed: String = null,
    limit: String = null,
    marker: String = null,
    statuscode: String = null
  ): ListJobsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (statuscode != null) __obj.updateDynamic("statuscode")(statuscode)
    __obj.asInstanceOf[ListJobsInput]
  }
}

