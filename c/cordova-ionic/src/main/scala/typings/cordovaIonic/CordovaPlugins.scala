package typings.cordovaIonic

import typings.cordovaIonic.Ionic.Keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var Keyboard: typings.cordovaIonic.Ionic.Keyboard
}

object CordovaPlugins {
  @scala.inline
  def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

