package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typings.awsSdk.servicecatalogMod.ServiceActionAssociations = js.native
}

object BatchAssociateServiceActionWithProvisioningArtifactInput {
  @scala.inline
  def apply(ServiceActionAssociations: ServiceActionAssociations, AcceptLanguage: AcceptLanguage = null): BatchAssociateServiceActionWithProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
  }
}

