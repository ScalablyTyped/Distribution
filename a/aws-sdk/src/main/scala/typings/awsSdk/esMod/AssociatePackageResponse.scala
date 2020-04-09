package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePackageResponse extends js.Object {
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetails] = js.native
}

object AssociatePackageResponse {
  @scala.inline
  def apply(DomainPackageDetails: DomainPackageDetails = null): AssociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainPackageDetails != null) __obj.updateDynamic("DomainPackageDetails")(DomainPackageDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePackageResponse]
  }
}

