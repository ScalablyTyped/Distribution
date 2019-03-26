package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "VirtualRenderer")
@js.native
class VirtualRendererCls protected ()
  extends braceLib.braceMod.AceAjaxNs.VirtualRenderer {
  /**
    * Constructs a new `VirtualRenderer` within the `container` specified, applying the given `theme`.
    * @param container The root element of the editor
    * @param theme The starting theme
    **/
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, theme: java.lang.String) = this()
  /* CompleteClass */
  override var characterWidth: scala.Double = js.native
  /* CompleteClass */
  override var lineHeight: scala.Double = js.native
  /* CompleteClass */
  override var scroller: js.Any = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def addGutterDecoration(): scala.Unit = js.native
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  /* CompleteClass */
  override def adjustWrapLimit(): scala.Unit = js.native
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Returns whether an animated scroll happens or not.
    **/
  /* CompleteClass */
  override def getAnimatedScroll(): scala.Boolean = js.native
  /**
    * Returns the root element containing this renderer.
    **/
  /* CompleteClass */
  override def getContainerElement(): stdLib.HTMLElement = js.native
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getFirstFullyVisibleRow(): scala.Double = js.native
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  /* CompleteClass */
  override def getFirstVisibleRow(): scala.Double = js.native
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  /* CompleteClass */
  override def getHScrollBarAlwaysVisible(): scala.Boolean = js.native
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  /* CompleteClass */
  override def getLastFullyVisibleRow(): scala.Double = js.native
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  /* CompleteClass */
  override def getLastVisibleRow(): scala.Double = js.native
  /**
    * Returns the element that the mouse events are attached to
    **/
  /* CompleteClass */
  override def getMouseEventTarget(): stdLib.HTMLElement = js.native
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  /* CompleteClass */
  override def getPrintMarginColumn(): scala.Boolean = js.native
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollBottomRow(): scala.Double = js.native
  /**
    * {:EditSession.getScrollLeft}
    **/
  /* CompleteClass */
  override def getScrollLeft(): scala.Double = js.native
  /**
    * {:EditSession.getScrollTop}
    **/
  /* CompleteClass */
  override def getScrollTop(): scala.Double = js.native
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  /* CompleteClass */
  override def getScrollTopRow(): scala.Double = js.native
  /**
    * Returns `true` if the gutter is being shown.
    **/
  /* CompleteClass */
  override def getShowGutter(): scala.Boolean = js.native
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  /* CompleteClass */
  override def getShowInvisibles(): scala.Boolean = js.native
  /**
    * Returns whether the print margin is being shown or not.
    **/
  /* CompleteClass */
  override def getShowPrintMargin(): scala.Boolean = js.native
  /**
    * Returns the element to which the hidden text area is added.
    **/
  /* CompleteClass */
  override def getTextAreaContainer(): stdLib.HTMLElement = js.native
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  /* CompleteClass */
  override def getTheme(): java.lang.String = js.native
  /**
    * Hides the current composition.
    **/
  /* CompleteClass */
  override def hideComposition(): scala.Unit = js.native
  /**
    * Hides the cursor icon.
    **/
  /* CompleteClass */
  override def hideCursor(): scala.Unit = js.native
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def isScrollableBy(deltaX: scala.Double, deltaY: scala.Double): scala.Boolean = js.native
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  /* CompleteClass */
  override def onResize(force: scala.Boolean, gutterWidth: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  /* CompleteClass */
  override def removeGutterDecoration(): scala.Unit = js.native
  /* CompleteClass */
  override def screenToTextCoordinates(left: scala.Double, top: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  /* CompleteClass */
  override def scrollBy(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  /* CompleteClass */
  override def scrollCursorIntoView(): scala.Unit = js.native
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  /* CompleteClass */
  override def scrollToLine(line: scala.Double, center: scala.Boolean, animate: scala.Boolean, callback: js.Function): scala.Unit = js.native
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  /* CompleteClass */
  override def scrollToRow(row: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToX(scrollLeft: scala.Double): scala.Double = js.native
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  /* CompleteClass */
  override def scrollToY(scrollTop: scala.Double): scala.Double = js.native
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  /* CompleteClass */
  override def setAnimatedScroll(shouldAnimate: scala.Boolean): scala.Unit = js.native
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  /* CompleteClass */
  override def setAnnotations(annotations: js.Array[_]): scala.Unit = js.native
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  /* CompleteClass */
  override def setCompositionText(text: java.lang.String): scala.Unit = js.native
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  /* CompleteClass */
  override def setHScrollBarAlwaysVisible(alwaysVisible: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  /* CompleteClass */
  override def setPadding(padding: scala.Double): scala.Unit = js.native
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  /* CompleteClass */
  override def setPrintMarginColumn(showPrintMargin: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setScrollMargin(top: scala.Double, bottom: scala.Double, left: scala.Double, right: scala.Double): scala.Unit = js.native
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  /* CompleteClass */
  override def setSession(session: braceLib.braceMod.AceAjaxNs.IEditSession): scala.Unit = js.native
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  /* CompleteClass */
  override def setShowGutter(show: scala.Boolean): scala.Unit = js.native
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  /* CompleteClass */
  override def setShowInvisibles(showInvisibles: scala.Boolean): scala.Unit = js.native
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  /* CompleteClass */
  override def setShowPrintMargin(showPrintMargin: scala.Boolean): scala.Unit = js.native
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def setStyle(style: java.lang.String): scala.Unit = js.native
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  /* CompleteClass */
  override def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
    * undefined
    * @param position
    **/
  /* CompleteClass */
  override def showComposition(position: scala.Double): scala.Unit = js.native
  /**
    * Shows the cursor icon.
    **/
  /* CompleteClass */
  override def showCursor(): scala.Unit = js.native
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  /* CompleteClass */
  override def textToScreenCoordinates(row: scala.Double, column: scala.Double): js.Any = js.native
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  /* CompleteClass */
  override def unsetStyle(style: java.lang.String): scala.Unit = js.native
  /**
    * Schedules an update to all the back markers in the document.
    **/
  /* CompleteClass */
  override def updateBackMarkers(): scala.Unit = js.native
  /**
    * Redraw breakpoints.
    **/
  /* CompleteClass */
  override def updateBreakpoints(): scala.Unit = js.native
  /**
    * Updates the cursor icon.
    **/
  /* CompleteClass */
  override def updateCursor(): scala.Unit = js.native
  /**
    * Updates the font size.
    **/
  /* CompleteClass */
  override def updateFontSize(): scala.Unit = js.native
  /**
    * Schedules an update to all the front markers in the document.
    **/
  /* CompleteClass */
  override def updateFrontMarkers(): scala.Unit = js.native
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  /* CompleteClass */
  override def updateFull(force: scala.Boolean): scala.Unit = js.native
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  /* CompleteClass */
  override def updateLines(firstRow: scala.Double, lastRow: scala.Double): scala.Unit = js.native
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  /* CompleteClass */
  override def updateText(): scala.Unit = js.native
  /**
    * Blurs the current container.
    **/
  /* CompleteClass */
  override def visualizeBlur(): scala.Unit = js.native
  /**
    * Focuses the current container.
    **/
  /* CompleteClass */
  override def visualizeFocus(): scala.Unit = js.native
}

