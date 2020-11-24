package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "dashboard")
@js.native
object dashboard extends js.Object {
  
  def registerWebviewProvider(widgetId: String, handler: js.Function1[/* webview */ DashboardWebview, Unit]): Unit = js.native
}
