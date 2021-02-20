package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainConfigurationRequest extends StObject {
  
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
  implicit class DeleteDomainConfigurationRequestMutableBuilder[Self <: DeleteDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
