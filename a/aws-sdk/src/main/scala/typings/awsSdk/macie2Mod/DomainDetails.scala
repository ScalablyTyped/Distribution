package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends js.Object {
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[string] = js.native
}

object DomainDetails {
  @scala.inline
  def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  @scala.inline
  implicit class DomainDetailsOps[Self <: DomainDetails] (val x: Self) extends AnyVal {
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
    def setDomainName(value: string): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
  }
  
}

