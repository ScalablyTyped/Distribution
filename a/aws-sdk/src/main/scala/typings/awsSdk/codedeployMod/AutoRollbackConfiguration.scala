package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRollbackConfiguration extends js.Object {
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The event type or types that trigger a rollback.
    */
  var events: js.UndefOr[AutoRollbackEventsList] = js.native
}

object AutoRollbackConfiguration {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, events: AutoRollbackEventsList = null): AutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRollbackConfiguration]
  }
}

