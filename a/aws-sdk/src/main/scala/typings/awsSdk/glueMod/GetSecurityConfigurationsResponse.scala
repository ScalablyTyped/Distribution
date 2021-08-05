package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityConfigurationsResponse extends StObject {
  
  /**
    * A continuation token, if there are more security configurations to return.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of security configurations.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
}
object GetSecurityConfigurationsResponse {
  
  inline def apply(): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
  
  extension [Self <: GetSecurityConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityConfigurations(value: SecurityConfigurationList): Self = StObject.set(x, "SecurityConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationsUndefined: Self = StObject.set(x, "SecurityConfigurations", js.undefined)
    
    inline def setSecurityConfigurationsVarargs(value: SecurityConfiguration*): Self = StObject.set(x, "SecurityConfigurations", js.Array(value :_*))
  }
}
