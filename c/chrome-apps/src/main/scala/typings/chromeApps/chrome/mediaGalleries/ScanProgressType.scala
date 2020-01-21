package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.start
  - typings.chromeApps.chromeAppsStrings.cancel
  - typings.chromeApps.chromeAppsStrings.finish
  - typings.chromeApps.chromeAppsStrings.error
*/
trait ScanProgressType extends js.Object

object ScanProgressType {
  @scala.inline
  def cancel: typings.chromeApps.chromeAppsStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.chromeApps.chromeAppsStrings.error = this.cast("error")
  @scala.inline
  def finish: typings.chromeApps.chromeAppsStrings.finish = this.cast("finish")
  @scala.inline
  def start: typings.chromeApps.chromeAppsStrings.start = this.cast("start")
}

