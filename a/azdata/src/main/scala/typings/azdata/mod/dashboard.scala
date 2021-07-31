package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboard {
  
  @JSImport("azdata", "dashboard")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerWebviewProvider(widgetId: String, handler: js.Function1[/* webview */ DashboardWebview, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewProvider")(widgetId.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
