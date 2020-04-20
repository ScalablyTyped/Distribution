package typings.checkTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.checkTypes.AnonInstantiable
import typings.std.Partial
import typings.std.RegExp
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
  def all(arr: js.Array[Boolean]): Boolean = js.native
  def all(arr: StringDictionary[Boolean]): Boolean = js.native
  def any(arr: js.Array[Boolean]): Boolean = js.native
  def any(arr: StringDictionary[Boolean]): Boolean = js.native
  /* Batch operations */
  /**
    * Applying predicate to every element of array and returning resulting array
    *
    * Example: apply([2, 3, "four"], check.number) => [true, true, false]
    */
  @JSName("apply")
  def apply[T](arr: js.Array[_], predicate: js.Function1[/* repeated */ js.Any, T]): js.Array[T] = js.native
  /* Array predicates */
  def array(a: js.Any): /* is std.Array<any> */ Boolean = js.native
  def arrayLike(a: js.Any): /* is std.ArrayLike<any> */ Boolean = js.native
  def assert[T](possibleFalsy: T): T = js.native
  def assert[T](possibleFalsy: T, message: String): T = js.native
  def assert[T](possibleFalsy: T, message: String, errorType: AnonInstantiable): T = js.native
  def assigned(a: js.Any): Boolean = js.native
  /**
    * Excluding a and b. Any order of a, b
    */
  def between(num: Double, a: Double, b: Double): Boolean = js.native
  /* Boolean predicates */
  def boolean(a: js.Any): /* is boolean */ Boolean = js.native
  def contains(a: String, substring: String): Boolean = js.native
  /* Date predicates */
  def date(a: js.Any): /* is std.Date */ Boolean = js.native
  def emptyArray(a: js.Array[_]): Boolean = js.native
  def emptyObject(a: js.Object): Boolean = js.native
  def emptyString(a: String): Boolean = js.native
  /* General predicates */
  def equal(a: js.Any, b: js.Any): Boolean = js.native
  def even(num: Double): Boolean = js.native
  /* Function predicates */
  def function(a: js.Any): Boolean = js.native
  def greater(num: Double, greaterThan: Double): Boolean = js.native
  def greaterOrEqual(num: Double, greaterOrEqual: Double): Boolean = js.native
  def hasLength(a: js.Any, length: Double): Boolean = js.native
  /**
    * Including a, b. Any order of a, b
    */
  def inRange(num: Double, a: Double, b: Double): Boolean = js.native
  def includes(a: js.Array[_], value: js.Any): Boolean = js.native
  def infinity(a: js.Any): Boolean = js.native
  /**
    * Checking via instanceof, fallback constructor.name and .toString()
    */
  def instance[T /* <: js.Object */](a: js.Any, prototype: T): /* is T */ Boolean = js.native
  /**
    * Checking via instanceof
    */
  def instanceStrict[T /* <: js.Object */](a: js.Any, prototype: T): /* is T */ Boolean = js.native
  def integer(a: js.Any): /* is number */ Boolean = js.native
  def iterable(a: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  def less(num: Double, lessThan: Double): Boolean = js.native
  def lessOrEqual(num: Double, lessOrEqual: Double): Boolean = js.native
  /**
    * Duck type checking. Structural in other words. Checking if a has all properties of duck
    */
  def like[T /* <: js.Object */](a: js.Any, duck: T): /* is T */ Boolean = js.native
  // Also some difficulties with returning object with only defined in predicates object propertis.
  // Will gladly accept help or ideas. Now using any for returned object
  def map[T /* <: StringDictionary[js.Any] */](
    arr: T,
    predicates: Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: (args : ...any): boolean}
    */ typings.checkTypes.checkTypesStrings.CheckType with TopLevel[js.Any]
    ]
  ): Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: any}
    */ typings.checkTypes.checkTypesStrings.CheckType with TopLevel[js.Any]
  ] = js.native
  def `match`(a: String, b: RegExp): Boolean = js.native
  def maybe[T](`val`: T): Boolean | T = js.native
  def negative(num: Double): Boolean = js.native
  def nonEmptyArray(a: js.Array[_]): Boolean = js.native
  def nonEmptyObject(a: js.Object): Boolean = js.native
  def nonEmptyString(a: String): Boolean = js.native
  /* Modifiers (some of them in their respected sections) */
  def not(`val`: js.Any): Boolean = js.native
  def `null`(a: js.Any): /* is null */ Boolean = js.native
  /* Number predicates */
  def number(a: js.Any): /* is number */ Boolean = js.native
  /* Object predicates */
  def `object`(a: js.Any): /* is object */ Boolean = js.native
  def odd(num: Double): Boolean = js.native
  def positive(num: Double): Boolean = js.native
  def primitive(a: js.Any): Boolean = js.native
  /* String predicates */
  def string(a: js.Any): /* is string */ Boolean = js.native
  def undefined(a: js.Any): /* is undefined */ Boolean = js.native
  def zero(a: js.Any): Boolean = js.native
}

