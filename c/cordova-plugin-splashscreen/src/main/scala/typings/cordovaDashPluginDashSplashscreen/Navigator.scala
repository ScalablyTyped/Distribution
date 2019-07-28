package typings.cordovaDashPluginDashSplashscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: Anon_Hide
}

object Navigator {
  @scala.inline
  def apply(splashscreen: Anon_Hide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen)
  
    __obj.asInstanceOf[Navigator]
  }
}

