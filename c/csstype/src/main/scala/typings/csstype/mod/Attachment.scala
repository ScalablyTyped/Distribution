package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.fixed
  - typings.csstype.csstypeStrings.local
  - typings.csstype.csstypeStrings.scroll
*/
trait Attachment
  extends _FinalBgLayer[js.Any]
     with _BackgroundAttachmentProperty
     with _WebkitMaskAttachmentProperty

object Attachment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typings.csstype.csstypeStrings.fixed = this.cast("fixed")
  @scala.inline
  def local: typings.csstype.csstypeStrings.local = this.cast("local")
  @scala.inline
  def scroll: typings.csstype.csstypeStrings.scroll = this.cast("scroll")
}

