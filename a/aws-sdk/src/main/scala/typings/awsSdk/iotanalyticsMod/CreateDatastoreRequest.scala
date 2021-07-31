package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatastoreRequest extends StObject {
  
  /**
    * The name of the data store.
    */
  var datastoreName: DatastoreName
  
  /**
    * Where data store data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You cannot change this storage option after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.undefined
  
  /**
    * How long, in days, message data is kept for the data store. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * Metadata which can be used to manage the data store.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateDatastoreRequest {
  
  @scala.inline
  def apply(datastoreName: DatastoreName): CreateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatastoreRequest]
  }
  
  @scala.inline
  implicit class CreateDatastoreRequestMutableBuilder[Self <: CreateDatastoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreStorage(value: DatastoreStorage): Self = StObject.set(x, "datastoreStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreStorageUndefined: Self = StObject.set(x, "datastoreStorage", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
