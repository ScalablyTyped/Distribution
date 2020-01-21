package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The identifier of the endpoint. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * The error message when the connection last failed.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The connection status.
    */
  var Status: js.UndefOr[String] = js.native
}

object Connection {
  @scala.inline
  def apply(
    EndpointArn: String = null,
    EndpointIdentifier: String = null,
    LastFailureMessage: String = null,
    ReplicationInstanceArn: String = null,
    ReplicationInstanceIdentifier: String = null,
    Status: String = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    if (EndpointIdentifier != null) __obj.updateDynamic("EndpointIdentifier")(EndpointIdentifier.asInstanceOf[js.Any])
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage.asInstanceOf[js.Any])
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn.asInstanceOf[js.Any])
    if (ReplicationInstanceIdentifier != null) __obj.updateDynamic("ReplicationInstanceIdentifier")(ReplicationInstanceIdentifier.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

