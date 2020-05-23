package typings.cordovaPluginSplashscreen

import typings.cordovaPluginSplashscreen.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: Hide
}

object Navigator {
  @scala.inline
  def apply(splashscreen: Hide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

