package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateIdentityProviderConfigResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.undefined
}
object DisassociateIdentityProviderConfigResponse {
  
  inline def apply(): DisassociateIdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateIdentityProviderConfigResponse]
  }
  
  extension [Self <: DisassociateIdentityProviderConfigResponse](x: Self) {
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
