package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatastoreRequest extends StObject {
  
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName
  
  /**
    * Where data store data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default isserviceManagedS3. You cannot change this storage option after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store. The retention period cannot be updated if the data store's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}
object UpdateDatastoreRequest {
  
  inline def apply(datastoreName: DatastoreName): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
  
  extension [Self <: UpdateDatastoreRequest](x: Self) {
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorage(value: DatastoreStorage): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
  }
}
