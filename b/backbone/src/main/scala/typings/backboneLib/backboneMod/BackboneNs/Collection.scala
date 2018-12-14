package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[TModel /* <: Model */] extends ModelBase {
  /**
           * Specify a model attribute name (string) or function that will be used to sort the collection.
           */
  var comparator: java.lang.String | (js.Function1[/* element */ TModel, scala.Double | java.lang.String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], scala.Double]) = js.native
  var length: scala.Double = js.native
  var model: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, TModel] = js.native
  var models: js.Array[TModel] = js.native
  /**
           * Sets the url property (or function) on a collection to reference its location on the server.
           *
           * @memberof Collection
           */
  var url: java.lang.String | js.Function0[java.lang.String] = js.native
  /* private */ def _isModel(obj: js.Any): /* is Model */scala.Boolean = js.native
  /* private */ def _onModelEvent(event: java.lang.String, model: TModel, collection: Collection[TModel], options: js.Any): scala.Unit = js.native
  /* private */ def _prepareModel(): js.Any = js.native
  /* private */ def _prepareModel(attributes: js.Any): js.Any = js.native
  /* private */ def _prepareModel(attributes: js.Any, options: js.Any): js.Any = js.native
  /* private */ def _removeReference(model: TModel): scala.Unit = js.native
  def add(model: TModel): TModel = js.native
  def add(model: TModel, options: AddOptions): TModel = js.native
  def add(model: js.Object): TModel = js.native
  def add(model: js.Object, options: AddOptions): TModel = js.native
  def add(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def add(models: js.Array[js.Object | TModel], options: AddOptions): js.Array[TModel] = js.native
  // mixins from underscore
  def all(): scala.Boolean = js.native
  // mixins from underscore
  def all(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Boolean = js.native
  // mixins from underscore
  def all(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def any(): scala.Boolean = js.native
  def any(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Boolean = js.native
  def any(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def at(index: scala.Double): TModel = js.native
  def chain(): js.Any = js.native
  def collect[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TResult]): js.Array[TResult] = js.native
  def collect[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TResult], context: js.Any): js.Array[TResult] = js.native
  def contains(value: TModel): scala.Boolean = js.native
  def countBy(): underscoreLib.underscoreMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[scala.Double] = js.native
  def countBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _]): underscoreLib.underscoreMod.underscoreNs.Dictionary[scala.Double] = js.native
  def create(attributes: js.Any): TModel = js.native
  def create(attributes: js.Any, options: ModelSaveOptions): TModel = js.native
  def detect(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): TModel = js.native
  def detect(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): TModel = js.native
  def difference(others: js.Array[TModel]): js.Array[TModel] = js.native
  def drop(): js.Array[TModel] = js.native
  def drop(n: scala.Double): js.Array[TModel] = js.native
  def each(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Unit]): js.Array[TModel] = js.native
  def each(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Unit],
    context: js.Any
  ): js.Array[TModel] = js.native
  def every(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Boolean = js.native
  def every(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def fetch(): jqueryLib.JQueryXHR = js.native
  def fetch(options: CollectionFetchOptions): jqueryLib.JQueryXHR = js.native
  def filter(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): js.Array[TModel] = js.native
  def filter(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): js.Array[TModel] = js.native
  def find(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): TModel = js.native
  def find(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): TModel = js.native
  def findIndex(predicate: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Double = js.native
  def findIndex(
    predicate: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Double = js.native
  def findLastIndex(predicate: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Double = js.native
  def findLastIndex(
    predicate: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Double = js.native
  def findWhere(properties: js.Any): TModel = js.native
  def first(): TModel = js.native
  def first(n: scala.Double): js.Array[TModel] = js.native
  def foldl[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult]): TResult = js.native
  def foldl[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def foldl[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def foldr[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult]): TResult = js.native
  def foldr[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def foldr[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def forEach(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Unit]): js.Array[TModel] = js.native
  def forEach(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Unit],
    context: js.Any
  ): js.Array[TModel] = js.native
  /**
           * Get a model from a collection, specified by an id, a cid, or by passing in a model.
           **/
  def get(id: Model): TModel = js.native
  /**
           * Get a model from a collection, specified by an id, a cid, or by passing in a model.
           **/
  def get(id: java.lang.String): TModel = js.native
  /**
           * Get a model from a collection, specified by an id, a cid, or by passing in a model.
           **/
  def get(id: scala.Double): TModel = js.native
  def groupBy(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: java.lang.String, context: js.Any): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _]): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _], context: js.Any): underscoreLib.underscoreMod.underscoreNs.Dictionary[js.Array[TModel]] = js.native
  def has(key: Model): scala.Boolean = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def has(key: scala.Double): scala.Boolean = js.native
  def head(): TModel = js.native
  def head(n: scala.Double): js.Array[TModel] = js.native
  def include(value: TModel): scala.Boolean = js.native
  def includes(value: TModel): scala.Boolean = js.native
  def indexBy(iterator: java.lang.String): underscoreLib.underscoreMod.underscoreNs.Dictionary[TModel] = js.native
  def indexBy(iterator: java.lang.String, context: js.Any): underscoreLib.underscoreMod.underscoreNs.Dictionary[TModel] = js.native
  def indexBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _]): underscoreLib.underscoreMod.underscoreNs.Dictionary[TModel] = js.native
  def indexBy(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _], context: js.Any): underscoreLib.underscoreMod.underscoreNs.Dictionary[TModel] = js.native
  def indexOf(value: TModel): scala.Double = js.native
  def indexOf(value: TModel, isSorted: scala.Boolean): scala.Double = js.native
  def initial(): TModel = js.native
  def initial(n: scala.Double): js.Array[TModel] = js.native
  def initialize(): scala.Unit = js.native
  def initialize(models: js.Array[TModel | js.Object]): scala.Unit = js.native
  def initialize(models: js.Array[TModel | js.Object], options: js.Any): scala.Unit = js.native
  def inject[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult]): TResult = js.native
  def inject[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def inject[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def invoke(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  def last(): TModel = js.native
  def last(n: scala.Double): js.Array[TModel] = js.native
  def lastIndexOf(value: TModel): scala.Double = js.native
  def lastIndexOf(value: TModel, from: scala.Double): scala.Double = js.native
  def map[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TResult]): js.Array[TResult] = js.native
  def map[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TResult], context: js.Any): js.Array[TResult] = js.native
  def max(): TModel = js.native
  def max(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _]): TModel = js.native
  def max(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _], context: js.Any): TModel = js.native
  def min(): TModel = js.native
  def min(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _]): TModel = js.native
  def min(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, _], context: js.Any): TModel = js.native
  def modelId(attrs: js.Any): js.Any = js.native
  def partition(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): js.Array[js.Array[TModel]] = js.native
  def pluck(attribute: java.lang.String): js.Array[_] = js.native
  def pop(): TModel = js.native
  def pop(options: Silenceable): TModel = js.native
  def push(model: TModel): TModel = js.native
  def push(model: TModel, options: AddOptions): TModel = js.native
  def reduce[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult]): TResult = js.native
  def reduce[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def reduce[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def reduceRight[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult]): TResult = js.native
  def reduceRight[TResult](iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def reduceRight[TResult](
    iterator: underscoreLib.underscoreMod.underscoreNs.MemoIterator[TModel, TResult],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def reject(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): js.Array[TModel] = js.native
  def reject(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): js.Array[TModel] = js.native
  def remove(model: TModel): TModel = js.native
  def remove(model: TModel, options: Silenceable): TModel = js.native
  def remove(model: js.Object): TModel = js.native
  def remove(model: js.Object, options: Silenceable): TModel = js.native
  def remove(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def remove(models: js.Array[js.Object | TModel], options: Silenceable): js.Array[TModel] = js.native
  def reset(): js.Array[TModel] = js.native
  def reset(models: js.Array[TModel]): js.Array[TModel] = js.native
  def reset(models: js.Array[TModel], options: Silenceable): js.Array[TModel] = js.native
  def rest(): js.Array[TModel] = js.native
  def rest(n: scala.Double): js.Array[TModel] = js.native
  def sample(): TModel = js.native
  def sample(n: scala.Double): js.Array[TModel] = js.native
  def select(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): js.Array[TModel] = js.native
  def select(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): js.Array[TModel] = js.native
  /**
           *
           * The set method performs a "smart" update of the collection with the passed list of models.
           * If a model in the list isn't yet in the collection it will be added; if the model is already in the
           * collection its attributes will be merged; and if the collection contains any models that aren't present
           * in the list, they'll be removed. All of the appropriate "add", "remove", and "change" events are fired as
           * this happens. Returns the touched models in the collection. If you'd like to customize the behavior, you can
           * disable it with options: {add: false}, {remove: false}, or {merge: false}.
           * @param models
           * @param options
           */
  def set(): js.Array[TModel] = js.native
  /**
           *
           * The set method performs a "smart" update of the collection with the passed list of models.
           * If a model in the list isn't yet in the collection it will be added; if the model is already in the
           * collection its attributes will be merged; and if the collection contains any models that aren't present
           * in the list, they'll be removed. All of the appropriate "add", "remove", and "change" events are fired as
           * this happens. Returns the touched models in the collection. If you'd like to customize the behavior, you can
           * disable it with options: {add: false}, {remove: false}, or {merge: false}.
           * @param models
           * @param options
           */
  def set(models: js.Array[TModel]): js.Array[TModel] = js.native
  /**
           *
           * The set method performs a "smart" update of the collection with the passed list of models.
           * If a model in the list isn't yet in the collection it will be added; if the model is already in the
           * collection its attributes will be merged; and if the collection contains any models that aren't present
           * in the list, they'll be removed. All of the appropriate "add", "remove", and "change" events are fired as
           * this happens. Returns the touched models in the collection. If you'd like to customize the behavior, you can
           * disable it with options: {add: false}, {remove: false}, or {merge: false}.
           * @param models
           * @param options
           */
  def set(models: js.Array[TModel], options: CollectionSetOptions): js.Array[TModel] = js.native
  def shift(): TModel = js.native
  def shift(options: Silenceable): TModel = js.native
  def shuffle(): js.Array[TModel] = js.native
  def size(): scala.Double = js.native
  /**
           * Return a shallow copy of this collection's models, using the same options as native Array#slice.
           */
  def slice(): js.Array[TModel] = js.native
  /**
           * Return a shallow copy of this collection's models, using the same options as native Array#slice.
           */
  def slice(min: scala.Double): js.Array[TModel] = js.native
  /**
           * Return a shallow copy of this collection's models, using the same options as native Array#slice.
           */
  def slice(min: scala.Double, max: scala.Double): js.Array[TModel] = js.native
  def some(): scala.Boolean = js.native
  def some(iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean]): scala.Boolean = js.native
  def some(
    iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def sort(): Collection[TModel] = js.native
  def sort(options: Silenceable): Collection[TModel] = js.native
  def sortBy(iterator: java.lang.String): js.Array[TModel] = js.native
  def sortBy(iterator: java.lang.String, context: js.Any): js.Array[TModel] = js.native
  def sortBy[TSort](): js.Array[TModel] = js.native
  def sortBy[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TSort]): js.Array[TModel] = js.native
  def sortBy[TSort](iterator: underscoreLib.underscoreMod.underscoreNs.ListIterator[TModel, TSort], context: js.Any): js.Array[TModel] = js.native
  def tail(): js.Array[TModel] = js.native
  def tail(n: scala.Double): js.Array[TModel] = js.native
  def take(): TModel = js.native
  def take(n: scala.Double): js.Array[TModel] = js.native
  def toArray(): js.Array[TModel] = js.native
  def unshift(model: TModel): TModel = js.native
  def unshift(model: TModel, options: AddOptions): TModel = js.native
  def where(properties: js.Any): js.Array[TModel] = js.native
  def without(values: TModel*): js.Array[TModel] = js.native
}

