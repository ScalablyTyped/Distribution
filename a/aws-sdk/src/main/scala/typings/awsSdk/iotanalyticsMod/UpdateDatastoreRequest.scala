package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatastoreRequest extends js.Object {
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.native
  /**
    * How long, in days, message data is kept for the data store. The retention period cannot be updated if the data store's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object UpdateDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
  @scala.inline
  implicit class UpdateDatastoreRequestOps[Self <: UpdateDatastoreRequest] (val x: Self) extends AnyVal {
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
  }
  
}

