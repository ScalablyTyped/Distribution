package typings.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstart
  - typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstop
  - typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loaderror
  - typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.exit
  - typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.message
*/
trait channel extends js.Object

object channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exit: typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.exit = this.cast("exit")
  @scala.inline
  def loaderror: typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loaderror = this.cast("loaderror")
  @scala.inline
  def loadstart: typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstart = this.cast("loadstart")
  @scala.inline
  def loadstop: typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstop = this.cast("loadstop")
  @scala.inline
  def message: typings.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.message = this.cast("message")
}

