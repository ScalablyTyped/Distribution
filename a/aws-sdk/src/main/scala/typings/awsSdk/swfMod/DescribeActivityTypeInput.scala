package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivityTypeInput extends js.Object {
  /**
    * The activity type to get information about. Activity types are identified by the name and version that were supplied when the activity was registered.
    */
  var activityType: ActivityType = js.native
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName = js.native
}

object DescribeActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DescribeActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivityTypeInput]
  }
  @scala.inline
  implicit class DescribeActivityTypeInputOps[Self <: DescribeActivityTypeInput] (val x: Self) extends AnyVal {
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
    def setActivityType(value: ActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
  }
  
}

