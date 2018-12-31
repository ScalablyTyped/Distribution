package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRenderer extends js.Object {
  var characterWidth: scala.Double
  var lineHeight: scala.Double
  var scroller: js.Any
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def addGutterDecoration(): scala.Unit
  /**
    * Adjusts the wrap limit, which is the number of characters that can fit within the width of the edit area on screen.
    **/
  def adjustWrapLimit(): scala.Unit
  /**
    * Destroys the text and cursor layers for this renderer.
    **/
  def destroy(): scala.Unit
  /**
    * Returns whether an animated scroll happens or not.
    **/
  def getAnimatedScroll(): scala.Boolean
  /**
    * Returns the root element containing this renderer.
    **/
  def getContainerElement(): stdLib.HTMLElement
  /**
    * Returns the index of the first fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getFirstFullyVisibleRow(): scala.Double
  /**
    * [Returns the index of the first visible row.]{: #VirtualRenderer.getFirstVisibleRow}
    **/
  def getFirstVisibleRow(): scala.Double
  /**
    * Returns whether the horizontal scrollbar is set to be always visible.
    **/
  def getHScrollBarAlwaysVisible(): scala.Boolean
  /**
    * Returns the index of the last fully visible row. "Fully" here means that the characters in the row are not truncated; that the top and the bottom of the row are on the screen.
    **/
  def getLastFullyVisibleRow(): scala.Double
  /**
    * [Returns the index of the last visible row.]{: #VirtualRenderer.getLastVisibleRow}
    **/
  def getLastVisibleRow(): scala.Double
  /**
    * Returns the element that the mouse events are attached to
    **/
  def getMouseEventTarget(): stdLib.HTMLElement
  /**
    * Returns whether the print margin column is being shown or not.
    **/
  def getPrintMarginColumn(): scala.Boolean
  /**
    * Returns the last visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollBottomRow(): scala.Double
  /**
    * {:EditSession.getScrollLeft}
    **/
  def getScrollLeft(): scala.Double
  /**
    * {:EditSession.getScrollTop}
    **/
  def getScrollTop(): scala.Double
  /**
    * Returns the first visible row, regardless of whether it's fully visible or not.
    **/
  def getScrollTopRow(): scala.Double
  /**
    * Returns `true` if the gutter is being shown.
    **/
  def getShowGutter(): scala.Boolean
  /**
    * Returns whether invisible characters are being shown or not.
    **/
  def getShowInvisibles(): scala.Boolean
  /**
    * Returns whether the print margin is being shown or not.
    **/
  def getShowPrintMargin(): scala.Boolean
  /**
    * Returns the element to which the hidden text area is added.
    **/
  def getTextAreaContainer(): stdLib.HTMLElement
  /**
    * [Returns the path of the current theme.]{: #VirtualRenderer.getTheme}
    **/
  def getTheme(): java.lang.String
  /**
    * Hides the current composition.
    **/
  def hideComposition(): scala.Unit
  /**
    * Hides the cursor icon.
    **/
  def hideCursor(): scala.Unit
  /**
    * Returns `true` if you can still scroll by either parameter; in other words, you haven't reached the end of the file or line.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def isScrollableBy(deltaX: scala.Double, deltaY: scala.Double): scala.Boolean
  /**
    * [Triggers a resize of the editor.]{: #VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    * @param gutterWidth The width of the gutter in pixels
    * @param width The width of the editor in pixels
    * @param height The hiehgt of the editor, in pixels
    **/
  def onResize(force: scala.Boolean, gutterWidth: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * Deprecated; (moved to [[EditSession]])
    **/
  def removeGutterDecoration(): scala.Unit
  def screenToTextCoordinates(left: scala.Double, top: scala.Double): scala.Unit
  /**
    * Scrolls the editor across both x- and y-axes.
    * @param deltaX The x value to scroll by
    * @param deltaY The y value to scroll by
    **/
  def scrollBy(deltaX: scala.Double, deltaY: scala.Double): scala.Unit
  /**
    * Scrolls the cursor into the first visibile area of the editor
    **/
  def scrollCursorIntoView(): scala.Unit
  /**
    * Gracefully scrolls the editor to the row indicated.
    * @param line A line number
    * @param center If `true`, centers the editor the to indicated line
    * @param animate If `true` animates scrolling
    * @param callback Function to be called after the animation has finished
    **/
  def scrollToLine(line: scala.Double, center: scala.Boolean, animate: scala.Boolean, callback: js.Function): scala.Unit
  /**
    * Gracefully scrolls from the top of the editor to the row indicated.
    * @param row A row id
    **/
  def scrollToRow(row: scala.Double): scala.Unit
  /**
    * Scrolls the editor across the x-axis to the pixel indicated.
    * @param scrollLeft The position to scroll to
    **/
  def scrollToX(scrollLeft: scala.Double): scala.Double
  /**
    * Scrolls the editor to the y pixel indicated.
    * @param scrollTop The position to scroll to
    **/
  def scrollToY(scrollTop: scala.Double): scala.Double
  /**
    * Identifies whether you want to have an animated scroll or not.
    * @param shouldAnimate Set to `true` to show animated scrolls
    **/
  def setAnimatedScroll(shouldAnimate: scala.Boolean): scala.Unit
  /**
    * Sets annotations for the gutter.
    * @param annotations An array containing annotations
    **/
  def setAnnotations(annotations: js.Array[_]): scala.Unit
  /**
    * Sets the inner text of the current composition to `text`.
    * @param text A string of text to use
    **/
  def setCompositionText(text: java.lang.String): scala.Unit
  /**
    * Identifies whether you want to show the horizontal scrollbar or not.
    * @param alwaysVisible Set to `true` to make the horizontal scroll bar visible
    **/
  def setHScrollBarAlwaysVisible(alwaysVisible: scala.Boolean): scala.Unit
  /**
    * Sets the padding for all the layers.
    * @param padding A new padding value (in pixels)
    **/
  def setPadding(padding: scala.Double): scala.Unit
  /**
    * Identifies whether you want to show the print margin column or not.
    * @param showPrintMargin Set to `true` to show the print margin column
    **/
  def setPrintMarginColumn(showPrintMargin: scala.Boolean): scala.Unit
  def setScrollMargin(top: scala.Double, bottom: scala.Double, left: scala.Double, right: scala.Double): scala.Unit
  /**
    * Associates the renderer with an [[EditSession `EditSession`]].
    **/
  def setSession(session: IEditSession): scala.Unit
  /**
    * Identifies whether you want to show the gutter or not.
    * @param show Set to `true` to show the gutter
    **/
  def setShowGutter(show: scala.Boolean): scala.Unit
  /**
    * Identifies whether you want to show invisible characters or not.
    * @param showInvisibles Set to `true` to show invisibles
    **/
  def setShowInvisibles(showInvisibles: scala.Boolean): scala.Unit
  /**
    * Identifies whether you want to show the print margin or not.
    * @param showPrintMargin Set to `true` to show the print margin
    **/
  def setShowPrintMargin(showPrintMargin: scala.Boolean): scala.Unit
  /**
    * [Adds a new class, `style`, to the editor.]{: #VirtualRenderer.setStyle}
    * @param style A class name
    **/
  def setStyle(style: java.lang.String): scala.Unit
  /**
    * [Sets a new theme for the editor. `theme` should exist, and be a directory path, like `ace/theme/textmate`.]{: #VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  def setTheme(theme: java.lang.String): scala.Unit
  /**
    * undefined
    * @param position
    **/
  def showComposition(position: scala.Double): scala.Unit
  /**
    * Shows the cursor icon.
    **/
  def showCursor(): scala.Unit
  /**
    * Returns an object containing the `pageX` and `pageY` coordinates of the document position.
    * @param row The document row position
    * @param column The document column position
    **/
  def textToScreenCoordinates(row: scala.Double, column: scala.Double): js.Any
  /**
    * [Removes the class `style` from the editor.]{: #VirtualRenderer.unsetStyle}
    * @param style A class name
    **/
  def unsetStyle(style: java.lang.String): scala.Unit
  /**
    * Schedules an update to all the back markers in the document.
    **/
  def updateBackMarkers(): scala.Unit
  /**
    * Redraw breakpoints.
    **/
  def updateBreakpoints(): scala.Unit
  /**
    * Updates the cursor icon.
    **/
  def updateCursor(): scala.Unit
  /**
    * Updates the font size.
    **/
  def updateFontSize(): scala.Unit
  /**
    * Schedules an update to all the front markers in the document.
    **/
  def updateFrontMarkers(): scala.Unit
  /**
    * Triggers a full update of all the layers, for all the rows.
    * @param force If `true`, forces the changes through
    **/
  def updateFull(force: scala.Boolean): scala.Unit
  /**
    * Triggers a partial update of the text, from the range given by the two parameters.
    * @param firstRow The first row to update
    * @param lastRow The last row to update
    **/
  def updateLines(firstRow: scala.Double, lastRow: scala.Double): scala.Unit
  /**
    * Triggers a full update of the text, for all the rows.
    **/
  def updateText(): scala.Unit
  /**
    * Blurs the current container.
    **/
  def visualizeBlur(): scala.Unit
  /**
    * Focuses the current container.
    **/
  def visualizeFocus(): scala.Unit
}

