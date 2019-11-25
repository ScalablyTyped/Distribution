package typings.chromeDashApps.WebView

import typings.chromeDashApps.chromeDashAppsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.all_
  - typings.chromeDashApps.chromeDashAppsStrings.page
  - typings.chromeDashApps.chromeDashAppsStrings.frame
  - typings.chromeDashApps.chromeDashAppsStrings.selection
  - typings.chromeDashApps.chromeDashAppsStrings.link
  - typings.chromeDashApps.chromeDashAppsStrings.editable
  - typings.chromeDashApps.chromeDashAppsStrings.image
  - typings.chromeDashApps.chromeDashAppsStrings.video
  - typings.chromeDashApps.chromeDashAppsStrings.audio
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def audio: typings.chromeDashApps.chromeDashAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typings.chromeDashApps.chromeDashAppsStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typings.chromeDashApps.chromeDashAppsStrings.frame = this.cast("frame")
  @scala.inline
  def image: typings.chromeDashApps.chromeDashAppsStrings.image = this.cast("image")
  @scala.inline
  def link: typings.chromeDashApps.chromeDashAppsStrings.link = this.cast("link")
  @scala.inline
  def page: typings.chromeDashApps.chromeDashAppsStrings.page = this.cast("page")
  @scala.inline
  def selection: typings.chromeDashApps.chromeDashAppsStrings.selection = this.cast("selection")
  @scala.inline
  def video: typings.chromeDashApps.chromeDashAppsStrings.video = this.cast("video")
}

