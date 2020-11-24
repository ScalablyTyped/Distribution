package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphBuilder extends EmbindObject[ParagraphBuilder] {
  
  /**
    * Pushes the information required to leave an open space.
    * @param width
    * @param height
    * @param alignment
    * @param baseline
    * @param offset
    */
  def addPlaceholder(): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: js.UndefOr[scala.Nothing],
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: js.UndefOr[scala.Nothing], height: Double, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: js.UndefOr[scala.Nothing],
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: js.UndefOr[scala.Nothing], alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: TextBaseline
  ): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: js.UndefOr[scala.Nothing],
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: Double): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Double,
    alignment: js.UndefOr[scala.Nothing],
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: js.UndefOr[scala.Nothing], baseline: TextBaseline): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Double,
    alignment: js.UndefOr[scala.Nothing],
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: PlaceholderAlignment): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def addPlaceholder(width: Double, height: Double, alignment: PlaceholderAlignment, baseline: TextBaseline): Unit = js.native
  def addPlaceholder(
    width: Double,
    height: Double,
    alignment: PlaceholderAlignment,
    baseline: TextBaseline,
    offset: Double
  ): Unit = js.native
  
  /**
    * Adds text to the builder. Forms the proper runs to use the upper-most style
    * on the style_stack.
    * @param str
    */
  def addText(str: String): Unit = js.native
  
  /**
    * Returns a Paragraph object that can be used to be layout and paint the text to an
    * SkCanvas.
    */
  def build(): Paragraph = js.native
  
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
  def pushPaintStyle(textStyle: TextStyle, fg: SkPaint, bg: SkPaint): Unit = js.native
  
  /**
    * Push a style to the stack. The corresponding text added with addText will
    * use the top-most style.
    * @param text
    */
  def pushStyle(text: TextStyle): Unit = js.native
}
