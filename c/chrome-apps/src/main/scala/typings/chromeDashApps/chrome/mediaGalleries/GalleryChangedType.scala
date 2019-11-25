package typings.chromeDashApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.contents_changed
  - typings.chromeDashApps.chromeDashAppsStrings.watch_dropped
*/
trait GalleryChangedType extends js.Object

object GalleryChangedType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contents_changed: typings.chromeDashApps.chromeDashAppsStrings.contents_changed = this.cast("contents_changed")
  @scala.inline
  def watch_dropped: typings.chromeDashApps.chromeDashAppsStrings.watch_dropped = this.cast("watch_dropped")
}

