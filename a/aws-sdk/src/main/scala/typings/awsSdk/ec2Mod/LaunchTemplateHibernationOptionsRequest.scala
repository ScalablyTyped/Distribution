package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateHibernationOptionsRequest extends js.Object {
  /**
    * If you set this parameter to true, the instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object LaunchTemplateHibernationOptionsRequest {
  @scala.inline
  def apply(Configured: js.UndefOr[Boolean] = js.undefined): LaunchTemplateHibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptionsRequest]
  }
}

