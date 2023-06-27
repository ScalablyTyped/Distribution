package typings.codemirrorView.mod

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Widgets added to the content are described by subclasses of this
class. Using a description object like that makes it possible to
delay creating of the DOM structure for a widget until it is
needed, and to avoid redrawing widgets even if the decorations
that define them are recreated.
*/
/* note: abstract class */ @JSImport("@codemirror/view", "WidgetType")
@js.native
open class WidgetType () extends StObject {
  
  /**
    Override the way screen coordinates for positions at/in the
    widget are found. `pos` will be the offset into the widget, and
    `side` the side of the position that is being queried—less than
    zero for before, greater than zero for after, and zero for
    directly at that position.
    */
  def coordsAt(dom: HTMLElement, pos: Double, side: Double): Rect | Null = js.native
  
  /**
    This is called when the an instance of the widget is removed
    from the editor view.
    */
  def destroy(dom: HTMLElement): Unit = js.native
  
  /**
    Compare this instance to another instance of the same type.
    (TypeScript can't express this, but only instances of the same
    specific class will be passed to this method.) This is used to
    avoid redrawing widgets when they are replaced by a new
    decoration of the same type. The default implementation just
    returns `false`, which will cause new instances of the widget to
    always be redrawn.
    */
  def eq(widget: WidgetType): Boolean = js.native
  
  /**
    The estimated height this widget will have, to be used when
    estimating the height of content that hasn't been drawn. May
    return -1 to indicate you don't know. The default implementation
    returns -1.
    */
  def estimatedHeight: Double = js.native
  
  /**
    Can be used to configure which kinds of events inside the widget
    should be ignored by the editor. The default is to ignore all
    events.
    */
  def ignoreEvent(event: Event): Boolean = js.native
  
  /**
    For inline widgets that are displayed inline (as opposed to
    `inline-block`) and introduce line breaks (through `<br>` tags
    or textual newlines), this must indicate the amount of line
    breaks they introduce. Defaults to 0.
    */
  def lineBreaks: Double = js.native
  
  /**
    Build the DOM structure for this widget instance.
    */
  def toDOM(view: EditorView): HTMLElement = js.native
  
  /**
    Update a DOM element created by a widget of the same type (but
    different, non-`eq` content) to reflect this widget. May return
    true to indicate that it could update, false to indicate it
    couldn't (in which case the widget will be redrawn). The default
    implementation just returns false.
    */
  def updateDOM(dom: HTMLElement, view: EditorView): Boolean = js.native
}
