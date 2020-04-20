package typings.cassandraDriver.mod.token

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRange extends js.Object {
  var end: Token
  var start: Token
  def compare(other: TokenRange): Double
  def contains(token: Token): Boolean
  def equals(other: TokenRange): Boolean
  def isEmpty(): Boolean
  def isWrappedAround(): Boolean
  def splitEvenly(numberOfSplits: Double): js.Array[TokenRange]
  def unwrap(): js.Array[TokenRange]
}

object TokenRange {
  @scala.inline
  def apply(
    compare: TokenRange => Double,
    contains: Token => Boolean,
    end: Token,
    equals: TokenRange => Boolean,
    isEmpty: () => Boolean,
    isWrappedAround: () => Boolean,
    splitEvenly: Double => js.Array[TokenRange],
    start: Token,
    unwrap: () => js.Array[TokenRange]
  ): TokenRange = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), contains = js.Any.fromFunction1(contains), end = end.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), isEmpty = js.Any.fromFunction0(isEmpty), isWrappedAround = js.Any.fromFunction0(isWrappedAround), splitEvenly = js.Any.fromFunction1(splitEvenly), start = start.asInstanceOf[js.Any], unwrap = js.Any.fromFunction0(unwrap))
    __obj.asInstanceOf[TokenRange]
  }
}

