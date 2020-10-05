package typings.d3Shape.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkRadial_[This, LinkDatum, NodeDatum] extends js.Object {
  /**
    * Generates a radial link for the given arguments.
    *
    * IMPORTANT: If the rendering context of the radial link generator is null,
    * then the link is returned as a path data string.
    *
    * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
    * All arguments passed into this function, will be passed to the accessor functions of the generator.
    *
    * @param d The datum for which the link is to be generated.
    */
  def apply(d: LinkDatum, args: js.Any*): String | Null = js.native
  /**
    * Returns the current angle accessor, which defaults to a function accepting an number array
    * as its argument an returning the first element of the array.
    */
  def angle(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the angle accessor to the specified function and returns this radial link generator.
    * The angle is stated in radians, with 0 at -y (12 o’clock).
    *
    * @param angle Angle accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as its first argument a node object followed by all additional arguments that were passed into the radial link generator.
    */
  def angle(angle: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context to null and returns this radial link generator.
    *
    * A path data string representing the generated radial link will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  def context(context: Null): this.type = js.native
  /**
    * Sets the rendering context and returns this radial link generator.
    *
    * If the context is not null, then the generated radial area is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Returns the current radius accessor, which defaults to a function accepting an number array
    * as its argument an returning the second element of the array.
    */
  def radius(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the radius accessor to the specified function and returns this radial link generator.
    * The radius is measured as the distance from the origin ⟨0,0⟩.
    *
    * @param radius Radius accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as its first argument a node object followed by all additional arguments that were passed into the radial link generator.
    */
  def radius(radius: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Returns the current source node accessor function.
    * The default source accessor function returns a two element array [x, y].
    */
  def source(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
  /**
    * Sets the source accessor to the specified function and returns this radial link generator.
    *
    * @param source Source node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the radial link generator. The default target accessor function returns a two element array [x, y].
    */
  def source(source: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
  /**
    * Returns the current target node accessor function.
    * The default target accessor function returns a two element array [x, y].
    */
  def target(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
  /**
    * Sets the target accessor to the specified function and returns this radial link generator.
    *
    * @param target Target node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the radial link generator. The default target accessor function returns a two element array [x, y].
    */
  def target(target: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
}

