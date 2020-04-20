package typings.collectionsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("collectionsjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Collection[T] extends js.Object {
    def add(item: T): Collection[T] = js.native
    def all(): Collection[T] = js.native
    def average(): Double = js.native
    def average(property: String): Double = js.native
    def average(property: js.Function1[/* property */ js.UndefOr[Double], Double]): Double = js.native
    def chunk(size: Double): Collection[T] = js.native
    def collect(collectable: js.Array[T]): Collection[T] = js.native
    def concat(collection: js.Array[T]): Collection[T] = js.native
    def concat(collection: Collection[T]): Collection[T] = js.native
    def contains(closure: js.Function1[/* item */ T, Boolean]): Boolean = js.native
    def count(): Double = js.native
    def each(callback: js.Function1[/* item */ T, Unit]): Collection[T] = js.native
    def filter(callback: js.Function1[/* item */ T, Boolean]): Collection[T] = js.native
    def find(item: T): Double = js.native
    def first(): T = js.native
    def first(callback: js.Function1[/* item */ T, Boolean]): T = js.native
    def flatten(): Collection[T] = js.native
    def flatten(deep: Boolean): Collection[T] = js.native
    def get(index: Double): T = js.native
    def has(item: T): Boolean = js.native
    def join(): String = js.native
    def join(separator: String): String = js.native
    def keys(): Collection[T] = js.native
    def last(): T = js.native
    def last(callback: js.Function1[/* item */ T, Boolean]): T = js.native
    def map[R](callback: js.Function1[/* item */ T, R]): Collection[R] = js.native
    def pluck(property: String): Collection[T] = js.native
    def push(item: T): Collection[T] = js.native
    def reduce[R](callback: js.Function2[/* previous */ R, /* current */ T, R], initial: R): R = js.native
    def reject(callback: js.Function1[/* item */ T, Boolean]): Collection[T] = js.native
    def remove(item: T): Boolean = js.native
    def reverse(): Collection[T] = js.native
    def skip(count: Double): Collection[T] = js.native
    def slice(start: Double): Collection[T] = js.native
    def slice(start: Double, end: Double): Collection[T] = js.native
    def sort(): Collection[T] = js.native
    def sort(compare: js.Function0[Boolean]): Collection[T] = js.native
    def sortBy(property: String): Collection[T] = js.native
    def sortBy(property: String, order: String): Collection[T] = js.native
    def stringify(): String = js.native
    def sum(property: /* keyof T */ String): Double = js.native
    def take(count: Double): Collection[T] = js.native
    def unique(): Collection[T] = js.native
    def unique(callback: String): Collection[T] = js.native
    def unique(callback: js.Function1[/* item */ T, _]): Collection[T] = js.native
    def values(): Collection[T] = js.native
    def where(callback: js.Function1[/* item */ T, Boolean]): Collection[T] = js.native
    def where[K /* <: /* keyof T */ String */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): Collection[T] = js.native
    def zip(array: js.Array[T]): Collection[T] = js.native
    def zip(array: Collection[T]): Collection[T] = js.native
  }
  
  @js.native
  class default[T] () extends Collection[T] {
    def this(items: js.Array[T]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def `macro`(name: String, callback: js.Function2[/* coll */ Collection[_], /* repeated */ js.Any, _]): Unit = js.native
  }
  
}

