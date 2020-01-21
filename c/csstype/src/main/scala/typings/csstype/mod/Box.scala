package typings.csstype.mod

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
     with _BackgroundClipProperty
     with _BackgroundOriginProperty
     with _ShapeOutsideProperty
     with _WebkitMaskClipProperty
     with _WebkitMaskOriginProperty
     with _WebkitMaskProperty[js.Any]

object Box {
  @scala.inline
  def `border-box`: typings.csstype.csstypeStrings.`border-box` = this.cast("border-box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `content-box`: typings.csstype.csstypeStrings.`content-box` = this.cast("content-box")
  @scala.inline
  def `padding-box`: typings.csstype.csstypeStrings.`padding-box` = this.cast("padding-box")
}

