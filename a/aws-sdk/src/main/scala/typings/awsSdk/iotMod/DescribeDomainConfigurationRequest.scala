package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainConfigurationRequest extends js.Object {
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
}
object DescribeDomainConfigurationRequest {
  
  @scala.inline
  def apply(domainConfigurationName: ReservedDomainConfigurationName): DescribeDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainConfigurationRequestOps[Self <: DescribeDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
