package typings.cloudflareApps.CloudflareApps

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
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

