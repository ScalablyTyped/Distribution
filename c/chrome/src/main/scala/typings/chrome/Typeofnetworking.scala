package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetworking extends js.Object {
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val configNs: Typeofconfig
}

object Typeofnetworking {
  @scala.inline
  def apply(configNs: Typeofconfig): Typeofnetworking = {
    val __obj = js.Dynamic.literal(configNs = configNs)
  
    __obj.asInstanceOf[Typeofnetworking]
  }
}

