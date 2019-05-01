package typings
package checkDashTypesLib.checkDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckType extends js.Object {
  @JSName("arrayLike")
  var arrayLike_Original: ArrayLikeFunction = js.native
  /* Array predicates */
  @JSName("array")
  var array_Original: ArrayFunction = js.native
  @JSName("assert")
  var assert_Original: AssertFunction = js.native
  @JSName("iterable")
  var iterable_Original: IterableFunction = js.native
  @JSName("maybe")
  var maybe_Original: CheckType with MaybeFunction = js.native
  /* Modifiers (some of them in their respected sections) */
  @JSName("not")
  var not_Original: CheckType with NegationFunction = js.native
  /* Object predicates */
  @JSName("object")
  var object_Original: ObjectFunction = js.native
  def all(arr: js.Array[scala.Boolean]): scala.Boolean = js.native
  def all(arr: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Boolean = js.native
  def any(arr: js.Array[scala.Boolean]): scala.Boolean = js.native
  def any(arr: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Boolean = js.native
  /* Batch operations */
  /**
    * Applying predicate to every element of array and returning resulting array
    *
    * Example: apply([2, 3, "four"], check.number) => [true, true, false]
    */
  @JSName("apply")
  def apply[T](arr: js.Array[_], predicate: js.Function1[/* repeated */ js.Any, T]): js.Array[T] = js.native
  /* Array predicates */
  def array(a: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def arrayLike(a: js.Any): /* is std.ArrayLike<any> */ scala.Boolean = js.native
  def assert[T](possibleFalsy: T): T = js.native
  def assert[T](possibleFalsy: T, message: java.lang.String): T = js.native
  def assert[T](possibleFalsy: T, message: java.lang.String, errorType: checkDashTypesLib.Anon_Args): T = js.native
  def assigned(a: js.Any): scala.Boolean = js.native
  /**
    * Excluding a and b. Any order of a, b
    */
  def between(num: scala.Double, a: scala.Double, b: scala.Double): scala.Boolean = js.native
  /* Boolean predicates */
  def boolean(a: js.Any): /* is boolean */ scala.Boolean = js.native
  def contains(a: java.lang.String, substring: java.lang.String): scala.Boolean = js.native
  /* Date predicates */
  def date(a: js.Any): /* is std.Date */ scala.Boolean = js.native
  def emptyArray(a: js.Array[_]): scala.Boolean = js.native
  def emptyObject(a: js.Object): scala.Boolean = js.native
  def emptyString(a: java.lang.String): scala.Boolean = js.native
  /* General predicates */
  def equal(a: js.Any, b: js.Any): scala.Boolean = js.native
  def even(num: scala.Double): scala.Boolean = js.native
  /* Function predicates */
  def function(a: js.Any): scala.Boolean = js.native
  def greater(num: scala.Double, greaterThan: scala.Double): scala.Boolean = js.native
  def greaterOrEqual(num: scala.Double, greaterOrEqual: scala.Double): scala.Boolean = js.native
  def hasLength(a: js.Any, length: scala.Double): scala.Boolean = js.native
  /**
    * Including a, b. Any order of a, b
    */
  def inRange(num: scala.Double, a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def includes(a: js.Array[_], value: js.Any): scala.Boolean = js.native
  def infinity(a: js.Any): scala.Boolean = js.native
  /**
    * Checking via instanceof, fallback constructor.name and .toString()
    */
  def instance[T /* <: js.Object */](a: js.Any, prototype: T): /* is T */ scala.Boolean = js.native
  /**
    * Checking via instanceof
    */
  def instanceStrict[T /* <: js.Object */](a: js.Any, prototype: T): /* is T */ scala.Boolean = js.native
  def integer(a: js.Any): /* is number */ scala.Boolean = js.native
  def iterable(a: js.Any): /* is std.Iterable<any> */ scala.Boolean = js.native
  def less(num: scala.Double, lessThan: scala.Double): scala.Boolean = js.native
  def lessOrEqual(num: scala.Double, lessOrEqual: scala.Double): scala.Boolean = js.native
  /**
    * Duck type checking. Structural in other words. Checking if a has all properties of duck
    */
  def like[T /* <: js.Object */](a: js.Any, duck: T): /* is T */ scala.Boolean = js.native
  // Also some difficulties with returning object with only defined in predicates object propertis.
  // Will gladly accept help or ideas. Now using any for returned object
  def map[T /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    arr: T,
    predicates: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]: (args : ...any): boolean}
    */ checkDashTypesLib.checkDashTypesLibStrings.CheckType with js.Any
    ]
  ): stdLib.Partial[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]: any}
    */ checkDashTypesLib.checkDashTypesLibStrings.CheckType with js.Any
  ] = js.native
  def `match`(a: java.lang.String, b: stdLib.RegExp): scala.Boolean = js.native
  def maybe[T](`val`: T): scala.Boolean | T = js.native
  def negative(num: scala.Double): scala.Boolean = js.native
  def nonEmptyArray(a: js.Array[_]): scala.Boolean = js.native
  def nonEmptyObject(a: js.Object): scala.Boolean = js.native
  def nonEmptyString(a: java.lang.String): scala.Boolean = js.native
  /* Modifiers (some of them in their respected sections) */
  def not(`val`: js.Any): scala.Boolean = js.native
  def `null`(a: js.Any): /* is null */ scala.Boolean = js.native
  /* Number predicates */
  def number(a: js.Any): /* is number */ scala.Boolean = js.native
  /* Object predicates */
  def `object`(a: js.Any): /* is object */ scala.Boolean = js.native
  def odd(num: scala.Double): scala.Boolean = js.native
  def positive(num: scala.Double): scala.Boolean = js.native
  def primitive(a: js.Any): scala.Boolean = js.native
  /* String predicates */
  def string(a: js.Any): /* is string */ scala.Boolean = js.native
  def undefined(a: js.Any): /* is undefined */ scala.Boolean = js.native
  def zero(a: js.Any): scala.Boolean = js.native
}

