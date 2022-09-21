package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordsResponse extends StObject {
  
  /**
    * Total number of records.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * A boolean value specifying whether to delete the dataset locally.
    */
  var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the dataset exists.
    */
  var DatasetExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Server sync count for this dataset.
    */
  var DatasetSyncCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Names of merged datasets.
    */
  var MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all records.
    */
  var Records: js.UndefOr[RecordList] = js.undefined
  
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[String] = js.undefined
}
object ListRecordsResponse {
  
  inline def apply(): ListRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordsResponse]
  }
  
  extension [Self <: ListRecordsResponse](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDatasetDeletedAfterRequestedSyncCount(value: Boolean): Self = StObject.set(x, "DatasetDeletedAfterRequestedSyncCount", value.asInstanceOf[js.Any])
    
    inline def setDatasetDeletedAfterRequestedSyncCountUndefined: Self = StObject.set(x, "DatasetDeletedAfterRequestedSyncCount", js.undefined)
    
    inline def setDatasetExists(value: Boolean): Self = StObject.set(x, "DatasetExists", value.asInstanceOf[js.Any])
    
    inline def setDatasetExistsUndefined: Self = StObject.set(x, "DatasetExists", js.undefined)
    
    inline def setDatasetSyncCount(value: Long): Self = StObject.set(x, "DatasetSyncCount", value.asInstanceOf[js.Any])
    
    inline def setDatasetSyncCountUndefined: Self = StObject.set(x, "DatasetSyncCount", js.undefined)
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setMergedDatasetNames(value: MergedDatasetNameList): Self = StObject.set(x, "MergedDatasetNames", value.asInstanceOf[js.Any])
    
    inline def setMergedDatasetNamesUndefined: Self = StObject.set(x, "MergedDatasetNames", js.undefined)
    
    inline def setMergedDatasetNamesVarargs(value: String*): Self = StObject.set(x, "MergedDatasetNames", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
    
    inline def setSyncSessionToken(value: String): Self = StObject.set(x, "SyncSessionToken", value.asInstanceOf[js.Any])
    
    inline def setSyncSessionTokenUndefined: Self = StObject.set(x, "SyncSessionToken", js.undefined)
  }
}
