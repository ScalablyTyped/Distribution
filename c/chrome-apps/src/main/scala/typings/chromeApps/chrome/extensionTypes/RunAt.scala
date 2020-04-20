package typings.chromeApps.chrome.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The soonest that the JavaScript or CSS will be injected into the tab.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.document_start
  - typings.chromeApps.chromeAppsStrings.document_end
  - typings.chromeApps.chromeAppsStrings.document_idle
*/
trait RunAt extends js.Object

object RunAt {
  @scala.inline
  def document_end: typings.chromeApps.chromeAppsStrings.document_end = "document_end".asInstanceOf[typings.chromeApps.chromeAppsStrings.document_end]
  @scala.inline
  def document_idle: typings.chromeApps.chromeAppsStrings.document_idle = "document_idle".asInstanceOf[typings.chromeApps.chromeAppsStrings.document_idle]
  @scala.inline
  def document_start: typings.chromeApps.chromeAppsStrings.document_start = "document_start".asInstanceOf[typings.chromeApps.chromeAppsStrings.document_start]
}

