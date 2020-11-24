package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trust extends js.Object {
  
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.native
  
  /**
    * The Directory ID of the AWS directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
  
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.StateLastUpdatedDateTime] = js.native
  
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustDirection] = js.native
  
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
  
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustState] = js.native
  
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustStateReason] = js.native
  
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustType] = js.native
}
object Trust {
  
  @scala.inline
  def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  
  @scala.inline
  implicit class TrustOps[Self <: Trust] (val x: Self) extends AnyVal {
    
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
    def setCreatedDateTime(value: CreatedDateTime): Self = this.set("CreatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("CreatedDateTime", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("LastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setRemoteDomainName(value: RemoteDomainName): Self = this.set("RemoteDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteDomainName: Self = this.set("RemoteDomainName", js.undefined)
    
    @scala.inline
    def setSelectiveAuth(value: SelectiveAuth): Self = this.set("SelectiveAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectiveAuth: Self = this.set("SelectiveAuth", js.undefined)
    
    @scala.inline
    def setStateLastUpdatedDateTime(value: StateLastUpdatedDateTime): Self = this.set("StateLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateLastUpdatedDateTime: Self = this.set("StateLastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setTrustDirection(value: TrustDirection): Self = this.set("TrustDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustDirection: Self = this.set("TrustDirection", js.undefined)
    
    @scala.inline
    def setTrustId(value: TrustId): Self = this.set("TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustId: Self = this.set("TrustId", js.undefined)
    
    @scala.inline
    def setTrustState(value: TrustState): Self = this.set("TrustState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustState: Self = this.set("TrustState", js.undefined)
    
    @scala.inline
    def setTrustStateReason(value: TrustStateReason): Self = this.set("TrustStateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustStateReason: Self = this.set("TrustStateReason", js.undefined)
    
    @scala.inline
    def setTrustType(value: TrustType): Self = this.set("TrustType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustType: Self = this.set("TrustType", js.undefined)
  }
}
