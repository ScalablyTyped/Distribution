package typings.chromeApps.chrome.mediaGalleries

import typings.chromeApps.chromeAppsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.all_
  - typings.chromeApps.chromeAppsStrings.mimeTypeAndTags
  - typings.chromeApps.chromeAppsStrings.mimeTypeOnly
*/
trait MetadataOptionsType extends js.Object

object MetadataOptionsType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mimeTypeAndTags: typings.chromeApps.chromeAppsStrings.mimeTypeAndTags = this.cast("mimeTypeAndTags")
  @scala.inline
  def mimeTypeOnly: typings.chromeApps.chromeAppsStrings.mimeTypeOnly = this.cast("mimeTypeOnly")
}

