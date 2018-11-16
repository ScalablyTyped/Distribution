package typings
package bintreesLib.bintreesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeBase[T] extends js.Object {
  var size: scala.Double
  def clear(): scala.Unit
  def each(cb: Callback[T]): scala.Unit
  def find(data: T): T
  def findIter(data: T): Iterator[T]
  def iterator(): Iterator[T]
  def lowerBound(item: T): Iterator[T]
  def max(): T
  def min(): T
  def reach(cb: Callback[T]): scala.Unit
  def upperBound(item: T): Iterator[T]
}

