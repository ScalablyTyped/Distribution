package typings.cordovaDashPluginDashEmailDashComposer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var email: CordovaPluginEmailComposer
}

object CordovaPlugins {
  @scala.inline
  def apply(email: CordovaPluginEmailComposer): CordovaPlugins = {
    val __obj = js.Dynamic.literal(email = email)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

