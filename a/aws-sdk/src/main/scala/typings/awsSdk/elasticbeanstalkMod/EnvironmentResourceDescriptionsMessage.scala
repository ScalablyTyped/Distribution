package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResourceDescriptionsMessage extends js.Object {
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.native
}

object EnvironmentResourceDescriptionsMessage {
  @scala.inline
  def apply(EnvironmentResources: EnvironmentResourceDescription = null): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentResources != null) __obj.updateDynamic("EnvironmentResources")(EnvironmentResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
}

