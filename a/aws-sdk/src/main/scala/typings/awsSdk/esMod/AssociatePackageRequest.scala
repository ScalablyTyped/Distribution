package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePackageRequest extends js.Object {
  /**
    * Name of the domain that you want to associate the package with.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    * Internal ID of the package that you want to associate with a domain. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}

object AssociatePackageRequest {
  @scala.inline
  def apply(DomainName: DomainName, PackageID: PackageID): AssociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePackageRequest]
  }
}

