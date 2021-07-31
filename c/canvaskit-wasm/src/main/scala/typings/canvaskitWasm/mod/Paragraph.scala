package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with EmbindObject[Paragraph] {
  
  def didExceedMaxLines(): Boolean
  
  def getAlphabeticBaseline(): Double
  
  /**
    * Returns the index of the glyph that corresponds to the provided coordinate,
    * with the top left corner as the origin, and +y direction as down.
    */
  def getGlyphPositionAtCoordinate(dx: Double, dy: Double): PositionWithAffinity
  
  def getHeight(): Double
  
  def getIdeographicBaseline(): Double
  
  def getLongestLine(): Double
  
  def getMaxIntrinsicWidth(): Double
  
  def getMaxWidth(): Double
  
  def getMinIntrinsicWidth(): Double
  
  def getRectsForPlaceholders(): FlattenedRectangleArray
  
  /**
    * Returns bounding boxes that enclose all text in the range of glpyh indexes [start, end).
    * @param start
    * @param end
    * @param hStyle
    * @param wStyle
    */
  def getRectsForRange(start: Double, end: Double, hStyle: RectHeightStyle, wStyle: RectWidthStyle): FlattenedRectangleArray
  
  /**
    * Finds the first and last glyphs that define a word containing the glyph at index offset.
    * @param offset
    */
  def getWordBoundary(offset: Double): URange
  
  /**
    * Lays out the text in the paragraph so it is wrapped to the given width.
    * @param width
    */
  def layout(width: Double): Unit
}
object Paragraph {
  
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    didExceedMaxLines: () => Boolean,
    getAlphabeticBaseline: () => Double,
    getGlyphPositionAtCoordinate: (Double, Double) => PositionWithAffinity,
    getHeight: () => Double,
    getIdeographicBaseline: () => Double,
    getLongestLine: () => Double,
    getMaxIntrinsicWidth: () => Double,
    getMaxWidth: () => Double,
    getMinIntrinsicWidth: () => Double,
    getRectsForPlaceholders: () => FlattenedRectangleArray,
    getRectsForRange: (Double, Double, RectHeightStyle, RectWidthStyle) => FlattenedRectangleArray,
    getWordBoundary: Double => URange,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    layout: Double => Unit
  ): Paragraph = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), didExceedMaxLines = js.Any.fromFunction0(didExceedMaxLines), getAlphabeticBaseline = js.Any.fromFunction0(getAlphabeticBaseline), getGlyphPositionAtCoordinate = js.Any.fromFunction2(getGlyphPositionAtCoordinate), getHeight = js.Any.fromFunction0(getHeight), getIdeographicBaseline = js.Any.fromFunction0(getIdeographicBaseline), getLongestLine = js.Any.fromFunction0(getLongestLine), getMaxIntrinsicWidth = js.Any.fromFunction0(getMaxIntrinsicWidth), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinIntrinsicWidth = js.Any.fromFunction0(getMinIntrinsicWidth), getRectsForPlaceholders = js.Any.fromFunction0(getRectsForPlaceholders), getRectsForRange = js.Any.fromFunction4(getRectsForRange), getWordBoundary = js.Any.fromFunction1(getWordBoundary), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), layout = js.Any.fromFunction1(layout))
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDidExceedMaxLines(value: () => Boolean): Self = StObject.set(x, "didExceedMaxLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAlphabeticBaseline(value: () => Double): Self = StObject.set(x, "getAlphabeticBaseline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGlyphPositionAtCoordinate(value: (Double, Double) => PositionWithAffinity): Self = StObject.set(x, "getGlyphPositionAtCoordinate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdeographicBaseline(value: () => Double): Self = StObject.set(x, "getIdeographicBaseline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongestLine(value: () => Double): Self = StObject.set(x, "getLongestLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxIntrinsicWidth(value: () => Double): Self = StObject.set(x, "getMaxIntrinsicWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxWidth(value: () => Double): Self = StObject.set(x, "getMaxWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinIntrinsicWidth(value: () => Double): Self = StObject.set(x, "getMinIntrinsicWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRectsForPlaceholders(value: () => FlattenedRectangleArray): Self = StObject.set(x, "getRectsForPlaceholders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRectsForRange(value: (Double, Double, RectHeightStyle, RectWidthStyle) => FlattenedRectangleArray): Self = StObject.set(x, "getRectsForRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetWordBoundary(value: Double => URange): Self = StObject.set(x, "getWordBoundary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayout(value: Double => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
  }
}
