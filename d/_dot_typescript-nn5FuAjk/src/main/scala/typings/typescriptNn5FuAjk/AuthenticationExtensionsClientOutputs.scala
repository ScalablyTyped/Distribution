package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsClientOutputs extends StObject {
  
  var appid: js.UndefOr[scala.Boolean] = js.undefined
  
  var credProps: js.UndefOr[CredentialPropertiesOutput] = js.undefined
  
  var uvm: js.UndefOr[UvmEntries] = js.undefined
}
object AuthenticationExtensionsClientOutputs {
  
  inline def apply(): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
  
  extension [Self <: AuthenticationExtensionsClientOutputs](x: Self) {
    
    inline def setAppid(value: scala.Boolean): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setCredProps(value: CredentialPropertiesOutput): Self = StObject.set(x, "credProps", value.asInstanceOf[js.Any])
    
    inline def setCredPropsUndefined: Self = StObject.set(x, "credProps", js.undefined)
    
    inline def setUvm(value: UvmEntries): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    inline def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
  }
}
