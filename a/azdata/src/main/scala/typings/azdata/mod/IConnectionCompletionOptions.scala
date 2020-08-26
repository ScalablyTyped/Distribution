package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionCompletionOptions extends js.Object {
  /**
    * Save the connection to MRU and settings (only save to setting if profile.saveProfile is set to true)
    * Default is true.
    */
  var saveConnection: Boolean = js.native
  /**
    * If undefined / true, open the connection dialog if connection fails.
    * If false, connection dialog won't be opened even if connection fails.
    * Default is true.
    */
  var showConnectionDialogOnError: js.UndefOr[Boolean] = js.native
  /**
    * If true, open the dashboard after connection is complete.
    * If undefined / false, dashboard won't be opened after connection completes.
    * Default is false.
    */
  var showDashboard: js.UndefOr[Boolean] = js.native
  /**
    * If undefined / true, open the connection firewall rule dialog if connection fails.
    * If false, connection firewall rule dialog won't be opened even if connection fails.
    * Default is true.
    */
  var showFirewallRuleOnError: js.UndefOr[Boolean] = js.native
}

object IConnectionCompletionOptions {
  @scala.inline
  def apply(saveConnection: Boolean): IConnectionCompletionOptions = {
    val __obj = js.Dynamic.literal(saveConnection = saveConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCompletionOptions]
  }
  @scala.inline
  implicit class IConnectionCompletionOptionsOps[Self <: IConnectionCompletionOptions] (val x: Self) extends AnyVal {
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
    def setSaveConnection(value: Boolean): Self = this.set("saveConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowConnectionDialogOnError(value: Boolean): Self = this.set("showConnectionDialogOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConnectionDialogOnError: Self = this.set("showConnectionDialogOnError", js.undefined)
    @scala.inline
    def setShowDashboard(value: Boolean): Self = this.set("showDashboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDashboard: Self = this.set("showDashboard", js.undefined)
    @scala.inline
    def setShowFirewallRuleOnError(value: Boolean): Self = this.set("showFirewallRuleOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFirewallRuleOnError: Self = this.set("showFirewallRuleOnError", js.undefined)
  }
  
}

