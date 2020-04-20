package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePackageRequest extends js.Object {
  /**
    * Internal ID of the package that you want to delete. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}

object DeletePackageRequest {
  @scala.inline
  def apply(PackageID: PackageID): DeletePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageRequest]
  }
}

