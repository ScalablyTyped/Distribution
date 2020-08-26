package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsSdk.servicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The name of the plan.
    */
  var PlanName: ProvisionedProductPlanName = js.native
  /**
    * The plan type.
    */
  var PlanType: ProvisionedProductPlanType = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typings.awsSdk.servicecatalogMod.ProvisionedProductName = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * One or more tags. If the plan is for an existing provisioned product, the product must have a RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object CreateProvisionedProductPlanInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    PlanName: ProvisionedProductPlanName,
    PlanType: ProvisionedProductPlanType,
    ProductId: Id,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id
  ): CreateProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PlanName = PlanName.asInstanceOf[js.Any], PlanType = PlanType.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisionedProductPlanInput]
  }
  @scala.inline
  implicit class CreateProvisionedProductPlanInputOps[Self <: CreateProvisionedProductPlanInput] (val x: Self) extends AnyVal {
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
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = this.set("PlanName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanType(value: ProvisionedProductPlanType): Self = this.set("PlanType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = this.set("NotificationArns", js.Array(value :_*))
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = this.set("NotificationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationArns: Self = this.set("NotificationArns", js.undefined)
    @scala.inline
    def setPathId(value: Id): Self = this.set("PathId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathId: Self = this.set("PathId", js.undefined)
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = this.set("ProvisioningParameters", js.Array(value :_*))
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = this.set("ProvisioningParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningParameters: Self = this.set("ProvisioningParameters", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

