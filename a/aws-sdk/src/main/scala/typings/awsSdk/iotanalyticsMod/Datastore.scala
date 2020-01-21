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
  def apply(
    arn: DatastoreArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: DatastoreName = null,
    retentionPeriod: RetentionPeriod = null,
    status: DatastoreStatus = null,
    storage: DatastoreStorage = null
  ): Datastore = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datastore]
  }
}

