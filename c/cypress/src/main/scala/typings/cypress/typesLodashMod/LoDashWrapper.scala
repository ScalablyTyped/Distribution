package typings.cypress.typesLodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prototype.commit
// prototype.reverse
// prototype.toJSON
// prototype.toString
// prototype.value
// prototype.valueOf
@js.native
trait LoDashWrapper[TValue] extends js.Object {
  /**
    * @see _.bindAll
    */
  def bindAll(methodNames: Many[String]*): this.type = js.native
  /**
    * Executes the chained sequence and returns the wrapped result.
    *
    * @return Returns the new lodash wrapper instance.
    */
  def commit(): this.type = js.native
  /**
    * @see _.forEach
    */
  def each(`this`: LoDashWrapper[js.UndefOr[String | Null]]): this.type = js.native
  def each(`this`: LoDashWrapper[js.UndefOr[String | Null]], iteratee: StringIterator[_]): this.type = js.native
  /**
    * @see _.forEachRight
    */
  def eachRight(`this`: LoDashWrapper[js.UndefOr[String | Null]]): this.type = js.native
  def eachRight(`this`: LoDashWrapper[js.UndefOr[String | Null]], iteratee: StringIterator[_]): this.type = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("eachRight")
  def eachRight_T[T](`this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]]): this.type = js.native
  @JSName("eachRight")
  def eachRight_T[T](
    `this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, _]) | (ListIterator[T, _])
  ): this.type = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("eachRight")
  def eachRight_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  @JSName("eachRight")
  def eachRight_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forEach
    */
  @JSName("each")
  def each_T[T](`this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]]): this.type = js.native
  @JSName("each")
  def each_T[T](
    `this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, _]) | (ListIterator[T, _])
  ): this.type = js.native
  /**
    * @see _.forEach
    */
  @JSName("each")
  def each_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  @JSName("each")
  def each_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.flip
    */
  def flip(): this.type = js.native
  /**
    * @see _.forEach
    */
  def forEach(`this`: LoDashWrapper[js.UndefOr[String | Null]]): this.type = js.native
  def forEach(`this`: LoDashWrapper[js.UndefOr[String | Null]], iteratee: StringIterator[_]): this.type = js.native
  /**
    * @see _.forEachRight
    */
  def forEachRight(`this`: LoDashWrapper[js.UndefOr[String | Null]]): this.type = js.native
  def forEachRight(`this`: LoDashWrapper[js.UndefOr[String | Null]], iteratee: StringIterator[_]): this.type = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("forEachRight")
  def forEachRight_T[T](`this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]]): this.type = js.native
  @JSName("forEachRight")
  def forEachRight_T[T](
    `this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, _]) | (ListIterator[T, _])
  ): this.type = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("forEachRight")
  def forEachRight_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forEach
    */
  @JSName("forEach")
  def forEach_T[T](`this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]]): this.type = js.native
  @JSName("forEach")
  def forEach_T[T](
    `this`: LoDashWrapper[js.UndefOr[js.Array[T] | List[T] | Null]],
    iteratee: (ArrayIterator[T, _]) | (ListIterator[T, _])
  ): this.type = js.native
  /**
    * @see _.forEach
    */
  @JSName("forEach")
  def forEach_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  @JSName("forEach")
  def forEach_T_Object[T /* <: js.Object */](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forIn
    */
  def forIn[T](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  def forIn[T](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forInRight
    */
  def forInRight[T](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  def forInRight[T](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forOwn
    */
  def forOwn[T](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  def forOwn[T](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.forOwnRight
    */
  def forOwnRight[T](`this`: LoDashWrapper[js.UndefOr[T | Null]]): this.type = js.native
  def forOwnRight[T](`this`: LoDashWrapper[js.UndefOr[T | Null]], iteratee: ObjectIterator[T, _]): this.type = js.native
  /**
    * @see _.once
    */
  def once(): this.type = js.native
  /**
    * @see _.pullAllBy
    */
  def pullAllBy[T](`this`: LoDashWrapper[List[T]]): this.type = js.native
  def pullAllBy[T](`this`: LoDashWrapper[List[T]], values: List[T]): this.type = js.native
  def pullAllBy[T](`this`: LoDashWrapper[List[T]], values: List[T], iteratee: ValueIteratee[T]): this.type = js.native
  /**
    * @see _.pullAllBy
    */
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](`this`: LoDashWrapper[List[T1]], values: List[T2], iteratee: ValueIteratee[T1 | T2]): this.type = js.native
  /**
    * @see _.pullAllWith
    */
  def pullAllWith[T](`this`: LoDashWrapper[List[T]]): this.type = js.native
  def pullAllWith[T](`this`: LoDashWrapper[List[T]], values: List[T]): this.type = js.native
  def pullAllWith[T](`this`: LoDashWrapper[List[T]], values: List[T], comparator: Comparator[T]): this.type = js.native
  /**
    * @see _.pullAllWith
    */
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](`this`: LoDashWrapper[List[T1]], values: List[T2], comparator: Comparator2[T1, T2]): this.type = js.native
  /**
    * @see _.pullAt
    */
  def pullAt(indexes: Many[Double]*): this.type = js.native
  /**
    * Reverses the wrapped array so the first element becomes the last, the second element becomes the second to
    * last, and so on.
    *
    * Note: This method mutates the wrapped array.
    *
    * @return Returns the new reversed lodash wrapper instance.
    */
  def reverse(): this.type = js.native
  /**
    * @see _.tap
    */
  def tap(interceptor: js.Function1[/* value */ TValue, Unit]): this.type = js.native
  /**
    * @see _.value
    */
  def toJSON(): TValue = js.native
  /**
    * Executes the chained sequence to extract the unwrapped value.
    *
    * @alias _.toJSON, _.valueOf
    *
    * @return Returns the resolved unwrapped value.
    */
  def value(): TValue = js.native
}

