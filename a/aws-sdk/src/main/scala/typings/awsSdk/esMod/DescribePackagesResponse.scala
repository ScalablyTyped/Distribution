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
  def apply(): DescribePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesResponse]
  }
  @scala.inline
  implicit class DescribePackagesResponseOps[Self <: DescribePackagesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPackageDetailsListVarargs(value: PackageDetails*): Self = this.set("PackageDetailsList", js.Array(value :_*))
    @scala.inline
    def setPackageDetailsList(value: PackageDetailsList): Self = this.set("PackageDetailsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageDetailsList: Self = this.set("PackageDetailsList", js.undefined)
  }
  
}

