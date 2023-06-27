package typings.codemirrorView.mod

import typings.codemirrorState.mod.SelectionRange
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Implementation of [`LayerMarker`](https://codemirror.net/6/docs/ref/#view.LayerMarker) that creates
a rectangle at a given set of coordinates.
*/
@JSImport("@codemirror/view", "RectangleMarker")
@js.native
open class RectangleMarker protected ()
  extends StObject
     with LayerMarker {
  /**
    Create a marker with the given class and dimensions. If `width`
    is null, the DOM element will get no width style.
    */
  def this(className: String, left: Double, top: Double, width: Double, height: Double) = this()
  def this(className: String, left: Double, top: Double, width: Null, height: Double) = this()
  
  /* private */ var adjust: Any = js.native
  
  /* private */ var className: Any = js.native
  
  /**
    Draw the marker to the DOM.
    */
  /* CompleteClass */
  override def draw(): HTMLElement = js.native
  
  /**
    Compare this marker to a marker of the same type. Used to avoid
    unnecessary redraws.
    */
  /* CompleteClass */
  override def eq(other: LayerMarker): Boolean = js.native
  def eq(p: RectangleMarker): Boolean = js.native
  
  /* private */ var height: Any = js.native
  
  /* private */ var left: Any = js.native
  
  /* private */ var top: Any = js.native
  
  @JSName("update")
  def update_MRectangleMarker(elt: HTMLElement, prev: RectangleMarker): Boolean = js.native
  
  /* private */ var width: Any = js.native
}
object RectangleMarker {
  
  @JSImport("@codemirror/view", "RectangleMarker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Create a set of rectangles for the given selection range,
    assigning them theclass`className`. Will create a single
    rectangle for empty ranges, and a set of selection-style
    rectangles covering the range's content (in a bidi-aware
    way) for non-empty ones.
    */
  /* static member */
  inline def forRange(view: EditorView, className: String, range: SelectionRange): js.Array[RectangleMarker] = (^.asInstanceOf[js.Dynamic].applyDynamic("forRange")(view.asInstanceOf[js.Any], className.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Array[RectangleMarker]]
}
