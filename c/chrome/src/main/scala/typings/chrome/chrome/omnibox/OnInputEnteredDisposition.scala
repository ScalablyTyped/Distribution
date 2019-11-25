package typings.chrome.chrome.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.currentTab
  - typings.chrome.chromeStrings.newForegroundTab
  - typings.chrome.chromeStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typings.chrome.chromeStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typings.chrome.chromeStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typings.chrome.chromeStrings.newForegroundTab = this.cast("newForegroundTab")
}

