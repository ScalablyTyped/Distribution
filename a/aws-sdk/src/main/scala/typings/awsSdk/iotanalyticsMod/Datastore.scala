package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore extends js.Object {
  /**
    * The ARN of the data store.
    */
  var arn: js.UndefOr[DatastoreArn] = js.native
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the data store.
    */
  var name: js.UndefOr[DatastoreName] = js.native
  /**
    * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * The status of a data store:  CREATING  The data store is being created.  ACTIVE  The data store has been created and can be used.  DELETING  The data store is being deleted.  
    */
  var status: js.UndefOr[DatastoreStatus] = js.native
  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
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
  implicit class DatastoreOps[Self <: Datastore] (val x: Self) extends AnyVal {
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
    def setArn(value: DatastoreArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setName(value: DatastoreName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
    @scala.inline
    def setStatus(value: DatastoreStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStorage(value: DatastoreStorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

