package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizerConfig extends StObject {
  
  /**
    * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
    */
  var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.native
  
  /**
    * The name of the authorization service for a domain configuration.
    */
  var defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.native
}
object AuthorizerConfig {
  
  @scala.inline
  def apply(): AuthorizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerConfig]
  }
  
  @scala.inline
  implicit class AuthorizerConfigMutableBuilder[Self <: AuthorizerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAuthorizerOverride(value: AllowAuthorizerOverride): Self = StObject.set(x, "allowAuthorizerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAuthorizerOverrideUndefined: Self = StObject.set(x, "allowAuthorizerOverride", js.undefined)
    
    @scala.inline
    def setDefaultAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "defaultAuthorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAuthorizerNameUndefined: Self = StObject.set(x, "defaultAuthorizerName", js.undefined)
  }
}
