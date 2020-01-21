package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typings.awsSdk.servicecatalogMod.FailedServiceActionAssociations] = js.native
}

object BatchAssociateServiceActionWithProvisioningArtifactOutput {
  @scala.inline
  def apply(FailedServiceActionAssociations: FailedServiceActionAssociations = null): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedServiceActionAssociations != null) __obj.updateDynamic("FailedServiceActionAssociations")(FailedServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
  }
}

