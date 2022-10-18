package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImpersonationRoleResponse extends StObject {
  
  /**
    * The new impersonation role ID.
    */
  var ImpersonationRoleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId] = js.undefined
}
object CreateImpersonationRoleResponse {
  
  inline def apply(): CreateImpersonationRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImpersonationRoleResponse]
  }
  
  extension [Self <: CreateImpersonationRoleResponse](x: Self) {
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleIdUndefined: Self = StObject.set(x, "ImpersonationRoleId", js.undefined)
  }
}
