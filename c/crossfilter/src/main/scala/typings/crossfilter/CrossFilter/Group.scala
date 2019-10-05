package typings.crossfilter.CrossFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group[T, TKey, TValue] extends js.Object {
  def all(): js.Array[Grouping[TKey, TValue]] = js.native
  def dispose(): Group[T, TKey, TValue] = js.native
  def order(): Group[T, TKey, TValue] = js.native
  def order(value: Selector[TValue]): Group[T, TKey, TValue] = js.native
  def orderNatural(): Group[T, TKey, TValue] = js.native
  def reduce[TGroup](
    add: js.Function2[/* p */ TGroup, /* v */ T, TGroup],
    remove: js.Function2[/* p */ TGroup, /* v */ T, TGroup],
    initial: js.Function0[TGroup]
  ): Group[T, TKey, TGroup] = js.native
  def reduceCount(): Group[T, TKey, Double] = js.native
  def reduceSum[TGroup](value: js.Function1[/* data */ T, TGroup]): Group[T, TKey, TGroup] = js.native
  def size(): Double = js.native
  def top(k: Double): js.Array[Grouping[TKey, TValue]] = js.native
}

