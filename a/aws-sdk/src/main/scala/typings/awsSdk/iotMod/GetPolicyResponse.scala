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
  def apply(): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyResponse]
  }
  @scala.inline
  implicit class GetPolicyResponseOps[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDefaultVersionId(value: PolicyVersionId): Self = this.set("defaultVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("defaultVersionId", js.undefined)
    @scala.inline
    def setGenerationId(value: GenerationId): Self = this.set("generationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerationId: Self = this.set("generationId", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = this.set("policyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("policyArn", js.undefined)
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDocument: Self = this.set("policyDocument", js.undefined)
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
  }
  
}

