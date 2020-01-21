package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionConfiguration extends js.Object {
  /**
    * The configuration data for the action.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
}

object ActionConfiguration {
  @scala.inline
  def apply(configuration: ActionConfigurationMap = null): ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
}

