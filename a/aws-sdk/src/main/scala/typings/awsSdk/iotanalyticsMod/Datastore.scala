package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datastore extends StObject {
  
  /**
    * The ARN of the data store.
    */
  var arn: js.UndefOr[DatastoreArn] = js.native
  
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time when a new message arrived in the data store. AWS IoT Analytics updates this value at most once per minute for one data store. Hence, the lastMessageArrivalTime value is an approximation. This feature only applies to messages that arrived in the data store after October 23, 2020. 
    */
  var lastMessageArrivalTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the data store.
    */
  var name: js.UndefOr[DatastoreName] = js.native
  
  /**
    * How long, in days, message data is kept for the data store. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  
  /**
    * The status of a data store:  CREATING  The data store is being created.  ACTIVE  The data store has been created and can be used.  DELETING  The data store is being deleted.  
    */
  var status: js.UndefOr[DatastoreStatus] = js.native
  
  /**
    * Where data store data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You cannot change this storage option after the data store is created.
    */
  var storage: js.UndefOr[DatastoreStorage] = js.native
}
object Datastore {
  
  @scala.inline
  def apply(): Datastore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datastore]
  }
  
  @scala.inline
  implicit class DatastoreMutableBuilder[Self <: Datastore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: DatastoreArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastMessageArrivalTime(value: Timestamp): Self = StObject.set(x, "lastMessageArrivalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageArrivalTimeUndefined: Self = StObject.set(x, "lastMessageArrivalTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: DatastoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    @scala.inline
    def setStatus(value: DatastoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStorage(value: DatastoreStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
