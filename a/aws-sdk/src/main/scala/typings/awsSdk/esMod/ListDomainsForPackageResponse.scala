package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsForPackageResponse extends js.Object {
  /**
    * List of DomainPackageDetails objects.
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetailsList] = js.native
  var NextToken: js.UndefOr[String] = js.native
}

object ListDomainsForPackageResponse {
  @scala.inline
  def apply(DomainPackageDetailsList: DomainPackageDetailsList = null, NextToken: String = null): ListDomainsForPackageResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainPackageDetailsList != null) __obj.updateDynamic("DomainPackageDetailsList")(DomainPackageDetailsList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsForPackageResponse]
  }
}

