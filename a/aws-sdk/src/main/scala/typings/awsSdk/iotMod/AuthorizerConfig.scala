package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizerConfig extends StObject {
  
  /**
    * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
    */
  var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.undefined
  
  /**
    * The name of the authorization service for a domain configuration.
    */
  var defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.undefined
}
object AuthorizerConfig {
  
  inline def apply(): AuthorizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerConfig]
  }
  
  extension [Self <: AuthorizerConfig](x: Self) {
    
    inline def setAllowAuthorizerOverride(value: AllowAuthorizerOverride): Self = StObject.set(x, "allowAuthorizerOverride", value.asInstanceOf[js.Any])
    
    inline def setAllowAuthorizerOverrideUndefined: Self = StObject.set(x, "allowAuthorizerOverride", js.undefined)
    
    inline def setDefaultAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "defaultAuthorizerName", value.asInstanceOf[js.Any])
    
    inline def setDefaultAuthorizerNameUndefined: Self = StObject.set(x, "defaultAuthorizerName", js.undefined)
  }
}
