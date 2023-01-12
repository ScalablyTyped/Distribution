package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectionCompletionOptions extends StObject {
  
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
  
  inline def apply(saveConnection: Boolean): IConnectionCompletionOptions = {
    val __obj = js.Dynamic.literal(saveConnection = saveConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCompletionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConnectionCompletionOptions] (val x: Self) extends AnyVal {
    
    inline def setSaveConnection(value: Boolean): Self = StObject.set(x, "saveConnection", value.asInstanceOf[js.Any])
    
    inline def setShowConnectionDialogOnError(value: Boolean): Self = StObject.set(x, "showConnectionDialogOnError", value.asInstanceOf[js.Any])
    
    inline def setShowConnectionDialogOnErrorUndefined: Self = StObject.set(x, "showConnectionDialogOnError", js.undefined)
    
    inline def setShowDashboard(value: Boolean): Self = StObject.set(x, "showDashboard", value.asInstanceOf[js.Any])
    
    inline def setShowDashboardUndefined: Self = StObject.set(x, "showDashboard", js.undefined)
    
    inline def setShowFirewallRuleOnError(value: Boolean): Self = StObject.set(x, "showFirewallRuleOnError", value.asInstanceOf[js.Any])
    
    inline def setShowFirewallRuleOnErrorUndefined: Self = StObject.set(x, "showFirewallRuleOnError", js.undefined)
  }
}
