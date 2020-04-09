package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackageResponse extends js.Object {
  /**
    * Information about the package PackageDetails.
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.esMod.PackageDetails] = js.native
}

object CreatePackageResponse {
  @scala.inline
  def apply(PackageDetails: PackageDetails = null): CreatePackageResponse = {
    val __obj = js.Dynamic.literal()
    if (PackageDetails != null) __obj.updateDynamic("PackageDetails")(PackageDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageResponse]
  }
}

