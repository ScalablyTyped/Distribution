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
}

