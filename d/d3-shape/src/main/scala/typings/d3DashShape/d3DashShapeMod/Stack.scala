package typings.d3DashShape.d3DashShapeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack[This, Datum, Key] extends js.Object {
  /**
    * Generates a stack for the given array of data, returning an array representing each series.
    * The resulting array has one element per series. Each series in then typically passed to an area generator to render an area chart,
    * or used to construct rectangles for a bar chart.
    *
    * Any additional arguments are arbitrary; they are simply propagated to the generator’s accessor functions along with the this object.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum], args: js.Any*): js.Array[Series[Datum, Key]] = js.native
  /**
    * Returns the current keys accessor, which defaults to the empty array.
    */
  def keys(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, js.Array[Key]] = js.native
  /**
    * Sets the keys accessor to the specified function or array and returns this stack generator.
    *
    * A series (layer) is generated for each key. Keys are typically strings, but they may be arbitrary values.
    * The series’ key is passed to the value accessor, along with each data point, to compute the point’s value.
    *
    * @param keys An array of keys.
    */
  def keys(keys: js.Array[Key]): this.type = js.native
  /**
    * Sets the keys accessor to the specified function or array and returns this stack generator.
    *
    * A series (layer) is generated for each key. Keys are typically strings, but they may be arbitrary values.
    * The series’ key is passed to the value accessor, along with each data point, to compute the point’s value.
    *
    * @param keys An accessor function returning the array of keys.
    *             The accessor function is invoked with the "this" context of the Stack generator and passed the same arguments passed into the generator.
    */
  def keys(
    keys: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, js.Array[Key]]
  ): this.type = js.native
  /**
    * Returns the current offset accessor, which defaults to stackOffsetNone; this uses a zero baseline.
    */
  def offset(): js.Function2[/* series */ Series[Datum, Key], /* order */ js.Array[Double], Unit] = js.native
  /**
    * Sets the offset accessor to the specified function and returns this stack generator.
    *
    * @param offset A function which is passed the generated series array and the order index array.
    *               The offset function is then responsible for updating the lower and upper values in the series array to layout the stack.
    */
  def offset(offset: js.Function2[/* series */ Series[Datum, Key], /* order */ js.Array[Double], Unit]): this.type = js.native
  /**
    * Reset the offset to use stackOffsetNone; this uses a zero baseline.
    *
    * @param offset null to set to the default stackOffsetNone.
    */
  @JSName("offset")
  def offset_This(): this.type = js.native
  /**
    * Returns the current order accessor, which defaults to stackOrderNone; this uses the order given by the key accessor.
    */
  def order(): js.Function1[/* series */ Series[Datum, Key], js.Array[Double]] = js.native
  /**
    * Sets the order accessor to the specified array and returns this stack generator.
    *
    * The stack order is computed prior to the offset; thus, the lower value for all points is zero at the time the order is computed.
    * The index attribute for each series is also not set until after the order is computed.
    *
    * @param order An array of numeric indexes representing the stack order.
    */
  def order(order: js.Array[Double]): this.type = js.native
  /**
    * Sets the order accessor to the specified function and returns this stack generator.
    *
    * The stack order is computed prior to the offset; thus, the lower value for all points is zero at the time the order is computed.
    * The index attribute for each series is also not set until after the order is computed.
    *
    * See stack orders for the built-in orders.
    *
    * @param order A function returning a sort order array. It is passed the generated series array and must return an array of numeric indexes representing the stack order.
    */
  def order(order: js.Function1[/* series */ Series[Datum, Key], js.Array[Double]]): this.type = js.native
  /**
    * Reset the order to use stackOrderNone; this uses the order given by the key accessor.
    *
    * @param order null to set to the default stackOrderNone.
    */
  @JSName("order")
  def order_This(): this.type = js.native
  /**
    * Returns the current value accessor, which defaults to a function return the property corresponding to the relevant key from the data element.
    *
    * Thus, by default the stack generator assumes that the input data is an array of objects, with each object exposing named properties with numeric values; see stack for an example.
    */
  def value(): js.Function4[/* d */ Datum, /* key */ Key, /* i */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the value accessor to the specified function and returns this stack generator.
    *
    * @param value A value accessor function which returns the numeric value for a given data element and key combination. The accessor function is invoked for each data element and key being passed
    * the datum, the key, index of the data element in the input data array, and the complete data array.
    */
  def value(
    value: js.Function4[/* d */ Datum, /* key */ Key, /* i */ Double, /* data */ js.Array[Datum], Double]
  ): this.type = js.native
  /**
    * Sets the value accessor to the specified number and returns this stack generator.
    *
    * @param value A constant value.
    */
  def value(value: Double): this.type = js.native
}

@JSImport("d3-shape", "stack")
@js.native
object stack extends js.Object {
  def apply(): Stack[_, StringDictionary[Double], String] = js.native
}

