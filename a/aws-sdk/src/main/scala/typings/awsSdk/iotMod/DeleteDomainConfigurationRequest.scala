package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainConfigurationRequest extends js.Object {
  
  /**
    * The name of the domain configuration to be deleted.
    */
  var domainConfigurationName: DomainConfigurationName = js.native
}
object DeleteDomainConfigurationRequest {
  
  @scala.inline
  def apply(domainConfigurationName: DomainConfigurationName): DeleteDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainConfigurationRequestOps[Self <: DeleteDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainConfigurationName(value: DomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
