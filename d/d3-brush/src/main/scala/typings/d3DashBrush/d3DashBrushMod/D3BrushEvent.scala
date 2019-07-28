package typings.d3DashBrush.d3DashBrushMod

import typings.d3DashBrush.d3DashBrushStrings.brush
import typings.d3DashBrush.d3DashBrushStrings.end
import typings.d3DashBrush.d3DashBrushStrings.start
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D3BrushEvent[Datum] extends js.Object {
   // Leave failsafe string type for cases like 'brush.foo'
  /**
    * The current brush selection associated with the event.
    */
  var selection: BrushSelection = js.native
  /**
    * The underlying input event, such as mousemove or touchmove.
    */
  var sourceEvent: js.Any = js.native
  /**
    * The BrushBehavior associated with the event
    */
  @JSName("target")
  var target_Original: BrushBehavior[Datum] = js.native
  /**
    * The event type for the BrushEvent
    */
  var `type`: start | brush | end | String = js.native
  /**
    * Applies the brush to the specified group, which must be a selection of SVG G elements.
    * This function is typically not invoked directly, and is instead invoked via selection.call.
    *
    * For details see: {@link https://github.com/d3/d3-brush#_brush}
    *
    * @param group A D3 selection of SVG G elements.
    * @param args Optional arguments to be passed in.
    */
  /**
    * The BrushBehavior associated with the event
    */
  def target(group: Selection[SVGGElement, Datum, _, _], args: js.Any*): Unit = js.native
}

