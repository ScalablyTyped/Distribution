package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the cluster parameter group.
    */
  var DBClusterParameterGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the name of the cluster parameter group.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the name of the parameter group family that this cluster parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides the customer-specified description for this cluster parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}

object DBClusterParameterGroup {
  @scala.inline
  def apply(): DBClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroup]
  }
  @scala.inline
  implicit class DBClusterParameterGroupOps[Self <: DBClusterParameterGroup] (val x: Self) extends AnyVal {
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
    def setDBClusterParameterGroupArn(value: String): Self = this.set("DBClusterParameterGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroupArn: Self = this.set("DBClusterParameterGroupArn", js.undefined)
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = this.set("DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroupName: Self = this.set("DBClusterParameterGroupName", js.undefined)
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = this.set("DBParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupFamily: Self = this.set("DBParameterGroupFamily", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

