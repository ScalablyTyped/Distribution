package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceBundlesRequest extends js.Object {
  /**
    * The identifiers of the bundles. You cannot combine this parameter with any other filter.
    */
  var BundleIds: js.UndefOr[BundleIdList] = js.native
  /**
    * The token for the next set of results. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The owner of the bundles. You cannot combine this parameter with any other filter. Specify AMAZON to describe the bundles provided by AWS or null to describe the bundles that belong to your account.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
}

object DescribeWorkspaceBundlesRequest {
  @scala.inline
  def apply(): DescribeWorkspaceBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
  }
  @scala.inline
  implicit class DescribeWorkspaceBundlesRequestOps[Self <: DescribeWorkspaceBundlesRequest] (val x: Self) extends AnyVal {
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
    def setBundleIdsVarargs(value: BundleId*): Self = this.set("BundleIds", js.Array(value :_*))
    @scala.inline
    def setBundleIds(value: BundleIdList): Self = this.set("BundleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleIds: Self = this.set("BundleIds", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOwner(value: BundleOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}

