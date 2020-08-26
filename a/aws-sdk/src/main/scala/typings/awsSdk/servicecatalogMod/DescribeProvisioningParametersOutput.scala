package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningParametersOutput extends js.Object {
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  /**
    * The output of the provisioning artifact.
    */
  var ProvisioningArtifactOutputs: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactOutputs] = js.native
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactParameters] = js.native
  /**
    * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactPreferences] = js.native
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.native
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[typings.awsSdk.servicecatalogMod.UsageInstructions] = js.native
}

object DescribeProvisioningParametersOutput {
  @scala.inline
  def apply(): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
  @scala.inline
  implicit class DescribeProvisioningParametersOutputOps[Self <: DescribeProvisioningParametersOutput] (val x: Self) extends AnyVal {
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
    def setConstraintSummariesVarargs(value: ConstraintSummary*): Self = this.set("ConstraintSummaries", js.Array(value :_*))
    @scala.inline
    def setConstraintSummaries(value: ConstraintSummaries): Self = this.set("ConstraintSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintSummaries: Self = this.set("ConstraintSummaries", js.undefined)
    @scala.inline
    def setProvisioningArtifactOutputsVarargs(value: ProvisioningArtifactOutput*): Self = this.set("ProvisioningArtifactOutputs", js.Array(value :_*))
    @scala.inline
    def setProvisioningArtifactOutputs(value: ProvisioningArtifactOutputs): Self = this.set("ProvisioningArtifactOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactOutputs: Self = this.set("ProvisioningArtifactOutputs", js.undefined)
    @scala.inline
    def setProvisioningArtifactParametersVarargs(value: ProvisioningArtifactParameter*): Self = this.set("ProvisioningArtifactParameters", js.Array(value :_*))
    @scala.inline
    def setProvisioningArtifactParameters(value: ProvisioningArtifactParameters): Self = this.set("ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactParameters: Self = this.set("ProvisioningArtifactParameters", js.undefined)
    @scala.inline
    def setProvisioningArtifactPreferences(value: ProvisioningArtifactPreferences): Self = this.set("ProvisioningArtifactPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactPreferences: Self = this.set("ProvisioningArtifactPreferences", js.undefined)
    @scala.inline
    def setTagOptionsVarargs(value: TagOptionSummary*): Self = this.set("TagOptions", js.Array(value :_*))
    @scala.inline
    def setTagOptions(value: TagOptionSummaries): Self = this.set("TagOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagOptions: Self = this.set("TagOptions", js.undefined)
    @scala.inline
    def setUsageInstructionsVarargs(value: UsageInstruction*): Self = this.set("UsageInstructions", js.Array(value :_*))
    @scala.inline
    def setUsageInstructions(value: UsageInstructions): Self = this.set("UsageInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageInstructions: Self = this.set("UsageInstructions", js.undefined)
  }
  
}

