package typings.cloudflareDashApps.CloudflareAppsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var appId: String
  var options: InstallOptions
  var scope: InstallScope
}

object App {
  @scala.inline
  def apply(appId: String, options: InstallOptions, scope: InstallScope): App = {
    val __obj = js.Dynamic.literal(appId = appId, options = options, scope = scope)
  
    __obj.asInstanceOf[App]
  }
}

