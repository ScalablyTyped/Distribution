package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group. Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
}

object DBClusterParameterGroupNameMessage {
  @scala.inline
  def apply(): DBClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
  }
  @scala.inline
  implicit class DBClusterParameterGroupNameMessageOps[Self <: DBClusterParameterGroupNameMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterParameterGroupName(value: String): Self = this.set("DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroupName: Self = this.set("DBClusterParameterGroupName", js.undefined)
  }
  
}

