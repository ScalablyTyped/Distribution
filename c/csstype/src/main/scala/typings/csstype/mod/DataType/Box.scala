package typings.csstype.mod.DataType

import typings.csstype.mod.Property._BackgroundClip
import typings.csstype.mod.Property._BackgroundOrigin
import typings.csstype.mod.Property._MaskOrigin
import typings.csstype.mod.Property._ShapeOutside
import typings.csstype.mod.Property._WebkitMask
import typings.csstype.mod.Property._WebkitMaskClip
import typings.csstype.mod.Property._WebkitMaskOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.`border-box`
  - typings.csstype.csstypeStrings.`content-box`
  - typings.csstype.csstypeStrings.`padding-box`
*/
trait Box
  extends _FinalBgLayer[js.Any]
     with _BackgroundClip
     with _BackgroundOrigin
     with _MaskOrigin
     with _ShapeOutside
     with _WebkitMask[js.Any]
     with _WebkitMaskClip
     with _WebkitMaskOrigin

object Box {
  @scala.inline
  def `border-box`: typings.csstype.csstypeStrings.`border-box` = "border-box".asInstanceOf[typings.csstype.csstypeStrings.`border-box`]
  @scala.inline
  def `content-box`: typings.csstype.csstypeStrings.`content-box` = "content-box".asInstanceOf[typings.csstype.csstypeStrings.`content-box`]
  @scala.inline
  def `padding-box`: typings.csstype.csstypeStrings.`padding-box` = "padding-box".asInstanceOf[typings.csstype.csstypeStrings.`padding-box`]
}

