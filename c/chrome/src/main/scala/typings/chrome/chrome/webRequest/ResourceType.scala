package typings.chrome.chrome.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.main_frame
  - typings.chrome.chromeStrings.sub_frame
  - typings.chrome.chromeStrings.stylesheet
  - typings.chrome.chromeStrings.script
  - typings.chrome.chromeStrings.image
  - typings.chrome.chromeStrings.font
  - typings.chrome.chromeStrings.`object`
  - typings.chrome.chromeStrings.xmlhttprequest
  - typings.chrome.chromeStrings.ping
  - typings.chrome.chromeStrings.csp_report
  - typings.chrome.chromeStrings.media
  - typings.chrome.chromeStrings.websocket
  - typings.chrome.chromeStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csp_report: typings.chrome.chromeStrings.csp_report = this.cast("csp_report")
  @scala.inline
  def font: typings.chrome.chromeStrings.font = this.cast("font")
  @scala.inline
  def image: typings.chrome.chromeStrings.image = this.cast("image")
  @scala.inline
  def main_frame: typings.chrome.chromeStrings.main_frame = this.cast("main_frame")
  @scala.inline
  def media: typings.chrome.chromeStrings.media = this.cast("media")
  @scala.inline
  def `object`: typings.chrome.chromeStrings.`object` = this.cast("object")
  @scala.inline
  def other: typings.chrome.chromeStrings.other = this.cast("other")
  @scala.inline
  def ping: typings.chrome.chromeStrings.ping = this.cast("ping")
  @scala.inline
  def script: typings.chrome.chromeStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typings.chrome.chromeStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def sub_frame: typings.chrome.chromeStrings.sub_frame = this.cast("sub_frame")
  @scala.inline
  def websocket: typings.chrome.chromeStrings.websocket = this.cast("websocket")
  @scala.inline
  def xmlhttprequest: typings.chrome.chromeStrings.xmlhttprequest = this.cast("xmlhttprequest")
}

