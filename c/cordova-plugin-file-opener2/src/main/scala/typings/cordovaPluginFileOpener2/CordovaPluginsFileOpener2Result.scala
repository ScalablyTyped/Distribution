package typings.cordovaPluginFileOpener2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginsFileOpener2Result extends js.Object {
  var message: String
  var status: Double
}

object CordovaPluginsFileOpener2Result {
  @scala.inline
  def apply(message: String, status: Double): CordovaPluginsFileOpener2Result = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPluginsFileOpener2Result]
  }
}

