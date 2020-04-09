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
  def apply(PackageID: PackageID, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListDomainsForPackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsForPackageRequest]
  }
}

