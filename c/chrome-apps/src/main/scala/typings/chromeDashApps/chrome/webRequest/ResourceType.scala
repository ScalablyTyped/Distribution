package typings.chromeDashApps.chrome.webRequest

import typings.chromeDashApps.chromeDashAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.main_frame
  - typings.chromeDashApps.chromeDashAppsStrings.sub_frame
  - typings.chromeDashApps.chromeDashAppsStrings.stylesheet
  - typings.chromeDashApps.chromeDashAppsStrings.script
  - typings.chromeDashApps.chromeDashAppsStrings.image
  - typings.chromeDashApps.chromeDashAppsStrings.font
  - typings.chromeDashApps.chromeDashAppsStrings.`object`
  - typings.chromeDashApps.chromeDashAppsStrings.xmlhttprequest
  - typings.chromeDashApps.chromeDashAppsStrings.ping
  - typings.chromeDashApps.chromeDashAppsStrings.csp_report
  - typings.chromeDashApps.chromeDashAppsStrings.media
  - typings.chromeDashApps.chromeDashAppsStrings.websocket
  - typings.chromeDashApps.chromeDashAppsStrings.other_
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csp_report: typings.chromeDashApps.chromeDashAppsStrings.csp_report = this.cast("csp_report")
  @scala.inline
  def font: typings.chromeDashApps.chromeDashAppsStrings.font = this.cast("font")
  @scala.inline
  def image: typings.chromeDashApps.chromeDashAppsStrings.image = this.cast("image")
  @scala.inline
  def main_frame: typings.chromeDashApps.chromeDashAppsStrings.main_frame = this.cast("main_frame")
  @scala.inline
  def media: typings.chromeDashApps.chromeDashAppsStrings.media = this.cast("media")
  @scala.inline
  def `object`: typings.chromeDashApps.chromeDashAppsStrings.`object` = this.cast("object")
  @scala.inline
  def other: other_ = this.cast("other")
  @scala.inline
  def ping: typings.chromeDashApps.chromeDashAppsStrings.ping = this.cast("ping")
  @scala.inline
  def script: typings.chromeDashApps.chromeDashAppsStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typings.chromeDashApps.chromeDashAppsStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def sub_frame: typings.chromeDashApps.chromeDashAppsStrings.sub_frame = this.cast("sub_frame")
  @scala.inline
  def websocket: typings.chromeDashApps.chromeDashAppsStrings.websocket = this.cast("websocket")
  @scala.inline
  def xmlhttprequest: typings.chromeDashApps.chromeDashAppsStrings.xmlhttprequest = this.cast("xmlhttprequest")
}

