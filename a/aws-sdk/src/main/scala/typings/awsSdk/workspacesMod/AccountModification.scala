package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountModification extends js.Object {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  
  /**
    * The status of BYOL (whether BYOL is being enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.native
  
  /**
    * The error code that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  
  /**
    * The text of the error message that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  
  /**
    * The state of the modification to the configuration of BYOL.
    */
  var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.native
  
  /**
    * The timestamp when the modification of the BYOL configuration was started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}
object AccountModification {
  
  @scala.inline
  def apply(): AccountModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountModification]
  }
  
  @scala.inline
  implicit class AccountModificationOps[Self <: AccountModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = this.set("DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedicatedTenancyManagementCidrRange: Self = this.set("DedicatedTenancyManagementCidrRange", js.undefined)
    
    @scala.inline
    def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = this.set("DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedicatedTenancySupport: Self = this.set("DedicatedTenancySupport", js.undefined)
    
    @scala.inline
    def setErrorCode(value: WorkspaceErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setModificationState(value: DedicatedTenancyModificationStateEnum): Self = this.set("ModificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModificationState: Self = this.set("ModificationState", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
