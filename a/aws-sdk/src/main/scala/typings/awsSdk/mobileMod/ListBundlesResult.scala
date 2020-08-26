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
  def apply(): ListBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesResult]
  }
  @scala.inline
  implicit class ListBundlesResultOps[Self <: ListBundlesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundleListVarargs(value: BundleDetails*): Self = this.set("bundleList", js.Array(value :_*))
    @scala.inline
    def setBundleList(value: BundleList): Self = this.set("bundleList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleList: Self = this.set("bundleList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

