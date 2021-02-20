package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainConfigurationResponse extends StObject {
  
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.native
}
object CreateDomainConfigurationResponse {
  
  @scala.inline
  def apply(): CreateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreateDomainConfigurationResponseMutableBuilder[Self <: CreateDomainConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    @scala.inline
    def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
  }
}
