package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainNamesResponse extends js.Object {
  /**
    * The names of the search domains owned by an account.
    */
  var DomainNames: js.UndefOr[DomainNameMap] = js.native
}

object ListDomainNamesResponse {
  @scala.inline
  def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  @scala.inline
  implicit class ListDomainNamesResponseOps[Self <: ListDomainNamesResponse] (val x: Self) extends AnyVal {
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
    def setDomainNames(value: DomainNameMap): Self = this.set("DomainNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainNames: Self = this.set("DomainNames", js.undefined)
  }
  
}

