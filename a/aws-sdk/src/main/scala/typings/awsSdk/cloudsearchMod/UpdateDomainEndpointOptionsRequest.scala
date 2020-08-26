package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEndpointOptionsRequest extends js.Object {
  /**
    * Whether to require that all requests to the domain arrive over HTTPS. We recommend Policy-Min-TLS-1-2-2019-07 for TLSSecurityPolicy. For compatibility with older clients, the default is Policy-Min-TLS-1-0-2019-07. 
    */
  var DomainEndpointOptions: typings.awsSdk.cloudsearchMod.DomainEndpointOptions = js.native
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object UpdateDomainEndpointOptionsRequest {
  @scala.inline
  def apply(DomainEndpointOptions: DomainEndpointOptions, DomainName: DomainName): UpdateDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainEndpointOptions = DomainEndpointOptions.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEndpointOptionsRequest]
  }
  @scala.inline
  implicit class UpdateDomainEndpointOptionsRequestOps[Self <: UpdateDomainEndpointOptionsRequest] (val x: Self) extends AnyVal {
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
    def setDomainEndpointOptions(value: DomainEndpointOptions): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
  
}

