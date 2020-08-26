package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxyTargetGroup extends js.Object {
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo] = js.native
  /**
    * The date and time when the target group was first created.
    */
  var CreatedDate: js.UndefOr[TStamp] = js.native
  /**
    * The identifier for the RDS proxy associated with this target group.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  /**
    * Whether this target group is the first one used for connection requests by the associated proxy. Because each proxy is currently associated with a single target group, currently this setting is always true.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The current status of this target group. A status of available means the target group is correctly associated with a database. Other values indicate that you must wait for the target group to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  var TargetGroupArn: js.UndefOr[String] = js.native
  /**
    * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in the specified AWS Region.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
  /**
    * The date and time when the target group was last updated.
    */
  var UpdatedDate: js.UndefOr[TStamp] = js.native
}

object DBProxyTargetGroup {
  @scala.inline
  def apply(): DBProxyTargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTargetGroup]
  }
  @scala.inline
  implicit class DBProxyTargetGroupOps[Self <: DBProxyTargetGroup] (val x: Self) extends AnyVal {
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
    def setConnectionPoolConfig(value: ConnectionPoolConfigurationInfo): Self = this.set("ConnectionPoolConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionPoolConfig: Self = this.set("ConnectionPoolConfig", js.undefined)
    @scala.inline
    def setCreatedDate(value: TStamp): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBProxyName: Self = this.set("DBProxyName", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTargetGroupArn(value: String): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("TargetGroupArn", js.undefined)
    @scala.inline
    def setTargetGroupName(value: String): Self = this.set("TargetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupName: Self = this.set("TargetGroupName", js.undefined)
    @scala.inline
    def setUpdatedDate(value: TStamp): Self = this.set("UpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedDate: Self = this.set("UpdatedDate", js.undefined)
  }
  
}

