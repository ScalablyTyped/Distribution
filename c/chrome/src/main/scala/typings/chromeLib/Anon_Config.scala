package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val configNs: Anon_CallbackFinishAuthentication
}

object Anon_Config {
  @scala.inline
  def apply(configNs: Anon_CallbackFinishAuthentication): Anon_Config = {
    val __obj = js.Dynamic.literal(configNs = configNs)
  
    __obj.asInstanceOf[Anon_Config]
  }
}

