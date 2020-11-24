package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatastoreRequest extends js.Object {
  
  /**
    * The name of the data store.
    */
  var datastoreName: DatastoreName = js.native
  
  /**
    * Where data store data is stored. You can choose one of serviceManagedS3 or customerManagedS3 storage. If not specified, the default is serviceManagedS3. You cannot change this storage option after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.native
  
  /**
    * How long, in days, message data is kept for the data store. When customerManagedS3 storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  
  /**
    * Metadata which can be used to manage the data store.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateDatastoreRequest {
  
  @scala.inline
  def apply(datastoreName: DatastoreName): CreateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatastoreRequest]
  }
  
  @scala.inline
  implicit class CreateDatastoreRequestOps[Self <: CreateDatastoreRequest] (val x: Self) extends AnyVal {
    
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
    def setDatastoreName(value: DatastoreName): Self = this.set("datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreStorage(value: DatastoreStorage): Self = this.set("datastoreStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreStorage: Self = this.set("datastoreStorage", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
