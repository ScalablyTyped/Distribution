package typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSamplingRuleInput extends InputTypesUnion {
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
    * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object DeleteSamplingRuleInput {
  @scala.inline
  def apply(
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    RuleARN: String = null,
    RuleName: String = null
  ): DeleteSamplingRuleInput = {
    val __obj = js.Dynamic.literal()
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSamplingRuleInput]
  }
}

