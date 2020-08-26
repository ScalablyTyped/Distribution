package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricPolicyRule extends js.Object {
  /**
    * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
    */
  var ObjectGroup: typings.awsSdk.mediastoreMod.ObjectGroup = js.native
  /**
    * A name that allows you to refer to the object group.
    */
  var ObjectGroupName: typings.awsSdk.mediastoreMod.ObjectGroupName = js.native
}

object MetricPolicyRule {
  @scala.inline
  def apply(ObjectGroup: ObjectGroup, ObjectGroupName: ObjectGroupName): MetricPolicyRule = {
    val __obj = js.Dynamic.literal(ObjectGroup = ObjectGroup.asInstanceOf[js.Any], ObjectGroupName = ObjectGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicyRule]
  }
  @scala.inline
  implicit class MetricPolicyRuleOps[Self <: MetricPolicyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectGroup(value: ObjectGroup): Self = this.set("ObjectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectGroupName(value: ObjectGroupName): Self = this.set("ObjectGroupName", value.asInstanceOf[js.Any])
  }
  
}

