package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font
  extends StObject
     with EmbindObject[Font] {
  
  /**
    * Retrieves the bounds for each glyph in glyphs.
    * If paint is not null, its stroking, PathEffect, and MaskFilter fields are respected.
    * These are returned as flattened rectangles.  For each glyph, there will be 4 floats for
    * left, top, right, bottom (relative to 0, 0) for that glyph.
    * @param glyphs
    * @param paint
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphBounds(glyphs: InputGlyphIDArray): js.typedarray.Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: Null, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: Unit, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: Paint): js.typedarray.Float32Array = js.native
  def getGlyphBounds(glyphs: InputGlyphIDArray, paint: Paint, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Retrieves the glyph ids for each code point in the provided string. This call is passed to
    * the typeface of this font. Note that glyph IDs are typeface-dependent; different faces
    * may have different ids for the same code point.
    * @param str
    * @param numCodePoints - the number of code points in the string. Defaults to str.length.
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphIDs(str: String): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Double): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Double, output: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  def getGlyphIDs(str: String, numCodePoints: Unit, output: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
  
  def getGlyphIntercepts(glyphs: InputGlyphIDArray, positions: js.Array[Double], top: Double, bottom: Double): js.typedarray.Float32Array = js.native
  /**
    * Computes any intersections of a thick "line" and a run of positionsed glyphs.
    * The thick line is represented as a top and bottom coordinate (positive for
    * below the baseline, negative for above). If there are no intersections
    * (e.g. if this is intended as an underline, and there are no "collisions")
    * then the returned array will be empty. If there are intersections, the array
    * will contain pairs of X coordinates [start, end] for each segment that
    * intersected with a glyph.
    *
    * @param glyphs        the glyphs to intersect with
    * @param positions     x,y coordinates (2 per glyph) for each glyph
    * @param top           top of the thick "line" to use for intersection testing
    * @param bottom        bottom of the thick "line" to use for intersection testing
    * @return              array of [start, end] x-coordinate pairs. Maybe be empty.
    */
  def getGlyphIntercepts(glyphs: InputGlyphIDArray, positions: js.typedarray.Float32Array, top: Double, bottom: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Retrieves the advanceX measurements for each glyph.
    * If paint is not null, its stroking, PathEffect, and MaskFilter fields are respected.
    * One width per glyph is returned in the returned array.
    * @param glyphs
    * @param paint
    * @param output - if provided, the results will be copied into this array.
    */
  def getGlyphWidths(glyphs: InputGlyphIDArray): js.typedarray.Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: Null, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: Unit, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: Paint): js.typedarray.Float32Array = js.native
  def getGlyphWidths(glyphs: InputGlyphIDArray, paint: Paint, output: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Returns the FontMetrics for this font.
    */
  def getMetrics(): FontMetrics = js.native
  
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
    * Returns the Typeface set for this font.
    */
  def getTypeface(): Typeface | Null = js.native
  
  /**
    * Returns embolden effect for this font. Default value is false.
    */
  def isEmbolden(): Boolean = js.native
  
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
    * Set embolden effect for this font.
    * @param embolden
    */
  def setEmbolden(embolden: Boolean): Unit = js.native
  
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
  def setTypeface(face: Typeface): Unit = js.native
}
