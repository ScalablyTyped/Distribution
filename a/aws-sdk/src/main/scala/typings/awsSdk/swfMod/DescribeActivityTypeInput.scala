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
}

