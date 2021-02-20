package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionCompletionOptions extends StObject {
  
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
  implicit class IConnectionCompletionOptionsMutableBuilder[Self <: IConnectionCompletionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSaveConnection(value: Boolean): Self = StObject.set(x, "saveConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConnectionDialogOnError(value: Boolean): Self = StObject.set(x, "showConnectionDialogOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConnectionDialogOnErrorUndefined: Self = StObject.set(x, "showConnectionDialogOnError", js.undefined)
    
    @scala.inline
    def setShowDashboard(value: Boolean): Self = StObject.set(x, "showDashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDashboardUndefined: Self = StObject.set(x, "showDashboard", js.undefined)
    
    @scala.inline
    def setShowFirewallRuleOnError(value: Boolean): Self = StObject.set(x, "showFirewallRuleOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirewallRuleOnErrorUndefined: Self = StObject.set(x, "showFirewallRuleOnError", js.undefined)
  }
}
