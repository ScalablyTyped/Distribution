package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshSchemasStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The last failure message for the schema.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The date the schema was last refreshed.
    */
  var LastRefreshDate: js.UndefOr[TStamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.native
}

object RefreshSchemasStatus {
  @scala.inline
  def apply(
    EndpointArn: String = null,
    LastFailureMessage: String = null,
    LastRefreshDate: TStamp = null,
    ReplicationInstanceArn: String = null,
    Status: RefreshSchemasStatusTypeValue = null
  ): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage.asInstanceOf[js.Any])
    if (LastRefreshDate != null) __obj.updateDynamic("LastRefreshDate")(LastRefreshDate.asInstanceOf[js.Any])
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
}

