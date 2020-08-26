package typings.d3Shape.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol_[This, Datum] extends js.Object {
  /**
    * Generates a symbol for the given arguments.
    *
    * IMPORTANT: If the rendering context of the symbol generator is null,
    * then the symbol is returned as a path data string.
    *
    * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
    * All arguments passed into this function, will be passed to the accessor functions of the generator.
    *
    * For example, with the default settings, no arguments are needed to produce a circle with area 64 square pixels.
    *
    * @param d The datum for which the symbol is to be generated.
    */
  def apply(d: Datum, args: js.Any*): String | Null = js.native
  def apply(d: js.UndefOr[scala.Nothing], args: js.Any*): String | Null = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context to null and returns this symbol generator.
    *
    * A path data string representing the generated symbol will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  def context(context: Null): this.type = js.native
  /**
    * Sets the rendering context and returns this symbol generator.
    *
    * If the context is not null, then the generated symbol is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Returns the current size accessor, which defaults to a function returning a constant value of 64.
    */
  def size(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the size to the specified function and returns this symbol generator.
    *
    * Specifying the size as a function is useful for constructing a scatterplot with a size encoding.
    * If you wish to scale the symbol to fit a given bounding box, rather than by area, try SVG’s getBBox.
    *
    * @param size An accessor function returning a number to be used as a symbol size. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the symbol generator.
    */
  def size(size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the size to the specified number and returns this symbol generator.
    *
    * @param size A fixed size (area in square pixels).
    */
  def size(size: Double): this.type = js.native
  /**
    * Returns the current symbol type accessor, which defaults to a function returning the circle symbol type.
    */
  def `type`(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType] = js.native
  /**
    * Sets the symbol type to the specified function and returns this symbol generator.
    *
    * @param type An accessor function returning a symbol type. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the symbol generator. See symbols for the set of built-in symbol types.
    * To implement a custom symbol type, return an object that implements symbolType.draw.
    */
  def `type`(`type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType]): this.type = js.native
  /**
    * Sets the symbol type to the specified symbol type and returns this symbol generator.
    *
    * @param type A constant symbol type.
    */
  def `type`(`type`: SymbolType): this.type = js.native
}

