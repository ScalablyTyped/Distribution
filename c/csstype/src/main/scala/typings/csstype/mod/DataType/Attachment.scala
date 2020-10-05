package typings.csstype.mod.DataType

import typings.csstype.mod.Property._BackgroundAttachment
import typings.csstype.mod.Property._WebkitMaskAttachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.fixed
  - typings.csstype.csstypeStrings.local
  - typings.csstype.csstypeStrings.scroll
*/
trait Attachment
  extends _FinalBgLayer[js.Any]
     with _BackgroundAttachment
     with _WebkitMaskAttachment

object Attachment {
  @scala.inline
  def fixed: typings.csstype.csstypeStrings.fixed = "fixed".asInstanceOf[typings.csstype.csstypeStrings.fixed]
  @scala.inline
  def local: typings.csstype.csstypeStrings.local = "local".asInstanceOf[typings.csstype.csstypeStrings.local]
  @scala.inline
  def scroll: typings.csstype.csstypeStrings.scroll = "scroll".asInstanceOf[typings.csstype.csstypeStrings.scroll]
}

