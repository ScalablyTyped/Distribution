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
  
  @scala.inline
  def apply(): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
  
  @scala.inline
  implicit class GetSecurityConfigurationsResponseMutableBuilder[Self <: GetSecurityConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecurityConfigurations(value: SecurityConfigurationList): Self = StObject.set(x, "SecurityConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationsUndefined: Self = StObject.set(x, "SecurityConfigurations", js.undefined)
    
    @scala.inline
    def setSecurityConfigurationsVarargs(value: SecurityConfiguration*): Self = StObject.set(x, "SecurityConfigurations", js.Array(value :_*))
  }
}
