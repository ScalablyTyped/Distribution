package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMemberDetectorsRequest extends StObject {
  
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
  implicit class UpdateMemberDetectorsRequestMutableBuilder[Self <: UpdateMemberDetectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
