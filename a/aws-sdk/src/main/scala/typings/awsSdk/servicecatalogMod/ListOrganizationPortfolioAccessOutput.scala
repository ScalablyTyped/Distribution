package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationPortfolioAccessOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNodes] = js.native
}

object ListOrganizationPortfolioAccessOutput {
  @scala.inline
  def apply(): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
  @scala.inline
  implicit class ListOrganizationPortfolioAccessOutputOps[Self <: ListOrganizationPortfolioAccessOutput] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setOrganizationNodesVarargs(value: OrganizationNode*): Self = this.set("OrganizationNodes", js.Array(value :_*))
    @scala.inline
    def setOrganizationNodes(value: OrganizationNodes): Self = this.set("OrganizationNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationNodes: Self = this.set("OrganizationNodes", js.undefined)
  }
  
}

