package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagesResult extends js.Object {
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The list of returned  PackageSummary  objects. 
    */
  var packages: js.UndefOr[PackageSummaryList] = js.native
}

object ListPackagesResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, packages: PackageSummaryList = null): ListPackagesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (packages != null) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagesResult]
  }
}

