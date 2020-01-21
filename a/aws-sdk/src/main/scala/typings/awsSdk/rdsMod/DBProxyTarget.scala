package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxyTarget extends js.Object {
  /**
    * The writer endpoint for the RDS DB instance or Aurora DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster identifier for an Aurora DB cluster.
    */
  var RdsResourceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
    */
  var TargetArn: js.UndefOr[String] = js.native
  /**
    * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target represents an RDS DB instance.
    */
  var TrackedClusterId: js.UndefOr[String] = js.native
  /**
    * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
    */
  var Type: js.UndefOr[TargetType] = js.native
}

object DBProxyTarget {
  @scala.inline
  def apply(
    Endpoint: String = null,
    Port: Int | scala.Double = null,
    RdsResourceId: String = null,
    TargetArn: String = null,
    TrackedClusterId: String = null,
    Type: TargetType = null
  ): DBProxyTarget = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (RdsResourceId != null) __obj.updateDynamic("RdsResourceId")(RdsResourceId.asInstanceOf[js.Any])
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn.asInstanceOf[js.Any])
    if (TrackedClusterId != null) __obj.updateDynamic("TrackedClusterId")(TrackedClusterId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBProxyTarget]
  }
}

