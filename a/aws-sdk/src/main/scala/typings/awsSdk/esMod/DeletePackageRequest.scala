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
  @scala.inline
  implicit class DeletePackageRequestOps[Self <: DeletePackageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
  }
  
}

