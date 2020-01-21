package typings.chromeApps.WebView

import typings.chromeApps.chromeAppsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.all_
  - typings.chromeApps.chromeAppsStrings.page
  - typings.chromeApps.chromeAppsStrings.frame
  - typings.chromeApps.chromeAppsStrings.selection
  - typings.chromeApps.chromeAppsStrings.link
  - typings.chromeApps.chromeAppsStrings.editable
  - typings.chromeApps.chromeAppsStrings.image
  - typings.chromeApps.chromeAppsStrings.video
  - typings.chromeApps.chromeAppsStrings.audio
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def audio: typings.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typings.chromeApps.chromeAppsStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typings.chromeApps.chromeAppsStrings.frame = this.cast("frame")
  @scala.inline
  def image: typings.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def link: typings.chromeApps.chromeAppsStrings.link = this.cast("link")
  @scala.inline
  def page: typings.chromeApps.chromeAppsStrings.page = this.cast("page")
  @scala.inline
  def selection: typings.chromeApps.chromeAppsStrings.selection = this.cast("selection")
  @scala.inline
  def video: typings.chromeApps.chromeAppsStrings.video = this.cast("video")
}

