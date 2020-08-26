package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group to delete.
    */
  var ParameterGroupName: String = js.native
}

object DeleteParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String): DeleteParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameterGroupRequest]
  }
  @scala.inline
  implicit class DeleteParameterGroupRequestOps[Self <: DeleteParameterGroupRequest] (val x: Self) extends AnyVal {
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
  }
  
}

