package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * The filter expression defining the parameters to include traces.
    */
  var FilterExpression: js.UndefOr[String] = js.native
  /**
    * The ARN of the group generated based on the GroupName.
    */
  var GroupARN: js.UndefOr[String] = js.native
  /**
    * The unique case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[String] = js.native
}

object Group {
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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
    def setFilterExpression(value: String): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    @scala.inline
    def setGroupARN(value: String): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
  
}

