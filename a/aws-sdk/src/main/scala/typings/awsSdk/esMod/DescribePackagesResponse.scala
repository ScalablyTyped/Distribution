package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagesResponse extends js.Object {
  var NextToken: js.UndefOr[String] = js.native
  /**
    * List of PackageDetails objects.
    */
  var PackageDetailsList: js.UndefOr[typings.awsSdk.esMod.PackageDetailsList] = js.native
}

object DescribePackagesResponse {
  @scala.inline
  def apply(NextToken: String = null, PackageDetailsList: PackageDetailsList = null): DescribePackagesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PackageDetailsList != null) __obj.updateDynamic("PackageDetailsList")(PackageDetailsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagesResponse]
  }
}

