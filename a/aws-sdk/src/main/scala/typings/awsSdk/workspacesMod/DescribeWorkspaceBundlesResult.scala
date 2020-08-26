package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceBundlesResult extends js.Object {
  /**
    * Information about the bundles.
    */
  var Bundles: js.UndefOr[BundleList] = js.native
  /**
    * The token to use to retrieve the next set of results, or null if there are no more results available. This token is valid for one day and must be used within that time frame.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeWorkspaceBundlesResult {
  @scala.inline
  def apply(): DescribeWorkspaceBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceBundlesResultOps[Self <: DescribeWorkspaceBundlesResult] (val x: Self) extends AnyVal {
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
    def setBundlesVarargs(value: WorkspaceBundle*): Self = this.set("Bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: BundleList): Self = this.set("Bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("Bundles", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

