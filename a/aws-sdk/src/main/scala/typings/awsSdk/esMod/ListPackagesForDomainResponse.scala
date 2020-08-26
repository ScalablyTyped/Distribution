package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagesForDomainResponse extends js.Object {
  /**
    * List of DomainPackageDetails objects.
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.esMod.DomainPackageDetailsList] = js.native
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListPackagesForDomainResponse {
  @scala.inline
  def apply(): ListPackagesForDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesForDomainResponse]
  }
  @scala.inline
  implicit class ListPackagesForDomainResponseOps[Self <: ListPackagesForDomainResponse] (val x: Self) extends AnyVal {
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
    def setDomainPackageDetailsListVarargs(value: DomainPackageDetails*): Self = this.set("DomainPackageDetailsList", js.Array(value :_*))
    @scala.inline
    def setDomainPackageDetailsList(value: DomainPackageDetailsList): Self = this.set("DomainPackageDetailsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainPackageDetailsList: Self = this.set("DomainPackageDetailsList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

