package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * Indicates whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.native
  /**
    * The updated description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. The DEFAULT value indicates that the product version is active. The administrator can set the guidance to DEPRECATED to inform users that the product version is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.native
  /**
    * The updated name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
}

object UpdateProvisioningArtifactInput {
  @scala.inline
  def apply(ProductId: Id, ProvisioningArtifactId: Id): UpdateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningArtifactInput]
  }
  @scala.inline
  implicit class UpdateProvisioningArtifactInputOps[Self <: UpdateProvisioningArtifactInput] (val x: Self) extends AnyVal {
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
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setActive(value: ProvisioningArtifactActive): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGuidance(value: ProvisioningArtifactGuidance): Self = this.set("Guidance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuidance: Self = this.set("Guidance", js.undefined)
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

