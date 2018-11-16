package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupAll[T, TValue] extends js.Object {
  def dispose(): GroupAll[T, TValue]
  def reduce[TValue](
    add: js.Function2[/* p */ TValue, /* v */ T, TValue],
    remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
    initial: js.Function0[TValue]
  ): GroupAll[T, TValue]
  def reduceCount(): GroupAll[T, TValue]
  def reduceSum(value: Selector[T]): GroupAll[T, TValue]
  def value(): TValue
}

