package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.`fill-box`
  - typings.csstype.csstypeStrings.`margin-box`
  - typings.csstype.csstypeStrings.`stroke-box`
  - typings.csstype.csstypeStrings.`view-box`
  - typings.csstype.csstypeStrings.`border-box`
  - typings.csstype.csstypeStrings.`content-box`
  - typings.csstype.csstypeStrings.`padding-box`
*/
trait GeometryBox
  extends _MaskLayer[js.Any]
     with _ClipPathProperty
     with _MaskClipProperty
     with _MaskOriginProperty
     with _OffsetPathProperty
     with _OffsetProperty[js.Any]

object GeometryBox {
  @scala.inline
  def `border-box`: typings.csstype.csstypeStrings.`border-box` = this.cast("border-box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `content-box`: typings.csstype.csstypeStrings.`content-box` = this.cast("content-box")
  @scala.inline
  def `fill-box`: typings.csstype.csstypeStrings.`fill-box` = this.cast("fill-box")
  @scala.inline
  def `margin-box`: typings.csstype.csstypeStrings.`margin-box` = this.cast("margin-box")
  @scala.inline
  def `padding-box`: typings.csstype.csstypeStrings.`padding-box` = this.cast("padding-box")
  @scala.inline
  def `stroke-box`: typings.csstype.csstypeStrings.`stroke-box` = this.cast("stroke-box")
  @scala.inline
  def `view-box`: typings.csstype.csstypeStrings.`view-box` = this.cast("view-box")
}

