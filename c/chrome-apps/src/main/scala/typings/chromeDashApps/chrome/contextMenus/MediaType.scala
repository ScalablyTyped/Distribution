package typings.chromeDashApps.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.image
  - typings.chromeDashApps.chromeDashAppsStrings.video
  - typings.chromeDashApps.chromeDashAppsStrings.audio
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  def audio: typings.chromeDashApps.chromeDashAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.chromeDashApps.chromeDashAppsStrings.image = this.cast("image")
  @scala.inline
  def video: typings.chromeDashApps.chromeDashAppsStrings.video = this.cast("video")
}

