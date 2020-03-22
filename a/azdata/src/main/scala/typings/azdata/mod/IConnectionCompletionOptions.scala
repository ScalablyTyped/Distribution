package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionCompletionOptions extends js.Object {
  /**
  		 * Save the connection to MRU and settings (only save to setting if profile.saveProfile is set to true)
  		 * Default is true.
  		 */
  var saveConnection: Boolean
  /**
  		 * If undefined / true, open the connection dialog if connection fails.
  		 * If false, connection dialog won't be opened even if connection fails.
  		 * Default is true.
  		 */
  var showConnectionDialogOnError: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If true, open the dashboard after connection is complete.
  		 * If undefined / false, dashboard won't be opened after connection completes.
  		 * Default is false.
  		 */
  var showDashboard: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If undefined / true, open the connection firewall rule dialog if connection fails.
  		 * If false, connection firewall rule dialog won't be opened even if connection fails.
  		 * Default is true.
  		 */
  var showFirewallRuleOnError: js.UndefOr[Boolean] = js.undefined
}

object IConnectionCompletionOptions {
  @scala.inline
  def apply(
    saveConnection: Boolean,
    showConnectionDialogOnError: js.UndefOr[Boolean] = js.undefined,
    showDashboard: js.UndefOr[Boolean] = js.undefined,
    showFirewallRuleOnError: js.UndefOr[Boolean] = js.undefined
  ): IConnectionCompletionOptions = {
    val __obj = js.Dynamic.literal(saveConnection = saveConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectionDialogOnError)) __obj.updateDynamic("showConnectionDialogOnError")(showConnectionDialogOnError.asInstanceOf[js.Any])
    if (!js.isUndefined(showDashboard)) __obj.updateDynamic("showDashboard")(showDashboard.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirewallRuleOnError)) __obj.updateDynamic("showFirewallRuleOnError")(showFirewallRuleOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCompletionOptions]
  }
}

