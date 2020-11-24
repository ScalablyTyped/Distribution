package typings.canvaskitWasm.mod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkFont extends EmbindObject[SkFont] {
  
  /**
    * Retrieves the bounds for each glyph in glyphs.
    * If paint is not null, its stroking, SkPathEffect, and SkMaskFilter fields are respected.
    * These are returned as flattened rectangles.  For each glyph, there will be 4 floats for
    * left, top, right, bottom (relative to 0, 0) for that glyph.
    * @param glyphs
    * @param paint
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphBounds(glyphs: InputGlyphIDArray): Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: js.UndefOr[scala.Nothing], output: Float32Array): Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: Null, output: Float32Array): Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: SkPaint): Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: SkPaint, output: Float32Array): Float32Array = js.native
  
  /**
    * Retrieves the glyph ids for each code point in the provided string. Note that glyph IDs
    * are font-dependent; different fonts may have different ids for the same code point.
    * @param str
    * @param numCodePoints - the number of code points in the string. Defaults to str.length.
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphIDs(str: String): GlyphIDArray = js.native
  def getGlyphIDs(str: String, numCodePoints: js.UndefOr[scala.Nothing], output: TypedArray): GlyphIDArray = js.native
  def getGlyphIDs(str: String, numCodePoints: Double): GlyphIDArray = js.native
  def getGlyphIDs(str: String, numCodePoints: Double, output: TypedArray): GlyphIDArray = js.native
  
  /**
    * Retrieves the advanceX measurements for each glyph.
    * If paint is not null, its stroking, SkPathEffect, and SkMaskFilter fields are respected.
    * One width per glyph is returned in the returned array.
    * @param glyphs
    * @param paint
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphWidths(glyphs: InputGlyphIDArray): Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: js.UndefOr[scala.Nothing], output: Float32Array): Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: Null, output: Float32Array): Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: SkPaint): Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: SkPaint, output: Float32Array): Float32Array = js.native
  
  /**
    * Returns text scale on x-axis. Default value is 1.
    */
  def getScaleX(): Double = js.native
  
  /**
    * Returns text size in points.
    */
  def getSize(): Double = js.native
  
  /**
    * Returns text skew on x-axis. Default value is zero.
    */
  def getSkewX(): Double = js.native
  
  /**
    * Returns the SkTypeface set for this font.
    */
  def getTypeface(): SkTypeface | Null = js.native
  
  /**
    * Retrieves the advanceX measurements for each code point in str.
    * [deprecated] Use getGlyphIDs and getGlyphWidths instead.
    * @param str
    */
  def getWidths(str: String): js.Array[Double] = js.native
  
  /**
    * Retrieves the total advance with the given string.
    * If attempting to shape text to fit into a given width, using getGlyphIDs and getGlyphWidths
    * is probably easier / more efficient.
    * @param str
    */
  def measureText(str: String): Double = js.native
  
  /**
    * Requests, but does not require, that edge pixels draw opaque or with partial transparency.
    * @param edging
    */
  def setEdging(edging: FontEdging): Unit = js.native
  
  /**
    * Requests, but does not require, to use bitmaps in fonts instead of outlines.
    * @param embeddedBitmaps
    */
  def setEmbeddedBitmaps(embeddedBitmaps: Boolean): Unit = js.native
  
  /**
    * Sets level of glyph outline adjustment.
    * @param hinting
    */
  def setHinting(hinting: FontHinting): Unit = js.native
  
  /**
    * Requests, but does not require, linearly scalable font and glyph metrics.
    *
    * For outline fonts 'true' means font and glyph metrics should ignore hinting and rounding.
    * Note that some bitmap formats may not be able to scale linearly and will ignore this flag.
    * @param linearMetrics
    */
  def setLinearMetrics(linearMetrics: Boolean): Unit = js.native
  
  /**
    * Sets the text scale on the x-axis.
    * @param sx
    */
  def setScaleX(sx: Double): Unit = js.native
  
  /**
    * Sets the text size in points on this font.
    * @param points
    */
  def setSize(points: Double): Unit = js.native
  
  /**
    * Sets the text-skew on the x axis for this font.
    * @param sx
    */
  def setSkewX(sx: Double): Unit = js.native
  
  /**
    * Requests, but does not require, that glyphs respect sub-pixel positioning.
    * @param subpixel
    */
  def setSubpixel(subpixel: Boolean): Unit = js.native
  
  /**
    * Sets the typeface to use with this font. null means to clear the typeface and use the
    * default one.
    * @param face
    */
  def setTypeface(): Unit = js.native
  def setTypeface(face: SkTypeface): Unit = js.native
}
