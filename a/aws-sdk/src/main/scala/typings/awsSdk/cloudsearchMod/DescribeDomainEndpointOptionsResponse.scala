package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainEndpointOptionsResponse extends js.Object {
  /**
    * The status and configuration of a search domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}

object DescribeDomainEndpointOptionsResponse {
  @scala.inline
  def apply(): DescribeDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
  }
  @scala.inline
  implicit class DescribeDomainEndpointOptionsResponseOps[Self <: DescribeDomainEndpointOptionsResponse] (val x: Self) extends AnyVal {
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
    def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("DomainEndpointOptions", js.undefined)
  }
  
}

