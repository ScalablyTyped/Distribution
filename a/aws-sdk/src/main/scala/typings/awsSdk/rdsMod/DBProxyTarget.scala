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
    * Information about the connection health of the RDS Proxy target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.rdsMod.TargetHealth] = js.native
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
  def apply(): DBProxyTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTarget]
  }
  @scala.inline
  implicit class DBProxyTargetOps[Self <: DBProxyTarget] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setRdsResourceId(value: String): Self = this.set("RdsResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRdsResourceId: Self = this.set("RdsResourceId", js.undefined)
    @scala.inline
    def setTargetArn(value: String): Self = this.set("TargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("TargetArn", js.undefined)
    @scala.inline
    def setTargetHealth(value: TargetHealth): Self = this.set("TargetHealth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHealth: Self = this.set("TargetHealth", js.undefined)
    @scala.inline
    def setTrackedClusterId(value: String): Self = this.set("TrackedClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackedClusterId: Self = this.set("TrackedClusterId", js.undefined)
    @scala.inline
    def setType(value: TargetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

