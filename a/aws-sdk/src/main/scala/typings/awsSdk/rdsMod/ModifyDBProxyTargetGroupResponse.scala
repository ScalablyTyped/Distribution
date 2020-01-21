package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyTargetGroupResponse extends js.Object {
  /**
    * The settings of the modified DBProxyTarget.
    */
  var DBProxyTargetGroup: js.UndefOr[typings.awsSdk.rdsMod.DBProxyTargetGroup] = js.native
}

object ModifyDBProxyTargetGroupResponse {
  @scala.inline
  def apply(DBProxyTargetGroup: DBProxyTargetGroup = null): ModifyDBProxyTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxyTargetGroup != null) __obj.updateDynamic("DBProxyTargetGroup")(DBProxyTargetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyTargetGroupResponse]
  }
}

