package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointServicePermissionsResult extends StObject {
  
  /**
    * Information about the added principals.
    */
  var AddedPrincipals: js.UndefOr[AddedPrincipalSet] = js.undefined
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object ModifyVpcEndpointServicePermissionsResult {
  
  inline def apply(): ModifyVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsResult]
  }
  
  extension [Self <: ModifyVpcEndpointServicePermissionsResult](x: Self) {
    
    inline def setAddedPrincipals(value: AddedPrincipalSet): Self = StObject.set(x, "AddedPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAddedPrincipalsUndefined: Self = StObject.set(x, "AddedPrincipals", js.undefined)
    
    inline def setAddedPrincipalsVarargs(value: AddedPrincipal*): Self = StObject.set(x, "AddedPrincipals", js.Array(value*))
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
