package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResponse extends js.Object {
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The default policy version ID.
    */
  var defaultVersionId: js.UndefOr[PolicyVersionId] = js.native
  /**
    * The generation ID of the policy.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
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
}

object GetPolicyResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    defaultVersionId: PolicyVersionId = null,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null
  ): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (defaultVersionId != null) __obj.updateDynamic("defaultVersionId")(defaultVersionId.asInstanceOf[js.Any])
    if (generationId != null) __obj.updateDynamic("generationId")(generationId.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

