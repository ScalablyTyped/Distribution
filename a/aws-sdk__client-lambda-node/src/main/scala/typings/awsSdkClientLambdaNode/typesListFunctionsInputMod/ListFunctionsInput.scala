package typings.awsSdkClientLambdaNode.typesListFunctionsInputMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ALL
import typings.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFunctionsInput extends _InputTypesUnion {
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
    * <p>Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN is returned.</p>
    */
  var FunctionVersion: js.UndefOr[ALL | String] = js.undefined
  /**
    * <p>Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If present, indicates where to continue the listing. </p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the <code>FunctionVersion</code>.</p>
    */
  var MasterRegion: js.UndefOr[String] = js.undefined
  /**
    * <p>Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.</p>
    */
  var MaxItems: js.UndefOr[Double] = js.undefined
}

object ListFunctionsInput {
  @scala.inline
  def apply(
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    FunctionVersion: ALL | String = null,
    Marker: String = null,
    MasterRegion: String = null,
    MaxItems: Int | Double = null
  ): ListFunctionsInput = {
    val __obj = js.Dynamic.literal()
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MasterRegion != null) __obj.updateDynamic("MasterRegion")(MasterRegion.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionsInput]
  }
}

