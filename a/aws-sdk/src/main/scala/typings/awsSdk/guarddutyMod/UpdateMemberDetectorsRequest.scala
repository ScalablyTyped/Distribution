package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMemberDetectorsRequest extends StObject {
  
  /**
    * A list of member account IDs to be updated.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds
  
  /**
    * Describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined
  
  /**
    * The detector ID of the administrator account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object UpdateMemberDetectorsRequest {
  
  inline def apply(AccountIds: AccountIds, DetectorId: DetectorId): UpdateMemberDetectorsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberDetectorsRequest]
  }
  
  extension [Self <: UpdateMemberDetectorsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setDataSources(value: DataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
