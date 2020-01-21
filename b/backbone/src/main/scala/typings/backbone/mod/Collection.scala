package typings.backbone.mod

import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQueryXHR
import typings.underscore.mod.Dictionary
import typings.underscore.mod.ListIterator
import typings.underscore.mod.MemoIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Collection")
@js.native
class Collection[TModel /* <: Model */] () extends js.Object {
  def this(models: js.Array[js.Object | TModel]) = this()
  def this(models: js.Array[js.Object | TModel], options: js.Any) = this()
  /**
    * Specify a model attribute name (string) or function that will be used to sort the collection.
    */
  var comparator: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double]) = js.native
  var length: Double = js.native
  var model: Instantiable1[/* args (repeated) */ js.Any, TModel] = js.native
  var models: js.Array[TModel] = js.native
  /**
    * Sets the url property (or function) on a collection to reference its location on the server.
    *
    * @memberof Collection
    */
  var url: String | js.Function0[String] = js.native
  /* private */ def _isModel(obj: js.Any): /* is backbone.backbone.Model */ Boolean = js.native
  /* private */ def _onModelEvent(event: String, model: TModel, collection: Collection[TModel], options: js.Any): Unit = js.native
  /* private */ def _prepareModel(): js.Any = js.native
  /* private */ def _prepareModel(attributes: js.Any): js.Any = js.native
  /* private */ def _prepareModel(attributes: js.Any, options: js.Any): js.Any = js.native
  /* private */ def _removeReference(model: TModel): Unit = js.native
  def add(model: TModel): TModel = js.native
  def add(model: TModel, options: AddOptions): TModel = js.native
  def add(model: js.Object): TModel = js.native
  def add(model: js.Object, options: AddOptions): TModel = js.native
  def add(models: js.Array[js.Object | TModel]): js.Array[TModel] = js.native
  def add(models: js.Array[js.Object | TModel], options: AddOptions): js.Array[TModel] = js.native
  // mixins from underscore
  def all(): Boolean = js.native
  def all(iterator: ListIterator[TModel, Boolean]): Boolean = js.native
  def all(iterator: ListIterator[TModel, Boolean], context: js.Any): Boolean = js.native
  def any(): Boolean = js.native
  def any(iterator: ListIterator[TModel, Boolean]): Boolean = js.native
  def any(iterator: ListIterator[TModel, Boolean], context: js.Any): Boolean = js.native
  def at(index: Double): TModel = js.native
  def chain(): js.Any = js.native
  def collect[TResult](iterator: ListIterator[TModel, TResult]): js.Array[TResult] = js.native
  def collect[TResult](iterator: ListIterator[TModel, TResult], context: js.Any): js.Array[TResult] = js.native
  def contains(value: TModel): Boolean = js.native
  def countBy(): Dictionary[Double] = js.native
  def countBy(iterator: String): Dictionary[Double] = js.native
  def countBy(iterator: ListIterator[TModel, _]): Dictionary[Double] = js.native
  def create(attributes: js.Any): TModel = js.native
  def create(attributes: js.Any, options: ModelSaveOptions): TModel = js.native
  def detect(iterator: ListIterator[TModel, Boolean]): TModel = js.native
  def detect(iterator: ListIterator[TModel, Boolean], context: js.Any): TModel = js.native
  def difference(others: js.Array[TModel]): js.Array[TModel] = js.native
  def drop(): js.Array[TModel] = js.native
  def drop(n: Double): js.Array[TModel] = js.native
  def each(iterator: ListIterator[TModel, Unit]): js.Array[TModel] = js.native
  def each(iterator: ListIterator[TModel, Unit], context: js.Any): js.Array[TModel] = js.native
  def every(iterator: ListIterator[TModel, Boolean]): Boolean = js.native
  def every(iterator: ListIterator[TModel, Boolean], context: js.Any): Boolean = js.native
  def fetch(): JQueryXHR = js.native
  def fetch(options: CollectionFetchOptions): JQueryXHR = js.native
  def filter(iterator: ListIterator[TModel, Boolean]): js.Array[TModel] = js.native
  def filter(iterator: ListIterator[TModel, Boolean], context: js.Any): js.Array[TModel] = js.native
  def find(iterator: ListIterator[TModel, Boolean]): TModel = js.native
  def find(iterator: ListIterator[TModel, Boolean], context: js.Any): TModel = js.native
  def findIndex(predicate: ListIterator[TModel, Boolean]): Double = js.native
  def findIndex(predicate: ListIterator[TModel, Boolean], context: js.Any): Double = js.native
  def findLastIndex(predicate: ListIterator[TModel, Boolean]): Double = js.native
  def findLastIndex(predicate: ListIterator[TModel, Boolean], context: js.Any): Double = js.native
  def findWhere(properties: js.Any): TModel = js.native
  def first(): TModel = js.native
  def first(n: Double): js.Array[TModel] = js.native
  def foldl[TResult](iterator: MemoIterator[TModel, TResult]): TResult = js.native
  def foldl[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def foldl[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult, context: js.Any): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[TModel, TResult]): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult, context: js.Any): TResult = js.native
  def forEach(iterator: ListIterator[TModel, Unit]): js.Array[TModel] = js.native
  def forEach(iterator: ListIterator[TModel, Unit], context: js.Any): js.Array[TModel] = js.native
  def get(id: String): TModel = js.native
  /**
    * Get a model from a collection, specified by an id, a cid, or by passing in a model.
    **/
  def get(id: Double): TModel = js.native
  def get(id: Model): TModel = js.native
  def groupBy(iterator: String): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: String, context: js.Any): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: ListIterator[TModel, _]): Dictionary[js.Array[TModel]] = js.native
  def groupBy(iterator: ListIterator[TModel, _], context: js.Any): Dictionary[js.Array[TModel]] = js.native
  def has(key: String): Boolean = js.native
  def has(key: Double): Boolean = js.native
  def has(key: Model): Boolean = js.native
  def head(): TModel = js.native
  def head(n: Double): js.Array[TModel] = js.native
  def include(value: TModel): Boolean = js.native
  def includes(value: TModel): Boolean = js.native
  def indexBy(iterator: String): Dictionary[TModel] = js.native
  def indexBy(iterator: String, context: js.Any): Dictionary[TModel] = js.native
  def indexBy(iterator: ListIterator[TModel, _]): Dictionary[TModel] = js.native
  def indexBy(iterator: ListIterator[TModel, _], context: js.Any): Dictionary[TModel] = js.native
  def indexOf(value: TModel): Double = js.native
  def indexOf(value: TModel, isSorted: Boolean): Double = js.native
  def initial(): TModel = js.native
  def initial(n: Double): js.Array[TModel] = js.native
  def initialize(): Unit = js.native
  def initialize(models: js.Array[js.Object | TModel]): Unit = js.native
  def initialize(models: js.Array[js.Object | TModel], options: js.Any): Unit = js.native
  def inject[TResult](iterator: MemoIterator[TModel, TResult]): TResult = js.native
  def inject[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def inject[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult, context: js.Any): TResult = js.native
  def invoke(methodName: String, args: js.Any*): js.Any = js.native
  def isEmpty(): Boolean = js.native
  def last(): TModel = js.native
  def last(n: Double): js.Array[TModel] = js.native
  def lastIndexOf(value: TModel): Double = js.native
  def lastIndexOf(value: TModel, from: Double): Double = js.native
  def map[TResult](iterator: ListIterator[TModel, TResult]): js.Array[TResult] = js.native
  def map[TResult](iterator: ListIterator[TModel, TResult], context: js.Any): js.Array[TResult] = js.native
  def max(): TModel = js.native
  def max(iterator: ListIterator[TModel, _]): TModel = js.native
  def max(iterator: ListIterator[TModel, _], context: js.Any): TModel = js.native
  def min(): TModel = js.native
  def min(iterator: ListIterator[TModel, _]): TModel = js.native
  def min(iterator: ListIterator[TModel, _], context: js.Any): TModel = js.native
  def modelId(attrs: js.Any): js.Any = js.native
  def partition(iterator: ListIterator[TModel, Boolean]): js.Array[js.Array[TModel]] = js.native
  def pluck(attribute: String): js.Array[_] = js.native
  def pop(): TModel = js.native
  def pop(options: Silenceable): TModel = js.native
  /**
    * For use with collections as ES classes. If you define a preinitialize
    * method, it will be invoked when the Collection is first created and
    * before any instantiation logic is run for the Collection.
    * @see https://backbonejs.org/#Collection-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(models: js.Array[js.Object | TModel]): Unit = js.native
  def preinitialize(models: js.Array[js.Object | TModel], options: js.Any): Unit = js.native
  def push(model: TModel): TModel = js.native
  def push(model: TModel, options: AddOptions): TModel = js.native
  def reduce[TResult](iterator: MemoIterator[TModel, TResult]): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult, context: js.Any): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[TModel, TResult]): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[TModel, TResult], memo: TResult, context: js.Any): TResult = js.native
  def reject(iterator: ListIterator[TModel, Boolean]): js.Array[TModel] = js.native
  def reject(iterator: ListIterator[TModel, Boolean], context: js.Any): js.Array[TModel] = js.native
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
  def rest(n: Double): js.Array[TModel] = js.native
  def sample(): TModel = js.native
  def sample(n: Double): js.Array[TModel] = js.native
  def select(iterator: ListIterator[TModel, Boolean]): js.Array[TModel] = js.native
  def select(iterator: ListIterator[TModel, Boolean], context: js.Any): js.Array[TModel] = js.native
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
  def set(models: js.Array[TModel]): js.Array[TModel] = js.native
  def set(models: js.Array[TModel], options: CollectionSetOptions): js.Array[TModel] = js.native
  def shift(): TModel = js.native
  def shift(options: Silenceable): TModel = js.native
  def shuffle(): js.Array[TModel] = js.native
  def size(): Double = js.native
  /**
    * Return a shallow copy of this collection's models, using the same options as native Array#slice.
    */
  def slice(): js.Array[TModel] = js.native
  def slice(min: Double): js.Array[TModel] = js.native
  def slice(min: Double, max: Double): js.Array[TModel] = js.native
  def some(): Boolean = js.native
  def some(iterator: ListIterator[TModel, Boolean]): Boolean = js.native
  def some(iterator: ListIterator[TModel, Boolean], context: js.Any): Boolean = js.native
  def sort(): Collection[TModel] = js.native
  def sort(options: Silenceable): Collection[TModel] = js.native
  def sortBy(iterator: String): js.Array[TModel] = js.native
  def sortBy(iterator: String, context: js.Any): js.Array[TModel] = js.native
  def sortBy[TSort](): js.Array[TModel] = js.native
  def sortBy[TSort](iterator: ListIterator[TModel, TSort]): js.Array[TModel] = js.native
  def sortBy[TSort](iterator: ListIterator[TModel, TSort], context: js.Any): js.Array[TModel] = js.native
  def tail(): js.Array[TModel] = js.native
  def tail(n: Double): js.Array[TModel] = js.native
  def take(): TModel = js.native
  def take(n: Double): js.Array[TModel] = js.native
  def toArray(): js.Array[TModel] = js.native
  def unshift(model: TModel): TModel = js.native
  def unshift(model: TModel, options: AddOptions): TModel = js.native
  def where(properties: js.Any): js.Array[TModel] = js.native
  def without(values: TModel*): js.Array[TModel] = js.native
}

/* static members */
@JSImport("backbone", "Collection")
@js.native
object Collection extends js.Object {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

