package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreSummary extends StObject {
  
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.undefined
  
  /**
    * Where data store data is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.undefined
  
  /**
    * The last time when a new message arrived in the data store. AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the lastMessageArrivalTime value is an approximation. This feature only applies to messages that arrived in the data store after October 23, 2020. 
    */
  var lastMessageArrivalTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.undefined
}
object DatastoreSummary {
  
  inline def apply(): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreSummary]
  }
  
  extension [Self <: DatastoreSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "datastoreName", js.undefined)
    
    inline def setDatastoreStorage(value: DatastoreStorageSummary): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    inline def setLastMessageArrivalTime(value: Timestamp): Self = StObject.set(x, "lastMessageArrivalTime", value.asInstanceOf[js.Any])
    
    inline def setLastMessageArrivalTimeUndefined: Self = StObject.set(x, "lastMessageArrivalTime", js.undefined)
    
    inline def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStatus(value: DatastoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
