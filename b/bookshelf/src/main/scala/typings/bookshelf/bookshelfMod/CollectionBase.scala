package typings.bookshelf.bookshelfMod

import org.scalablytyped.runtime.StringDictionary
import typings.lodash.lodashMod.Dictionary
import typings.lodash.lodashMod.DictionaryIterator
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ListIterator
import typings.lodash.lodashMod.MemoIterator
import typings.lodash.lodashMod.ObjectIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "CollectionBase")
@js.native
// See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L21
abstract class CollectionBase[T /* <: Model[_] */] () extends Events[T] {
  def this(models: js.Array[T]) = this()
  def this(models: js.Array[T], options: CollectionOptions[T]) = this()
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L573
  var length: Double = js.native
  def add(models: js.Array[StringDictionary[_] | T]): Collection[T] = js.native
  def add(models: js.Array[StringDictionary[_] | T], options: CollectionAddOptions): Collection[T] = js.native
  // lodash methods
  def all(): Boolean = js.native
  def all(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def all(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Boolean = js.native
  def all(predicate: String): Boolean = js.native
  def all(predicate: String, thisArg: js.Any): Boolean = js.native
  def all[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("all")
  def all_R_Object[R /* <: js.Object */](): Boolean = js.native
  def any(): Boolean = js.native
  def any(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def any(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Boolean = js.native
  def any(predicate: String): Boolean = js.native
  def any(predicate: String, thisArg: js.Any): Boolean = js.native
  def any[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("any")
  def any_R_Object[R /* <: js.Object */](): Boolean = js.native
  def at(index: Double): T = js.native
  def collect(): js.Array[T] = js.native
  def collect(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def collect(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): js.Array[T] = js.native
  def collect(predicate: String): js.Array[T] = js.native
  def collect(predicate: String, thisArg: js.Any): js.Array[T] = js.native
  def collect[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("collect")
  def collect_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  def contains(value: js.Any): Boolean = js.native
  def contains(value: js.Any, fromIndex: Double): Boolean = js.native
  def countBy(): Dictionary[Double] = js.native
  def countBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Dictionary[Double] = js.native
  def countBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Dictionary[Double] = js.native
  def countBy(predicate: String): Dictionary[Double] = js.native
  def countBy(predicate: String, thisArg: js.Any): Dictionary[Double] = js.native
  def countBy[R /* <: js.Object */](predicate: R): Dictionary[Double] = js.native
  @JSName("countBy")
  def countBy_R_Object[R /* <: js.Object */](): Dictionary[Double] = js.native
  def detect(): T = js.native
  def detect(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): T = js.native
  def detect(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): T = js.native
  def detect(predicate: String): T = js.native
  def detect(predicate: String, thisArg: js.Any): T = js.native
  def detect[R /* <: js.Object */](predicate: R): T = js.native
  @JSName("detect")
  def detect_R_Object[R /* <: js.Object */](): T = js.native
  def every(): Boolean = js.native
  def every(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def every(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Boolean = js.native
  def every(predicate: String): Boolean = js.native
  def every(predicate: String, thisArg: js.Any): Boolean = js.native
  def every[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("every")
  def every_R_Object[R /* <: js.Object */](): Boolean = js.native
  def fetch(): typings.bluebird.bluebirdMod.^[Collection[T]] = js.native
  def fetch(options: CollectionFetchOptions): typings.bluebird.bluebirdMod.^[Collection[T]] = js.native
  def filter(): js.Array[T] = js.native
  def filter(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def filter(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): js.Array[T] = js.native
  def filter(predicate: String): js.Array[T] = js.native
  def filter(predicate: String, thisArg: js.Any): js.Array[T] = js.native
  def filter[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("filter")
  def filter_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  def find(): T = js.native
  def find(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): T = js.native
  def find(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): T = js.native
  def find(predicate: String): T = js.native
  def find(predicate: String, thisArg: js.Any): T = js.native
  def find[R /* <: js.Object */](predicate: R): T = js.native
  def findWhere(`match`: StringDictionary[js.Any]): T = js.native
  @JSName("find")
  def find_R_Object[R /* <: js.Object */](): T = js.native
  def first(): T = js.native
  def foldl[R](): R = js.native
  def foldl[R](callback: MemoIterator[T, R]): R = js.native
  def foldl[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def foldl[R](callback: MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def foldr[R](): R = js.native
  def foldr[R](callback: MemoIterator[T, R]): R = js.native
  def foldr[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def foldr[R](callback: MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def forEach(): T = js.native
  def forEach(callback: ObjectIterator[T, Unit]): T = js.native
  def forEach(callback: ObjectIterator[T, Unit], thisArg: js.Any): T = js.native
  @JSName("forEach")
  def forEach_Dictionary(): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: DictionaryIterator[T, Unit]): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: DictionaryIterator[T, Unit], thisArg: js.Any): Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_List(): List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: ListIterator[T, Unit]): List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: ListIterator[T, Unit], thisArg: js.Any): List[T] = js.native
  def get(id: js.Any): T = js.native
  def groupBy(): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: String): Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: String, thisArg: js.Any): Dictionary[js.Array[T]] = js.native
  def groupBy[R /* <: js.Object */](predicate: R): Dictionary[js.Array[T]] = js.native
  @JSName("groupBy")
  def groupBy_R_Object[R /* <: js.Object */](): Dictionary[js.Array[T]] = js.native
  def include(value: js.Any): Boolean = js.native
  def include(value: js.Any, fromIndex: Double): Boolean = js.native
  def inject[R](): R = js.native
  def inject[R](callback: MemoIterator[T, R]): R = js.native
  def inject[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def inject[R](callback: MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def invoke(methodName: String, args: js.Any*): js.Any = js.native
  def invoke(methodName: js.Function, args: js.Any*): js.Any = js.native
  def invokeThen(name: String, args: js.Any*): typings.bluebird.bluebirdMod.^[_] = js.native
  def isEmpty(): Boolean = js.native
  def keys(): js.Array[String] = js.native
  def last(): T = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](): js.Array[U] = js.native
  def map[U](predicate: (DictionaryIterator[T, U]) | (ListIterator[T, U])): js.Array[U] = js.native
  def map[U](predicate: (DictionaryIterator[T, U]) | (ListIterator[T, U]), thisArg: js.Any): js.Array[U] = js.native
  def map[U](predicate: String): js.Array[U] = js.native
  def map[U](predicate: String, thisArg: js.Any): js.Array[U] = js.native
  def parse(response: js.Any): js.Any = js.native
  def pluck(attribute: String): js.Array[_] = js.native
  def pop(): Unit = js.native
  def push(model: js.Any): Collection[T] = js.native
  def reduce[R](): R = js.native
  def reduce[R](callback: MemoIterator[T, R]): R = js.native
  def reduce[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def reduce[R](callback: MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def reduceRight[R](): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R]): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R], accumulator: R): R = js.native
  def reduceRight[R](callback: MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def reduceThen[R](
    iterator: js.Function4[/* prev */ R, /* cur */ T, /* idx */ Double, /* array */ js.Array[T], R],
    initialValue: R,
    context: js.Any
  ): typings.bluebird.bluebirdMod.^[R] = js.native
  def reject(): js.Array[T] = js.native
  def reject(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def reject(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): js.Array[T] = js.native
  def reject(predicate: String): js.Array[T] = js.native
  def reject(predicate: String, thisArg: js.Any): js.Array[T] = js.native
  def reject[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("reject")
  def reject_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  def remove(model: T): T = js.native
  def remove(model: T, options: EventOptions): T = js.native
  def remove(model: js.Array[T]): js.Array[T] = js.native
  def remove(model: js.Array[T], options: EventOptions): js.Array[T] = js.native
  def reset(model: js.Array[_]): js.Array[T] = js.native
  def reset(model: js.Array[_], options: CollectionAddOptions): js.Array[T] = js.native
  def rest(): js.Array[T] = js.native
  def select(): js.Array[T] = js.native
  def select(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def select(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): js.Array[T] = js.native
  def select(predicate: String): js.Array[T] = js.native
  def select(predicate: String, thisArg: js.Any): js.Array[T] = js.native
  def select[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("select")
  def select_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(options: SerializeOptions): js.Array[_] = js.native
  def set(models: js.Array[StringDictionary[_] | T]): Collection[T] = js.native
  def set(models: js.Array[StringDictionary[_] | T], options: CollectionSetOptions): Collection[T] = js.native
  def shift(): Unit = js.native
  def shift(options: EventOptions): Unit = js.native
  def slice(): Unit = js.native
  def slice(begin: Double): Unit = js.native
  def slice(begin: Double, end: Double): Unit = js.native
  def some(): Boolean = js.native
  def some(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): Boolean = js.native
  def some(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): Boolean = js.native
  def some(predicate: String): Boolean = js.native
  def some(predicate: String, thisArg: js.Any): Boolean = js.native
  def some[R /* <: js.Object */](predicate: R): Boolean = js.native
  @JSName("some")
  def some_R_Object[R /* <: js.Object */](): Boolean = js.native
  def sortBy(): js.Array[T] = js.native
  def sortBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean])): js.Array[T] = js.native
  def sortBy(predicate: (DictionaryIterator[T, Boolean]) | (ListIterator[T, Boolean]), thisArg: js.Any): js.Array[T] = js.native
  def sortBy(predicate: String): js.Array[T] = js.native
  def sortBy(predicate: String, thisArg: js.Any): js.Array[T] = js.native
  def sortBy[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_R_Object[R /* <: js.Object */](): js.Array[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toJSON(): js.Array[_] = js.native
  def toJSON(options: SerializeOptions): js.Array[_] = js.native
  def unshift(model: js.Any): Unit = js.native
  def unshift(model: js.Any, options: CollectionAddOptions): Unit = js.native
  def where(`match`: StringDictionary[js.Any], firstOnly: Boolean): T | Collection[T] = js.native
}

