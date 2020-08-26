package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParameterGroupResponse extends js.Object {
  /**
    * The parameter group that has been modified.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.daxMod.ParameterGroup] = js.native
}

object UpdateParameterGroupResponse {
  @scala.inline
  def apply(): UpdateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParameterGroupResponse]
  }
  @scala.inline
  implicit class UpdateParameterGroupResponseOps[Self <: UpdateParameterGroupResponse] (val x: Self) extends AnyVal {
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
    def setParameterGroup(value: ParameterGroup): Self = this.set("ParameterGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroup: Self = this.set("ParameterGroup", js.undefined)
  }
  
}

