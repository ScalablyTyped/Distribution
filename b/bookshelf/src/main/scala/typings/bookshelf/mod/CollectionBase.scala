package typings.bookshelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lodash.mod.Dictionary
import typings.lodash.mod.DictionaryIterator
import typings.lodash.mod.List
import typings.lodash.mod.ListIterator
import typings.lodash.mod.MemoIterator
import typings.lodash.mod.ObjectIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bookshelf", "CollectionBase")
@js.native
// See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L21
abstract class CollectionBase[T /* <: Model[Any] */] () extends Events[T] {
  def this(models: js.Array[T]) = this()
  def this(models: js.Array[T], options: CollectionOptions[T]) = this()
  def this(models: Unit, options: CollectionOptions[T]) = this()
  
  def add(models: js.Array[StringDictionary[Any] | T]): Collection[T] = js.native
  def add(models: js.Array[StringDictionary[Any] | T], options: CollectionAddOptions): Collection[T] = js.native
  
  def at(index: Double): T = js.native
  
  def countBy(): Dictionary[Double] = js.native
  def countBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Dictionary[Double] = js.native
  def countBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): Dictionary[Double] = js.native
  def countBy(predicate: String): Dictionary[Double] = js.native
  def countBy(predicate: String, thisArg: Any): Dictionary[Double] = js.native
  def countBy(predicate: Unit, thisArg: Any): Dictionary[Double] = js.native
  def countBy[R /* <: js.Object */](predicate: R): Dictionary[Double] = js.native
  @JSName("countBy")
  def countBy_R_Object[R /* <: js.Object */](): Dictionary[Double] = js.native
  
  def every(): Boolean = js.native
  def every(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def every(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): Boolean = js.native
  def every(predicate: String): Boolean = js.native
  def every(predicate: String, thisArg: Any): Boolean = js.native
  def every(predicate: Unit, thisArg: Any): Boolean = js.native
  def every[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("every")
  def every_R_Object[R /* <: js.Object */](): Boolean = js.native
  
  def fetch(): typings.bluebird.mod.^[Collection[T]] = js.native
  def fetch(options: CollectionFetchOptions): typings.bluebird.mod.^[Collection[T]] = js.native
  
  def filter(): js.Array[T] = js.native
  def filter(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def filter(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): js.Array[T] = js.native
  def filter(predicate: String): js.Array[T] = js.native
  def filter(predicate: String, thisArg: Any): js.Array[T] = js.native
  def filter(predicate: Unit, thisArg: Any): js.Array[T] = js.native
  def filter[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("filter")
  def filter_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  
  def find(): T = js.native
  def find(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): T = js.native
  def find(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): T = js.native
  def find(predicate: String): T = js.native
  def find(predicate: String, thisArg: Any): T = js.native
  def find(predicate: Unit, thisArg: Any): T = js.native
  def find[R /* <: js.Object */](predicate: R): T = js.native
  
  def findWhere(`match`: StringDictionary[Any]): T = js.native
  
  @JSName("find")
  def find_R_Object[R /* <: js.Object */](): T = js.native
  
  def first(): T = js.native
  
  def forEach(): T = js.native
  def forEach(callback: Unit, thisArg: Any): T = js.native
  def forEach(callback: ObjectIterator[T, Unit]): T = js.native
  def forEach(callback: ObjectIterator[T, Unit], thisArg: Any): T = js.native
  @JSName("forEach")
  def forEach_Dictionary(): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: Unit, thisArg: Any): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: DictionaryIterator[T, Unit]): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: DictionaryIterator[T, Unit], thisArg: Any): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_List(): List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: Unit, thisArg: Any): List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: ListIterator[T, Unit]): List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: ListIterator[T, Unit], thisArg: Any): List[T] = js.native
  
  def get(id: Any): T = js.native
  
  def groupBy(): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: String): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: String, thisArg: Any): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: Unit, thisArg: Any): Dictionary[js.Array[T]] = js.native
  def groupBy[R /* <: js.Object */](predicate: R): Dictionary[js.Array[T]] = js.native
  @JSName("groupBy")
  def groupBy_R_Object[R /* <: js.Object */](): Dictionary[js.Array[T]] = js.native
  
  // lodash methods
  def includes(value: Any): Boolean = js.native
  def includes(value: Any, fromIndex: Double): Boolean = js.native
  
  def invokeMap(methodName: String, args: Any*): Any = js.native
  def invokeMap(methodName: js.Function, args: Any*): Any = js.native
  
  def invokeThen(name: String, args: Any*): typings.bluebird.mod.^[Any] = js.native
  
  def isEmpty(): Boolean = js.native
  
  def keys(): js.Array[String] = js.native
  
  def last(): T = js.native
  
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L573
  var length: Double = js.native
  
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](): js.Array[U] = js.native
  def map[U](predicate: (DictionaryIterator[T, U]) | (ListIterator[T, U])): js.Array[U] = js.native
  def map[U](predicate: (DictionaryIterator[T, U]) | (ListIterator[T, U]), thisArg: Any): js.Array[U] = js.native
  def map[U](predicate: String): js.Array[U] = js.native
  def map[U](predicate: String, thisArg: Any): js.Array[U] = js.native
  def map[U](predicate: Unit, thisArg: Any): js.Array[U] = js.native
  
  var models: js.Array[T] = js.native
  
  def parse(response: Any): Any = js.native
  
  def pluck(attribute: String): js.Array[Any] = js.native
  
  def pop(): Unit = js.native
  
  def push(model: Any): Collection[T] = js.native
  
  def reduce[R](): R = js.native
  def reduce[R](callback: Unit, accumulator: R): R = js.native
  def reduce[R](callback: Unit, accumulator: R, thisArg: Any): R = js.native
  def reduce[R](callback: Unit, accumulator: Unit, thisArg: Any): R = js.native
  def reduce[R](callback: MemoIterator[T, R]): R = js.native
  def reduce[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def reduce[R](callback: MemoIterator[T, R], accumulator: R, thisArg: Any): R = js.native
  def reduce[R](callback: MemoIterator[T, R], accumulator: Unit, thisArg: Any): R = js.native
  
  def reduceRight[R](): R = js.native
  def reduceRight[R](callback: Unit, accumulator: R): R = js.native
  def reduceRight[R](callback: Unit, accumulator: R, thisArg: Any): R = js.native
  def reduceRight[R](callback: Unit, accumulator: Unit, thisArg: Any): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R]): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R], accumulator: R, thisArg: Any): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R], accumulator: Unit, thisArg: Any): R = js.native
  
  def reduceThen[R](
    iterator: js.Function4[/* prev */ R, /* cur */ T, /* idx */ Double, /* array */ js.Array[T], R],
    initialValue: R,
    context: Any
  ): typings.bluebird.mod.^[R] = js.native
  
  def reject(): js.Array[T] = js.native
  def reject(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def reject(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): js.Array[T] = js.native
  def reject(predicate: String): js.Array[T] = js.native
  def reject(predicate: String, thisArg: Any): js.Array[T] = js.native
  def reject(predicate: Unit, thisArg: Any): js.Array[T] = js.native
  def reject[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("reject")
  def reject_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  
  def remove(model: T): T = js.native
  def remove(model: T, options: EventOptions): T = js.native
  def remove(model: js.Array[T]): js.Array[T] = js.native
  def remove(model: js.Array[T], options: EventOptions): js.Array[T] = js.native
  
  def reset(model: js.Array[Any]): js.Array[T] = js.native
  def reset(model: js.Array[Any], options: CollectionAddOptions): js.Array[T] = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(options: SerializeOptions): js.Array[Any] = js.native
  
  def set(models: js.Array[StringDictionary[Any] | T]): Collection[T] = js.native
  def set(models: js.Array[StringDictionary[Any] | T], options: CollectionSetOptions): Collection[T] = js.native
  
  def shift(): Unit = js.native
  def shift(options: EventOptions): Unit = js.native
  
  def slice(): Unit = js.native
  def slice(begin: Double): Unit = js.native
  def slice(begin: Double, end: Double): Unit = js.native
  def slice(begin: Unit, end: Double): Unit = js.native
  
  def some(): Boolean = js.native
  def some(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def some(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): Boolean = js.native
  def some(predicate: String): Boolean = js.native
  def some(predicate: String, thisArg: Any): Boolean = js.native
  def some(predicate: Unit, thisArg: Any): Boolean = js.native
  def some[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("some")
  def some_R_Object[R /* <: js.Object */](): Boolean = js.native
  
  def sortBy(): js.Array[T] = js.native
  def sortBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def sortBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: Any): js.Array[T] = js.native
  def sortBy(predicate: String): js.Array[T] = js.native
  def sortBy(predicate: String, thisArg: Any): js.Array[T] = js.native
  def sortBy(predicate: Unit, thisArg: Any): js.Array[T] = js.native
  def sortBy[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  
  def tail(): js.Array[T] = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def toJSON(): js.Array[Any] = js.native
  def toJSON(options: SerializeOptions): js.Array[Any] = js.native
  
  def unshift(model: Any): Unit = js.native
  def unshift(model: Any, options: CollectionAddOptions): Unit = js.native
  
  def where(key: String, operatorOrValue: String): Collection[T] = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: String): Collection[T] = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: js.Array[Double | String]): Collection[T] = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Boolean): Collection[T] = js.native
  def where(key: String, operatorOrValue: String, valueIfOperator: Double): Collection[T] = js.native
  def where(key: String, operatorOrValue: Boolean): Collection[T] = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: String): Collection[T] = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: js.Array[Double | String]): Collection[T] = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Boolean): Collection[T] = js.native
  def where(key: String, operatorOrValue: Boolean, valueIfOperator: Double): Collection[T] = js.native
  def where(key: String, operatorOrValue: Double): Collection[T] = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: String): Collection[T] = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: js.Array[Double | String]): Collection[T] = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Boolean): Collection[T] = js.native
  def where(key: String, operatorOrValue: Double, valueIfOperator: Double): Collection[T] = js.native
  def where(`match`: StringDictionary[Any]): Collection[T] = js.native
}
