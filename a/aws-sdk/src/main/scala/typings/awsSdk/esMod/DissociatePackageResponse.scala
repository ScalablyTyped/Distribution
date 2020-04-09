package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DissociatePackageResponse extends js.Object {
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetails] = js.native
}

object DissociatePackageResponse {
  @scala.inline
  def apply(DomainPackageDetails: DomainPackageDetails = null): DissociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainPackageDetails != null) __obj.updateDynamic("DomainPackageDetails")(DomainPackageDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociatePackageResponse]
  }
}

