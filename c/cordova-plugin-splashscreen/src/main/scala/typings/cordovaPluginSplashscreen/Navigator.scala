package typings.cordovaPluginSplashscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: AnonHide
}

object Navigator {
  @scala.inline
  def apply(splashscreen: AnonHide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

