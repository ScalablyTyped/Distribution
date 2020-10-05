package typings.csstype.mod.DataType

import typings.csstype.mod.Property._ClipPath
import typings.csstype.mod.Property._MaskClip
import typings.csstype.mod.Property._Offset
import typings.csstype.mod.Property._OffsetPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
     with _ClipPath
     with _MaskClip
     with _Offset[js.Any]
     with _OffsetPath

object GeometryBox {
  @scala.inline
  def `border-box`: typings.csstype.csstypeStrings.`border-box` = "border-box".asInstanceOf[typings.csstype.csstypeStrings.`border-box`]
  @scala.inline
  def `content-box`: typings.csstype.csstypeStrings.`content-box` = "content-box".asInstanceOf[typings.csstype.csstypeStrings.`content-box`]
  @scala.inline
  def `fill-box`: typings.csstype.csstypeStrings.`fill-box` = "fill-box".asInstanceOf[typings.csstype.csstypeStrings.`fill-box`]
  @scala.inline
  def `margin-box`: typings.csstype.csstypeStrings.`margin-box` = "margin-box".asInstanceOf[typings.csstype.csstypeStrings.`margin-box`]
  @scala.inline
  def `padding-box`: typings.csstype.csstypeStrings.`padding-box` = "padding-box".asInstanceOf[typings.csstype.csstypeStrings.`padding-box`]
  @scala.inline
  def `stroke-box`: typings.csstype.csstypeStrings.`stroke-box` = "stroke-box".asInstanceOf[typings.csstype.csstypeStrings.`stroke-box`]
  @scala.inline
  def `view-box`: typings.csstype.csstypeStrings.`view-box` = "view-box".asInstanceOf[typings.csstype.csstypeStrings.`view-box`]
}

