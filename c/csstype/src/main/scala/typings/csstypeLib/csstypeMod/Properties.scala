package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(csstypeLib.csstypeMod.SvgProperties because Would inherit conflicting mutable fields List(clip, textRendering, overflow, clipPath, fontSizeAdjust, paintOrder, fontStyle, direction, color, cursor, filter, fontFamily, letterSpacing, whiteSpace, wordSpacing, lineHeight, pointerEvents, writingMode, fontVariant, fontSize, opacity, fontStretch, imageRendering, fontWeight, visibility, unicodeBidi, display, mask, textDecoration, font))*/

trait Properties[TLength]
  extends StandardProperties[TLength]
     with VendorProperties[TLength]
     with ObsoleteProperties[TLength]

