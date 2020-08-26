package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParameterGroupRequest extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group to apply to all of the clusters in this replication group.
    */
  var ParameterGroupName: String = js.native
}

object CreateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String): CreateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupRequest]
  }
  @scala.inline
  implicit class CreateParameterGroupRequestOps[Self <: CreateParameterGroupRequest] (val x: Self) extends AnyVal {
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
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

