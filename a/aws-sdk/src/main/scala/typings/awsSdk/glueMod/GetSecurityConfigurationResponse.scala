package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityConfigurationResponse extends StObject {
  
  /**
    * The requested security configuration.
    */
  var SecurityConfiguration: js.UndefOr[typings.awsSdk.glueMod.SecurityConfiguration] = js.native
}
object GetSecurityConfigurationResponse {
  
  @scala.inline
  def apply(): GetSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetSecurityConfigurationResponseMutableBuilder[Self <: GetSecurityConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityConfiguration(value: SecurityConfiguration): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
  }
}
