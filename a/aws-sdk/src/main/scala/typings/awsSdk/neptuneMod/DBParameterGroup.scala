package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB parameter group.
    */
  var DBParameterGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the customer-specified description for this DB parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}

object DBParameterGroup {
  @scala.inline
  def apply(): DBParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroup]
  }
  @scala.inline
  implicit class DBParameterGroupOps[Self <: DBParameterGroup] (val x: Self) extends AnyVal {
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
    def setDBParameterGroupArn(value: String): Self = this.set("DBParameterGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupArn: Self = this.set("DBParameterGroupArn", js.undefined)
    @scala.inline
    def setDBParameterGroupFamily(value: String): Self = this.set("DBParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupFamily: Self = this.set("DBParameterGroupFamily", js.undefined)
    @scala.inline
    def setDBParameterGroupName(value: String): Self = this.set("DBParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBParameterGroupName: Self = this.set("DBParameterGroupName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

