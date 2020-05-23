package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateHibernationOptions extends js.Object {
  /**
    * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object LaunchTemplateHibernationOptions {
  @scala.inline
  def apply(Configured: js.UndefOr[Boolean] = js.undefined): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
}

