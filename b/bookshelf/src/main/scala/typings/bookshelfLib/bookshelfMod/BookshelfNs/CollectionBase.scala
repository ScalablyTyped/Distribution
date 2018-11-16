package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBase[T /* <: Model[_] */] extends Events[T] {
  // See https://github.com/tgriesser/bookshelf/blob/0.9.4/src/base/collection.js#L573
  var length: scala.Double = js.native
  def add(models: js.Array[ScalablyTyped.runtime.StringDictionary[_] | T]): Collection[T] = js.native
  def add(models: js.Array[ScalablyTyped.runtime.StringDictionary[_] | T], options: CollectionAddOptions): Collection[T] = js.native
  // lodash methods
  def all(): scala.Boolean = js.native
  // lodash methods
  def all(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): scala.Boolean = js.native
  // lodash methods
  def all(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): scala.Boolean = js.native
  // lodash methods
  def all(predicate: java.lang.String): scala.Boolean = js.native
  // lodash methods
  def all(predicate: java.lang.String, thisArg: js.Any): scala.Boolean = js.native
  def all[R /* <: js.Object */](predicate: R): scala.Boolean = js.native
  @JSName("all")
  def all_RObject[R /* <: js.Object */](): scala.Boolean = js.native
  def any(): scala.Boolean = js.native
  def any(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): scala.Boolean = js.native
  def any(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): scala.Boolean = js.native
  def any(predicate: java.lang.String): scala.Boolean = js.native
  def any(predicate: java.lang.String, thisArg: js.Any): scala.Boolean = js.native
  def any[R /* <: js.Object */](predicate: R): scala.Boolean = js.native
  @JSName("any")
  def any_RObject[R /* <: js.Object */](): scala.Boolean = js.native
  def at(index: scala.Double): T = js.native
  def chain(): lodashLib.lodashMod.underscoreNs.LoDashExplicitObjectWrapper[T] = js.native
  def collect(): js.Array[T] = js.native
  def collect(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): js.Array[T] = js.native
  def collect(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): js.Array[T] = js.native
  def collect(predicate: java.lang.String): js.Array[T] = js.native
  def collect(predicate: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def collect[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("collect")
  def collect_RObject[R /* <: js.Object */](): js.Array[T] = js.native
  def contains(value: js.Any): scala.Boolean = js.native
  def contains(value: js.Any, fromIndex: scala.Double): scala.Boolean = js.native
  def countBy(): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(predicate: java.lang.String): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(predicate: java.lang.String, thisArg: js.Any): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy[R /* <: js.Object */](predicate: R): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  @JSName("countBy")
  def countBy_RObject[R /* <: js.Object */](): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Double] = js.native
  def detect(): T = js.native
  def detect(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): T = js.native
  def detect(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): T = js.native
  def detect(predicate: java.lang.String): T = js.native
  def detect(predicate: java.lang.String, thisArg: js.Any): T = js.native
  def detect[R /* <: js.Object */](predicate: R): T = js.native
  @JSName("detect")
  def detect_RObject[R /* <: js.Object */](): T = js.native
  def difference(values: T*): js.Array[T] = js.native
  def drop(): js.Array[T] = js.native
  def drop(n: scala.Double): js.Array[T] = js.native
  def each(): T = js.native
  def each(callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, scala.Unit]): T = js.native
  def each(callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, scala.Unit], thisArg: js.Any): T = js.native
  @JSName("each")
  def each_Dictionary(): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("each")
  def each_Dictionary(callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Unit]): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("each")
  def each_Dictionary(callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Unit], thisArg: js.Any): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("each")
  def each_List(): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  @JSName("each")
  def each_List(callback: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Unit]): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  @JSName("each")
  def each_List(callback: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Unit], thisArg: js.Any): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def every(): scala.Boolean = js.native
  def every(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): scala.Boolean = js.native
  def every(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): scala.Boolean = js.native
  def every(predicate: java.lang.String): scala.Boolean = js.native
  def every(predicate: java.lang.String, thisArg: js.Any): scala.Boolean = js.native
  def every[R /* <: js.Object */](predicate: R): scala.Boolean = js.native
  @JSName("every")
  def every_RObject[R /* <: js.Object */](): scala.Boolean = js.native
  def fetch(): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def fetch(options: CollectionFetchOptions): bluebirdLib.bluebirdMod.namespaced[Collection[T]] = js.native
  def filter(): js.Array[T] = js.native
  def filter(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): js.Array[T] = js.native
  def filter(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): js.Array[T] = js.native
  def filter(predicate: java.lang.String): js.Array[T] = js.native
  def filter(predicate: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def filter[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("filter")
  def filter_RObject[R /* <: js.Object */](): js.Array[T] = js.native
  def find(): T = js.native
  def find(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): T = js.native
  def find(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): T = js.native
  def find(predicate: java.lang.String): T = js.native
  def find(predicate: java.lang.String, thisArg: js.Any): T = js.native
  def find[R /* <: js.Object */](predicate: R): T = js.native
  def findWhere(`match`: ScalablyTyped.runtime.StringDictionary[js.Any]): T = js.native
  @JSName("find")
  def find_RObject[R /* <: js.Object */](): T = js.native
  def first(): T = js.native
  def foldl[R](): R = js.native
  def foldl[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R]): R = js.native
  def foldl[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R): R = js.native
  def foldl[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def foldr[R](): R = js.native
  def foldr[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R]): R = js.native
  def foldr[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R): R = js.native
  def foldr[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def forEach(): T = js.native
  def forEach(callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, scala.Unit]): T = js.native
  def forEach(callback: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, scala.Unit], thisArg: js.Any): T = js.native
  @JSName("forEach")
  def forEach_Dictionary(): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Unit]): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_Dictionary(callback: lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Unit], thisArg: js.Any): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  @JSName("forEach")
  def forEach_List(): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Unit]): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  @JSName("forEach")
  def forEach_List(callback: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Unit], thisArg: js.Any): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def get(id: js.Any): T = js.native
  def groupBy(): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: java.lang.String): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy(predicate: java.lang.String, thisArg: js.Any): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def groupBy[R /* <: js.Object */](predicate: R): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  @JSName("groupBy")
  def groupBy_RObject[R /* <: js.Object */](): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def head(): T = js.native
  def include(value: js.Any): scala.Boolean = js.native
  def include(value: js.Any, fromIndex: scala.Double): scala.Boolean = js.native
  def indexOf(value: js.Any): scala.Double = js.native
  def indexOf(value: js.Any, fromIndex: scala.Double): scala.Double = js.native
  def initial(): js.Array[T] = js.native
  def inject[R](): R = js.native
  def inject[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R]): R = js.native
  def inject[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R): R = js.native
  def inject[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def invoke(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def invoke(methodName: js.Function, args: js.Any*): js.Any = js.native
  def invokeThen(name: java.lang.String, args: js.Any*): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def isEmpty(): scala.Boolean = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def last(): T = js.native
  def lastIndexOf(value: js.Any): scala.Double = js.native
  def lastIndexOf(value: js.Any, fromIndex: scala.Double): scala.Double = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](): js.Array[U] = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, U]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, U])
  ): js.Array[U] = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, U]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, U]),
    thisArg: js.Any
  ): js.Array[U] = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](predicate: java.lang.String): js.Array[U] = js.native
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/blob/1ec3d51/lodash/lodash-3.10.d.ts#L7119
  // See https://github.com/Microsoft/TypeScript/blob/v1.8.10/lib/lib.core.es7.d.ts#L1122
  def map[U](predicate: java.lang.String, thisArg: js.Any): js.Array[U] = js.native
  def max(): T = js.native
  def max(predicate: java.lang.String): T = js.native
  def max(predicate: java.lang.String, thisArg: js.Any): T = js.native
  def max(predicate: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]): T = js.native
  def max(predicate: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean], thisArg: js.Any): T = js.native
  def max[R /* <: js.Object */](predicate: R): T = js.native
  @JSName("max")
  def max_RObject[R /* <: js.Object */](): T = js.native
  def min(): T = js.native
  def min(predicate: java.lang.String): T = js.native
  def min(predicate: java.lang.String, thisArg: js.Any): T = js.native
  def min(predicate: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]): T = js.native
  def min(predicate: lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean], thisArg: js.Any): T = js.native
  def min[R /* <: js.Object */](predicate: R): T = js.native
  @JSName("min")
  def min_RObject[R /* <: js.Object */](): T = js.native
  def parse(response: js.Any): js.Any = js.native
  def pluck(attribute: java.lang.String): js.Array[_] = js.native
  def pop(): scala.Unit = js.native
  def push(model: js.Any): Collection[T] = js.native
  def reduce[R](): R = js.native
  def reduce[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R]): R = js.native
  def reduce[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R): R = js.native
  def reduce[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def reduceRight[R](): R = js.native
  def reduceRight[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R]): R = js.native
  def reduceRight[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R): R = js.native
  def reduceRight[R](callback: lodashLib.lodashMod.underscoreNs.MemoIterator[T, R], accumulator: R, thisArg: js.Any): R = js.native
  def reduceThen[R](
    iterator: js.Function4[/* prev */ R, /* cur */ T, /* idx */ scala.Double, /* array */ js.Array[T], R],
    initialValue: R,
    context: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[R] = js.native
  def reject(): js.Array[T] = js.native
  def reject(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): js.Array[T] = js.native
  def reject(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): js.Array[T] = js.native
  def reject(predicate: java.lang.String): js.Array[T] = js.native
  def reject(predicate: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def reject[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("reject")
  def reject_RObject[R /* <: js.Object */](): js.Array[T] = js.native
  def remove(model: T): T = js.native
  def remove(model: T, options: EventOptions): T = js.native
  def remove(model: js.Array[T]): js.Array[T] = js.native
  def remove(model: js.Array[T], options: EventOptions): js.Array[T] = js.native
  def reset(model: js.Array[_]): js.Array[T] = js.native
  def reset(model: js.Array[_], options: CollectionAddOptions): js.Array[T] = js.native
  def rest(): js.Array[T] = js.native
  def select(): js.Array[T] = js.native
  def select(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): js.Array[T] = js.native
  def select(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): js.Array[T] = js.native
  def select(predicate: java.lang.String): js.Array[T] = js.native
  def select(predicate: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def select[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("select")
  def select_RObject[R /* <: js.Object */](): js.Array[T] = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(options: SerializeOptions): js.Array[_] = js.native
  def set(models: js.Array[ScalablyTyped.runtime.StringDictionary[_] | T]): Collection[T] = js.native
  def set(models: js.Array[ScalablyTyped.runtime.StringDictionary[_] | T], options: CollectionSetOptions): Collection[T] = js.native
  def shift(): scala.Unit = js.native
  def shift(options: EventOptions): scala.Unit = js.native
  def shuffle(): js.Array[T] = js.native
  def size(): scala.Double = js.native
  def slice(): scala.Unit = js.native
  def slice(begin: scala.Double): scala.Unit = js.native
  def slice(begin: scala.Double, end: scala.Double): scala.Unit = js.native
  def some(): scala.Boolean = js.native
  def some(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): scala.Boolean = js.native
  def some(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): scala.Boolean = js.native
  def some(predicate: java.lang.String): scala.Boolean = js.native
  def some(predicate: java.lang.String, thisArg: js.Any): scala.Boolean = js.native
  def some[R /* <: js.Object */](predicate: R): scala.Boolean = js.native
  @JSName("some")
  def some_RObject[R /* <: js.Object */](): scala.Boolean = js.native
  def sortBy(): js.Array[T] = js.native
  def sortBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean])
  ): js.Array[T] = js.native
  def sortBy(
    predicate: (lodashLib.lodashMod.underscoreNs.DictionaryIterator[T, scala.Boolean]) | (lodashLib.lodashMod.underscoreNs.ListIterator[T, scala.Boolean]),
    thisArg: js.Any
  ): js.Array[T] = js.native
  def sortBy(predicate: java.lang.String): js.Array[T] = js.native
  def sortBy(predicate: java.lang.String, thisArg: js.Any): js.Array[T] = js.native
  def sortBy[R /* <: js.Object */](predicate: R): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_RObject[R /* <: js.Object */](): js.Array[T] = js.native
  def tail(): js.Array[T] = js.native
  def take(): js.Array[T] = js.native
  def take(n: scala.Double): js.Array[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toJSON(): js.Array[_] = js.native
  def toJSON(options: SerializeOptions): js.Array[_] = js.native
  def unshift(model: js.Any): scala.Unit = js.native
  def unshift(model: js.Any, options: CollectionAddOptions): scala.Unit = js.native
  def where(`match`: ScalablyTyped.runtime.StringDictionary[js.Any], firstOnly: scala.Boolean): T | Collection[T] = js.native
  def without(values: js.Any*): js.Array[T] = js.native
}

