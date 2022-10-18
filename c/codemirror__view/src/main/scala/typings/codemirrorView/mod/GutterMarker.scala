package typings.codemirrorView.mod

import typings.codemirrorState.mod.RangeValue
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A gutter marker represents a bit of information attached to a line
in a specific gutter. Your own custom markers have to extend this
class.
*/
/* note: abstract class */ @JSImport("@codemirror/view", "GutterMarker")
@js.native
open class GutterMarker () extends RangeValue {
  
  /**
    Called if the marker has a `toDOM` method and its representation
    was removed from a gutter.
    */
  def destroy(dom: Node): Unit = js.native
  
  /**
    This property can be used to add CSS classes to the gutter
    element that contains this marker.
    */
  var elementClass: String = js.native
  
  /**
    Compare this marker to another marker of the same type.
    */
  def eq(other: GutterMarker): Boolean = js.native
  
  /**
    Render the DOM node for this marker, if any.
    */
  var toDOM: js.UndefOr[js.Function1[/* view */ EditorView, Node]] = js.native
}
