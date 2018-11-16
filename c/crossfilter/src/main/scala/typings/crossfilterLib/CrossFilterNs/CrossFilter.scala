package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CrossFilter[T] extends js.Object {
  def GroupAll(): GroupAll[T, T]
  def add(records: js.Array[T]): CrossFilter[T]
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension]
  def groupAll[TValue](): GroupAll[T, TValue]
  def remove(): CrossFilter[T]
  def size(): scala.Double
}

