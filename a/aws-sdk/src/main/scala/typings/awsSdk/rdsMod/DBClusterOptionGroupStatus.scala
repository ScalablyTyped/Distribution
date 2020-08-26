package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterOptionGroupStatus extends js.Object {
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterOptionGroupStatus {
  @scala.inline
  def apply(): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
  @scala.inline
  implicit class DBClusterOptionGroupStatusOps[Self <: DBClusterOptionGroupStatus] (val x: Self) extends AnyVal {
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
    def setDBClusterOptionGroupName(value: String): Self = this.set("DBClusterOptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterOptionGroupName: Self = this.set("DBClusterOptionGroupName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

