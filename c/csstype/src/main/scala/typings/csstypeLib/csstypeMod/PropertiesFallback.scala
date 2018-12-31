package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(csstypeLib.csstypeMod.SvgPropertiesFallback because Would inherit conflicting mutable fields List(clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode))*/
trait PropertiesFallback[TLength]
  extends StandardPropertiesFallback[TLength]
     with VendorPropertiesFallback[TLength]
     with ObsoletePropertiesFallback[TLength]

