package typings.cordovaDashIonic

import typings.cordovaDashIonic.Ionic.Keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var Keyboard: typings.cordovaDashIonic.Ionic.Keyboard
}

object CordovaPlugins {
  @scala.inline
  def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

