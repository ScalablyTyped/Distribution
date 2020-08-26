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
  def apply(): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
  @scala.inline
  implicit class RefreshSchemasStatusOps[Self <: RefreshSchemasStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
    @scala.inline
    def setLastFailureMessage(value: String): Self = this.set("LastFailureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFailureMessage: Self = this.set("LastFailureMessage", js.undefined)
    @scala.inline
    def setLastRefreshDate(value: TStamp): Self = this.set("LastRefreshDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRefreshDate: Self = this.set("LastRefreshDate", js.undefined)
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("ReplicationInstanceArn", js.undefined)
    @scala.inline
    def setStatus(value: RefreshSchemasStatusTypeValue): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

