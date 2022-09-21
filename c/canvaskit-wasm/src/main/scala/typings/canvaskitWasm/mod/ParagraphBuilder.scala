package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphBuilder
  extends StObject
     with EmbindObject[ParagraphBuilder] {
  
  /**
    * Pushes the information required to leave an open space.
    * @param width
    * @param height
    * @param alignment
    * @param baseline
    * @param offset
    */
  def addPlaceholder(): Unit = js.native
  def addPlaceholder(width: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: Unit, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: Unit, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: Unit, baseline: TextBaseline, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: PlaceholderAlignment, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: PlaceholderAlignment, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: Unit, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: Unit, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: Unit, baseline: TextBaseline, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: PlaceholderAlignment, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Double, height: Unit, alignment: PlaceholderAlignment, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Unit,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Unit, height: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: Unit, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: Unit, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: Unit, baseline: TextBaseline, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: PlaceholderAlignment, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Double, alignment: PlaceholderAlignment, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(
    width: Unit,
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: Unit, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: Unit, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: Unit, baseline: TextBaseline, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: PlaceholderAlignment, baseline: Unit, offset: Double): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: PlaceholderAlignment, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(width: Unit, height: Unit, alignment: PlaceholderAlignment, baseline: TextBaseline, offset: Double): Unit = js.native
  
  /**
    * Adds text to the builder. Forms the proper runs to use the upper-most style
    * on the style_stack.
    * @param str
    */
  def addText(str: String): Unit = js.native
  
  /**
    * Returns a Paragraph object that can be used to be layout and paint the text to an
    * Canvas.
    */
  def build(): Paragraph = js.native
  
  /**
    * Returns a Paragraph object that can be used to be layout and
    * paint the text to an Canvas.
    * @param bidiRegions is an array of unsigned integers that should be
    * treated as triples (starting index, ending index, direction).
    * Direction == 0 means left-to-right, direction == 1 is right-to-left.
    * @param words is an array of word edges (starting or ending). You can
    * pass 2 elements (0 as a start of the entire text and text.size as the
    * end). This information only needed for a specific API method getWords.
    * @param graphemes is an array of indexes in the input text that point
    * to the start of each grapheme.
    * @param softLineBreaks is an array of indexes in the input text that
    * point to the places of possible line breaking if needed. It should
    * include 0 as the first element.
    * #param hardLineBreaks is an array of indexes in the input text that
    * point to the places of mandatory line breaking.
    */
  def buildWithClientInfo(
    bidiRegions: js.UndefOr[InputBidiRegions | Null],
    words: js.UndefOr[InputWords | Null],
    graphemes: js.UndefOr[InputGraphemes | Null],
    softLineBreaks: js.UndefOr[InputLineBreaks | Null],
    hardLineBreaks: js.UndefOr[InputLineBreaks | Null]
  ): Paragraph = js.native
  
  /**
    * Returns the entire Paragraph text (which is useful in case that text
    * was produced as a set of addText calls).
    */
  def getText(): String = js.native
  
  /**
    * Remove a style from the stack. Useful to apply different styles to chunks
    * of text such as bolding.
    */
  def pop(): Unit = js.native
  
  /**
    * Pushes a TextStyle using paints instead of colors for foreground and background.
    * @param textStyle
    * @param fg
    * @param bg
    */
  def pushPaintStyle(textStyle: TextStyle, fg: Paint, bg: Paint): Unit = js.native
  
  /**
    * Push a style to the stack. The corresponding text added with addText will
    * use the top-most style.
    * @param text
    */
  def pushStyle(text: TextStyle): Unit = js.native
  
  /**
    * Resets this builder to its initial state, discarding any text, styles, placeholders that have
    * been added, but keeping the initial ParagraphStyle.
    */
  def reset(): Unit = js.native
}
