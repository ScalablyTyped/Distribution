package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterDBProxyTargetsRequest extends js.Object {
  /**
    * One or more DB cluster identifiers.
    */
  var DBClusterIdentifiers: js.UndefOr[StringList] = js.native
  /**
    * One or more DB instance identifiers.
    */
  var DBInstanceIdentifiers: js.UndefOr[StringList] = js.native
  /**
    * The identifier of the DBProxy that is associated with the DBProxyTargetGroup.
    */
  var DBProxyName: String = js.native
  /**
    * The identifier of the DBProxyTargetGroup.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
}

object DeregisterDBProxyTargetsRequest {
  @scala.inline
  def apply(DBProxyName: String): DeregisterDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDBProxyTargetsRequest]
  }
  @scala.inline
  implicit class DeregisterDBProxyTargetsRequestOps[Self <: DeregisterDBProxyTargetsRequest] (val x: Self) extends AnyVal {
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
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBClusterIdentifiersVarargs(value: String*): Self = this.set("DBClusterIdentifiers", js.Array(value :_*))
    @scala.inline
    def setDBClusterIdentifiers(value: StringList): Self = this.set("DBClusterIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifiers: Self = this.set("DBClusterIdentifiers", js.undefined)
    @scala.inline
    def setDBInstanceIdentifiersVarargs(value: String*): Self = this.set("DBInstanceIdentifiers", js.Array(value :_*))
    @scala.inline
    def setDBInstanceIdentifiers(value: StringList): Self = this.set("DBInstanceIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifiers: Self = this.set("DBInstanceIdentifiers", js.undefined)
    @scala.inline
    def setTargetGroupName(value: String): Self = this.set("TargetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupName: Self = this.set("TargetGroupName", js.undefined)
  }
  
}

