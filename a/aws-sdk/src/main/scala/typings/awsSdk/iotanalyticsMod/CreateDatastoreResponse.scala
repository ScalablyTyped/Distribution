package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatastoreResponse extends js.Object {
  /**
    * The ARN of the data store.
    */
  var datastoreArn: js.UndefOr[DatastoreArn] = js.native
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateDatastoreResponse {
  @scala.inline
  def apply(
    datastoreArn: DatastoreArn = null,
    datastoreName: DatastoreName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    if (datastoreArn != null) __obj.updateDynamic("datastoreArn")(datastoreArn.asInstanceOf[js.Any])
    if (datastoreName != null) __obj.updateDynamic("datastoreName")(datastoreName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatastoreResponse]
  }
}

