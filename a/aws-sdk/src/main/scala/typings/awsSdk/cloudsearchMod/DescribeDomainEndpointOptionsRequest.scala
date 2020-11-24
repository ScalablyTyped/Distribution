package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainEndpointOptionsRequest extends js.Object {
  
  /**
    * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active configuration. Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}
object DescribeDomainEndpointOptionsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainEndpointOptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainEndpointOptionsRequestOps[Self <: DescribeDomainEndpointOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployed(value: Boolean): Self = this.set("Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployed: Self = this.set("Deployed", js.undefined)
  }
}
