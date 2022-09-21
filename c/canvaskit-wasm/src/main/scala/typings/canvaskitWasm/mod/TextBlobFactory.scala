package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBlobFactory extends StObject {
  
  /**
    * Return a TextBlob with a single run of text.
    *
    * It does not perform typeface fallback for characters not found in the Typeface.
    * It does not perform kerning or other complex shaping; glyphs are positioned based on their
    * default advances.
    * @param glyphs - if using Malloc'd array, be sure to use CanvasKit.MallocGlyphIDs().
    * @param font
    */
  def MakeFromGlyphs(glyphs: InputGlyphIDArray, font: Font): TextBlob = js.native
  
  /**
    * Returns a TextBlob built from a single run of text with rotation, scale, and translations.
    *
    * It uses the default character-to-glyph mapping from the typeface in the font.
    * @param str
    * @param rsxforms
    * @param font
    */
  def MakeFromRSXform(str: String, rsxforms: InputFlattenedRSXFormArray, font: Font): TextBlob = js.native
  
  /**
    * Returns a TextBlob built from a single run of text with rotation, scale, and translations.
    *
    * @param glyphs - if using Malloc'd array, be sure to use CanvasKit.MallocGlyphIDs().
    * @param rsxforms
    * @param font
    */
  def MakeFromRSXformGlyphs(glyphs: InputGlyphIDArray, rsxforms: InputFlattenedRSXFormArray, font: Font): TextBlob = js.native
  
  /**
    * Return a TextBlob with a single run of text.
    *
    * It uses the default character-to-glyph mapping from the typeface in the font.
    * It does not perform typeface fallback for characters not found in the Typeface.
    * It does not perform kerning or other complex shaping; glyphs are positioned based on their
    * default advances.
    * @param str
    * @param font
    */
  def MakeFromText(str: String, font: Font): TextBlob = js.native
  
  /**
    * Returns a TextBlob that has the glyphs following the contours of the given path.
    *
    * It is a convenience wrapper around MakeFromRSXform and ContourMeasureIter.
    * @param str
    * @param path
    * @param font
    * @param initialOffset - the length in pixels to start along the path.
    */
  def MakeOnPath(str: String, path: Path, font: Font): TextBlob = js.native
  def MakeOnPath(str: String, path: Path, font: Font, initialOffset: Double): TextBlob = js.native
}
