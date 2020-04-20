package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateActivityTypeInput extends js.Object {
  /**
    * The activity type to deprecate.
    */
  var activityType: ActivityType = js.native
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName = js.native
}

object DeprecateActivityTypeInput {
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateActivityTypeInput]
  }
}

