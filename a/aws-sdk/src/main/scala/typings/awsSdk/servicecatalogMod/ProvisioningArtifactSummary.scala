package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactSummary extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.native
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
    */
  var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.native
}

object ProvisioningArtifactSummary {
  @scala.inline
  def apply(): ProvisioningArtifactSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactSummary]
  }
  @scala.inline
  implicit class ProvisioningArtifactSummaryOps[Self <: ProvisioningArtifactSummary] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: ProvisioningArtifactCreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setProvisioningArtifactMetadata(value: ProvisioningArtifactInfo): Self = this.set("ProvisioningArtifactMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactMetadata: Self = this.set("ProvisioningArtifactMetadata", js.undefined)
  }
  
}

