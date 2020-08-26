package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pie_[This, Datum] extends js.Object {
  /**
    * Generates a pie for the given array of data, returning an array of objects representing each datum’s arc angles.
    * Any additional arguments are arbitrary; they are simply propagated to the pie generator’s accessor functions along with the this object.
    * The length of the returned array is the same as data, and each element i in the returned array corresponds to the element i in the input data.
    *
    * This representation is designed to work with the arc generator’s default startAngle, endAngle and padAngle accessors.
    * The angular units are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
    * you should specify angles in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum], args: js.Any*): js.Array[PieArcDatum[Datum]] = js.native
  /**
    * Returns the current end angle accessor, which defaults to a function returning a constant 2*pi.
    */
  def endAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the overall end angle of the pie to the specified function and returns this pie generator.
    *
    * The default end angle is 2*pi.
    *
    * The end angle here means the overall end angle of the pie, i.e., the end angle of the last arc.
    * The end angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
    * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    *
    * The value of the end angle is constrained to startAngle ± τ, such that |endAngle - startAngle| ≤ τ.
    *
    * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
    */
  def endAngle(
    angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the overall end angle of the pie to the specified number and returns this pie generator.
    *
    * The default end angle is 2*pi.
    *
    * The end angle here means the overall end angle of the pie, i.e., the end angle of the last arc.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
    * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    *
    * The value of the end angle is constrained to startAngle ± τ, such that |endAngle - startAngle| ≤ τ.
    *
    * @param angle A constant angle.
    */
  def endAngle(angle: Double): this.type = js.native
  /**
    * Returns the current pad angle accessor, which defaults to a function returning a constant zero.
    */
  def padAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the pad angle to the specified function and returns this pie generator.
    *
    * The pad angle here means the angular separation between each adjacent arc.
    * The total amount of padding reserved is the specified angle times the number of elements in the input data array, and at most |endAngle - startAngle|;
    * the remaining space is then divided proportionally by value such that the relative area of each arc is preserved.
    * The pad angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator, you should specify an angle in radians.
    *
    * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
    */
  def padAngle(
    angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the pad angle to the specified number and returns this pie generator.
    *
    * The pad angle here means the angular separation between each adjacent arc.
    * The total amount of padding reserved is the specified angle times the number of elements in the input data array, and at most |endAngle - startAngle|;
    * the remaining space is then divided proportionally by value such that the relative area of each arc is preserved.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator, you should specify an angle in radians.
    *
    * @param angle A constant angle.
    */
  def padAngle(angle: Double): this.type = js.native
  /**
    * Returns the current data comparator, which defaults to null.
    */
  def sort(): (js.Function2[/* a */ Datum, /* b */ Datum, Double]) | Null = js.native
  /**
    * Sets the data comparator to the specified function and returns this pie generator.
    *
    * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
    * Otherwise, the data is sorted according to the data comparator, and the resulting order is used. Setting the data comparator implicitly sets the value comparator to null.
    *
    * Sorting does not affect the order of the generated arc array which is always in the same order as the input data array; it merely affects the computed angles of each arc.
    * The first arc starts at the start angle and the last arc ends at the end angle.
    *
    * @param comparator A compare function takes two arguments a and b, each elements from the input data array.
    * If the arc for a should be before the arc for b, then the comparator must return a number less than zero;
    * if the arc for a should be after the arc for b, then the comparator must return a number greater than zero;
    * returning zero means that the relative order of a and b is unspecified.
    */
  def sort(comparator: js.Function2[/* a */ Datum, /* b */ Datum, Double]): this.type = js.native
  /**
    * Sets the data comparator to null and returns this pie generator.
    *
    * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
    *
    * @param comparator null, to set the pie generator to use the original input order or use the sortValues comparator, if any.
    */
  def sort(comparator: Null): this.type = js.native
  /**
    * Returns the current value comparator, which defaults to descending value.
    */
  def sortValues(): (js.Function2[/* a */ Double, /* b */ Double, Double]) | Null = js.native
  /**
    * Sets the value comparator to the specified function and returns this pie generator.
    *
    * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
    * Otherwise, the data is sorted according to the data comparator, and the resulting order is used.
    * Setting the value comparator implicitly sets the data comparator to null.
    *
    * Sorting does not affect the order of the generated arc array which is always in the same order as the input data array;
    * it merely affects the computed angles of each arc. The first arc starts at the start angle and the last arc ends at the end angle.
    *
    * @param comparator The value comparator takes two arguments a and b which are values derived from the input data array using the value accessor, not the data elements.
    * If the arc for a should be before the arc for b, then the comparator must return a number less than zero;
    * if the arc for a should be after the arc for b, then the comparator must return a number greater than zero; returning zero means that the relative order of a and b is unspecified.
    */
  def sortValues(comparator: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
  /**
    * Sets the value comparator to null and returns this pie generator.
    *
    * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
    *
    * @param comparator null, to set the pie generator to use the original input order or use the data comparator, if any.
    */
  def sortValues(comparator: Null): this.type = js.native
  /**
    * Returns the current start angle accessor, which defaults to a function returning a constant zero.
    */
  def startAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the overall start angle of the pie to the specified function and returns this pie generator.
    *
    * The default start angle is zero.
    *
    * The start angle here means the overall start angle of the pie, i.e., the start angle of the first arc.
    * The start angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
    * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    *
    * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
    */
  def startAngle(
    angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the overall start angle of the pie to the specified number and returns this pie generator.
    *
    * The default start angle is zero.
    *
    * The start angle here means the overall start angle of the pie, i.e., the start angle of the first arc.
    * The start angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
    * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
    * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    *
    * @param angle A constant angle.
    */
  def startAngle(angle: Double): this.type = js.native
  /**
    * Returns the current value accessor, which defaults to a function returning the first argument passed into it.
    * The default value accessor assumes that the input data are numbers, or that they are coercible to numbers using valueOf.
    */
  def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the value accessor to use the specified function and returns this pie generator.
    *
    * When a pie is generated, the value accessor will be invoked for each element in the input data array.
    * The default value accessor assumes that the input data are numbers, or that they are coercible to numbers using valueOf.
    * If your data are not simply numbers, then you should specify an accessor that returns the corresponding numeric value for a given datum.
    *
    * @param value A value accessor function, which is invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
    * It returns a numeric value.
    */
  def value(value: js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets the value accessor to use the specified constant number and returns this pie generator.
    *
    * @param value Constant value to be used.
    */
  def value(value: Double): this.type = js.native
}

