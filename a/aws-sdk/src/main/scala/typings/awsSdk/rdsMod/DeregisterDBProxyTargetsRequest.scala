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
  def apply(
    DBProxyName: String,
    DBClusterIdentifiers: StringList = null,
    DBInstanceIdentifiers: StringList = null,
    TargetGroupName: String = null
  ): DeregisterDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    if (DBClusterIdentifiers != null) __obj.updateDynamic("DBClusterIdentifiers")(DBClusterIdentifiers.asInstanceOf[js.Any])
    if (DBInstanceIdentifiers != null) __obj.updateDynamic("DBInstanceIdentifiers")(DBInstanceIdentifiers.asInstanceOf[js.Any])
    if (TargetGroupName != null) __obj.updateDynamic("TargetGroupName")(TargetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDBProxyTargetsRequest]
  }
}

