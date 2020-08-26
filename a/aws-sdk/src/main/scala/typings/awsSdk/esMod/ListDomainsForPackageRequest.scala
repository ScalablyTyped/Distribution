package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsForPackageRequest extends js.Object {
  /**
    * Limits results to a maximum number of domains.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  /**
    * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided, returns results for the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
  /**
    * The package for which to list domains.
    */
  var PackageID: typings.awsSdk.esMod.PackageID = js.native
}

object ListDomainsForPackageRequest {
  @scala.inline
  def apply(PackageID: PackageID): ListDomainsForPackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsForPackageRequest]
  }
  @scala.inline
  implicit class ListDomainsForPackageRequestOps[Self <: ListDomainsForPackageRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

