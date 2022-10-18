package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountModification extends StObject {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.DedicatedTenancyManagementCidrRange] = js.undefined
  
  /**
    * The status of BYOL (whether BYOL is being enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
  
  /**
    * The error code that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
  
  /**
    * The text of the error message that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * The state of the modification to the configuration of BYOL.
    */
  var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined
  
  /**
    * The timestamp when the modification of the BYOL configuration was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object AccountModification {
  
  inline def apply(): AccountModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountModification]
  }
  
  extension [Self <: AccountModification](x: Self) {
    
    inline def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    inline def setDedicatedTenancyManagementCidrRangeUndefined: Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", js.undefined)
    
    inline def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = StObject.set(x, "DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    inline def setDedicatedTenancySupportUndefined: Self = StObject.set(x, "DedicatedTenancySupport", js.undefined)
    
    inline def setErrorCode(value: WorkspaceErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setModificationState(value: DedicatedTenancyModificationStateEnum): Self = StObject.set(x, "ModificationState", value.asInstanceOf[js.Any])
    
    inline def setModificationStateUndefined: Self = StObject.set(x, "ModificationState", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
