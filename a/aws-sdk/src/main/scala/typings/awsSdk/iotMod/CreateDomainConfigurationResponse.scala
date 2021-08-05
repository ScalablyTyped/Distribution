package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainConfigurationResponse extends StObject {
  
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.undefined
}
object CreateDomainConfigurationResponse {
  
  inline def apply(): CreateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainConfigurationResponse]
  }
  
  extension [Self <: CreateDomainConfigurationResponse](x: Self) {
    
    inline def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    inline def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
  }
}
