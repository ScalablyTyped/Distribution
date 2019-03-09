package typings
package collectionsjsLib.collectionsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def add(item: T): Collection[T] = js.native
  def all(): Collection[T] = js.native
  def average(): scala.Double = js.native
  def average(property: java.lang.String): scala.Double = js.native
  def average(property: js.Function1[/* property */ js.UndefOr[scala.Double], scala.Double]): scala.Double = js.native
  def chunk(size: scala.Double): Collection[T] = js.native
  def collect(collectable: js.Array[T]): Collection[T] = js.native
  def concat(collection: Collection[T]): Collection[T] = js.native
  def concat(collection: js.Array[T]): Collection[T] = js.native
  def contains(closure: js.Function1[/* item */ T, scala.Boolean]): scala.Boolean = js.native
  def count(): scala.Double = js.native
  def each(callback: js.Function1[/* item */ T, scala.Unit]): Collection[T] = js.native
  def filter(callback: js.Function1[/* item */ T, scala.Boolean]): Collection[T] = js.native
  def find(item: T): scala.Double = js.native
  def first(): T = js.native
  def first(callback: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def flatten(): Collection[T] = js.native
  def flatten(deep: scala.Boolean): Collection[T] = js.native
  def get(index: scala.Double): T = js.native
  def has(item: T): scala.Boolean = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def keys(): Collection[T] = js.native
  def last(): T = js.native
  def last(callback: js.Function1[/* item */ T, scala.Boolean]): T = js.native
  def map[R](callback: js.Function1[/* item */ T, R]): Collection[R] = js.native
  def pluck(property: java.lang.String): Collection[T] = js.native
  def push(item: T): Collection[T] = js.native
  def reduce[R](callback: js.Function2[/* previous */ R, /* current */ T, R], initial: R): R = js.native
  def reject(callback: js.Function1[/* item */ T, scala.Boolean]): Collection[T] = js.native
  def remove(item: T): scala.Boolean = js.native
  def reverse(): Collection[T] = js.native
  def skip(count: scala.Double): Collection[T] = js.native
  def slice(start: scala.Double): Collection[T] = js.native
  def slice(start: scala.Double, end: scala.Double): Collection[T] = js.native
  def sort(): Collection[T] = js.native
  def sort(compare: js.Function0[scala.Boolean]): Collection[T] = js.native
  def sortBy(property: java.lang.String): Collection[T] = js.native
  def sortBy(property: java.lang.String, order: java.lang.String): Collection[T] = js.native
  def stringify(): java.lang.String = js.native
  def sum(property: java.lang.String): scala.Double = js.native
  def take(count: scala.Double): Collection[T] = js.native
  def unique(): Collection[T] = js.native
  def unique(callback: java.lang.String): Collection[T] = js.native
  def unique(callback: js.Function1[/* item */ T, _]): Collection[T] = js.native
  def values(): Collection[T] = js.native
  def where(callback: js.Function1[/* item */ T, scala.Boolean]): Collection[T] = js.native
  def where[K /* <: java.lang.String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): Collection[T] = js.native
  def zip(array: Collection[T]): Collection[T] = js.native
  def zip(array: js.Array[T]): Collection[T] = js.native
}

