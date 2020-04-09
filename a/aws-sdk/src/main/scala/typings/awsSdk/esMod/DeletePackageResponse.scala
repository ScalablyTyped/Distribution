package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePackageResponse extends js.Object {
  /**
    * PackageDetails
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.esMod.PackageDetails] = js.native
}

object DeletePackageResponse {
  @scala.inline
  def apply(PackageDetails: PackageDetails = null): DeletePackageResponse = {
    val __obj = js.Dynamic.literal()
    if (PackageDetails != null) __obj.updateDynamic("PackageDetails")(PackageDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageResponse]
  }
}

