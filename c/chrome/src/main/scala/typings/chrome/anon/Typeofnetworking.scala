package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  val config: Typeofconfig = js.native
}

object Typeofnetworking {
  @scala.inline
  def apply(config: Typeofconfig): Typeofnetworking = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetworking]
  }
  @scala.inline
  implicit class TypeofnetworkingOps[Self <: Typeofnetworking] (val x: Self) extends AnyVal {
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
    def setConfig(value: Typeofconfig): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

