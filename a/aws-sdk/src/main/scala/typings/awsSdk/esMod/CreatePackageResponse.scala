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
  def apply(): CreatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePackageResponse]
  }
  @scala.inline
  implicit class CreatePackageResponseOps[Self <: CreatePackageResponse] (val x: Self) extends AnyVal {
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
    def setPackageDetails(value: PackageDetails): Self = this.set("PackageDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageDetails: Self = this.set("PackageDetails", js.undefined)
  }
  
}

