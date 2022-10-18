package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpersonationRole extends StObject {
  
  /**
    * The date when the impersonation role was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the impersonation role was last modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the impersonation role.
    */
  var ImpersonationRoleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ImpersonationRoleId] = js.undefined
  
  /**
    * The impersonation role name.
    */
  var Name: js.UndefOr[ImpersonationRoleName] = js.undefined
  
  /**
    * The impersonation role type.
    */
  var Type: js.UndefOr[ImpersonationRoleType] = js.undefined
}
object ImpersonationRole {
  
  inline def apply(): ImpersonationRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpersonationRole]
  }
  
  extension [Self <: ImpersonationRole](x: Self) {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRoleIdUndefined: Self = StObject.set(x, "ImpersonationRoleId", js.undefined)
    
    inline def setName(value: ImpersonationRoleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ImpersonationRoleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
