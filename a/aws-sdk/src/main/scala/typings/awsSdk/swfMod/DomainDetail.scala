package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDetail extends js.Object {
  
  /**
    * The domain configuration. Currently, this includes only the domain's retention period.
    */
  var configuration: DomainConfiguration = js.native
  
  /**
    * The basic information about a domain, such as its name, status, and description.
    */
  var domainInfo: DomainInfo = js.native
}
object DomainDetail {
  
  @scala.inline
  def apply(configuration: DomainConfiguration, domainInfo: DomainInfo): DomainDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], domainInfo = domainInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetail]
  }
  
  @scala.inline
  implicit class DomainDetailOps[Self <: DomainDetail] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: DomainConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainInfo(value: DomainInfo): Self = this.set("domainInfo", value.asInstanceOf[js.Any])
  }
}
