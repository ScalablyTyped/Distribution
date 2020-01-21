package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBundlesResult extends js.Object {
  /**
    *  A list of bundles. 
    */
  var bundleList: js.UndefOr[BundleList] = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBundlesResult {
  @scala.inline
  def apply(bundleList: BundleList = null, nextToken: NextToken = null): ListBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (bundleList != null) __obj.updateDynamic("bundleList")(bundleList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBundlesResult]
  }
}

