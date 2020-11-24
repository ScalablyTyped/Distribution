package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkTextBlobFactory extends js.Object {
  
  /**
    * Return a TextBlob with a single run of text.
    *
    * It does not perform typeface fallback for characters not found in the SkTypeface.
    * It does not perform kerning or other complex shaping; glyphs are positioned based on their
    * default advances.
    * @param glyphs - if using Malloc'd array, be sure to use CanvasKit.MallocGlyphIDs().
    * @param font
    */
  def MakeFromGlyphs(glyphs: InputGlyphIDArray, font: SkFont): SkTextBlob = js.native
  
  /**
    * Returns a TextBlob built from a single run of text with rotation, scale, and translations.
    *
    * It uses the default character-to-glyph mapping from the typeface in the font.
    * @param str
    * @param rsxforms
    * @param font
    */
  def MakeFromRSXform(str: String, rsxforms: InputFlattenedRSXFormArray, font: SkFont): SkTextBlob = js.native
  
  /**
    * Returns a TextBlob built from a single run of text with rotation, scale, and translations.
    *
    * @param glyphs - if using Malloc'd array, be sure to use CanvasKit.MallocGlyphIDs().
    * @param rsxforms
    * @param font
    */
  def MakeFromRSXformGlyphs(glyphs: InputGlyphIDArray, rsxforms: InputFlattenedRSXFormArray, font: SkFont): SkTextBlob = js.native
  
  /**
    * Return a TextBlob with a single run of text.
    *
    * It uses the default character-to-glyph mapping from the typeface in the font.
    * It does not perform typeface fallback for characters not found in the SkTypeface.
    * It does not perform kerning or other complex shaping; glyphs are positioned based on their
    * default advances.
    * @param str
    * @param font
    */
  def MakeFromText(str: String, font: SkFont): SkTextBlob = js.native
  
  /**
    * Returns a TextBlob that has the glyphs following the contours of the given path.
    *
    * It is a convenience wrapper around MakeFromRSXform and SkContourMeasureIter.
    * @param str
    * @param path
    * @param font
    * @param initialOffset - the length in pixels to start along the path.
    */
  def MakeOnPath(str: String, path: SkPath, font: SkFont): SkTextBlob = js.native
  def MakeOnPath(str: String, path: SkPath, font: SkFont, initialOffset: Double): SkTextBlob = js.native
}
