package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResult extends js.Object {
  /**
    *  The returned list of  DomainSummary  objects. 
    */
  var domains: js.UndefOr[DomainSummaryList] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDomainsResult {
  @scala.inline
  def apply(): ListDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResult]
  }
  @scala.inline
  implicit class ListDomainsResultOps[Self <: ListDomainsResult] (val x: Self) extends AnyVal {
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
    def setDomainsVarargs(value: DomainSummary*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: DomainSummaryList): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

