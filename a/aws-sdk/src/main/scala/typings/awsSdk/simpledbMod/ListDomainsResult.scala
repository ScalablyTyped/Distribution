package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResult extends js.Object {
  /**
    * A list of domain names that match the expression.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.native
  /**
    * An opaque token indicating that there are more domains than the specified MaxNumberOfDomains still available.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    def setDomainNamesVarargs(value: String*): Self = this.set("DomainNames", js.Array(value :_*))
    @scala.inline
    def setDomainNames(value: DomainNameList): Self = this.set("DomainNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainNames: Self = this.set("DomainNames", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

