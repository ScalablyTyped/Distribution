package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyVersionResponse extends js.Object {
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The generation ID of the policy version.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The date the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object GetPolicyVersionResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    generationId: GenerationId = null,
    isDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDate: DateType = null,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null,
    policyVersionId: PolicyVersionId = null
  ): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (generationId != null) __obj.updateDynamic("generationId")(generationId.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
}

