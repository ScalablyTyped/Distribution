package typings.chromeApps.chrome.webRequest

import typings.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.main_frame
  - typings.chromeApps.chromeAppsStrings.sub_frame
  - typings.chromeApps.chromeAppsStrings.stylesheet
  - typings.chromeApps.chromeAppsStrings.script
  - typings.chromeApps.chromeAppsStrings.image
  - typings.chromeApps.chromeAppsStrings.font
  - typings.chromeApps.chromeAppsStrings.`object`
  - typings.chromeApps.chromeAppsStrings.xmlhttprequest
  - typings.chromeApps.chromeAppsStrings.ping
  - typings.chromeApps.chromeAppsStrings.csp_report
  - typings.chromeApps.chromeAppsStrings.media
  - typings.chromeApps.chromeAppsStrings.websocket
  - typings.chromeApps.chromeAppsStrings.other_
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csp_report: typings.chromeApps.chromeAppsStrings.csp_report = this.cast("csp_report")
  @scala.inline
  def font: typings.chromeApps.chromeAppsStrings.font = this.cast("font")
  @scala.inline
  def image: typings.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def main_frame: typings.chromeApps.chromeAppsStrings.main_frame = this.cast("main_frame")
  @scala.inline
  def media: typings.chromeApps.chromeAppsStrings.media = this.cast("media")
  @scala.inline
  def `object`: typings.chromeApps.chromeAppsStrings.`object` = this.cast("object")
  @scala.inline
  def other: other_ = this.cast("other")
  @scala.inline
  def ping: typings.chromeApps.chromeAppsStrings.ping = this.cast("ping")
  @scala.inline
  def script: typings.chromeApps.chromeAppsStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typings.chromeApps.chromeAppsStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def sub_frame: typings.chromeApps.chromeAppsStrings.sub_frame = this.cast("sub_frame")
  @scala.inline
  def websocket: typings.chromeApps.chromeAppsStrings.websocket = this.cast("websocket")
  @scala.inline
  def xmlhttprequest: typings.chromeApps.chromeAppsStrings.xmlhttprequest = this.cast("xmlhttprequest")
}

