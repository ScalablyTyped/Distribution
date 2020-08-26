package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DissociatePackageRequest extends js.Object {
  /**
    * Name of the domain that you want to associate the package with.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    * Internal ID of the package that you want to associate with a domain. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}

object DissociatePackageRequest {
  @scala.inline
  def apply(DomainName: DomainName, PackageID: PackageID): DissociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociatePackageRequest]
  }
  @scala.inline
  implicit class DissociatePackageRequestOps[Self <: DissociatePackageRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageID(value: PackageID): Self = this.set("PackageID", value.asInstanceOf[js.Any])
  }
  
}

