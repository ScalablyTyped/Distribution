package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.contents_changed
  - typings.chromeApps.chromeAppsStrings.watch_dropped
*/
trait GalleryChangedType extends js.Object

object GalleryChangedType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contents_changed: typings.chromeApps.chromeAppsStrings.contents_changed = this.cast("contents_changed")
  @scala.inline
  def watch_dropped: typings.chromeApps.chromeAppsStrings.watch_dropped = this.cast("watch_dropped")
}

