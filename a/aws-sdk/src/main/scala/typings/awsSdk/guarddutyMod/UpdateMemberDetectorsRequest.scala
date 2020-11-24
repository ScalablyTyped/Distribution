package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMemberDetectorsRequest extends js.Object {
  
  /**
    * A list of member account IDs to be updated.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  
  /**
    * An object describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.native
  
  /**
    * The detector ID of the master account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object UpdateMemberDetectorsRequest {
  
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): UpdateMemberDetectorsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberDetectorsRequest]
  }
  
  @scala.inline
  implicit class UpdateMemberDetectorsRequestOps[Self <: UpdateMemberDetectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurations): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
  }
}
