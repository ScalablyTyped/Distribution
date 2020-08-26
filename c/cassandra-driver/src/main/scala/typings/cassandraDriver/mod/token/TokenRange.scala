package typings.cassandraDriver.mod.token

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenRange extends js.Object {
  var end: Token = js.native
  var start: Token = js.native
  def compare(other: TokenRange): Double = js.native
  def contains(token: Token): Boolean = js.native
  def equals(other: TokenRange): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isWrappedAround(): Boolean = js.native
  def splitEvenly(numberOfSplits: Double): js.Array[TokenRange] = js.native
  def unwrap(): js.Array[TokenRange] = js.native
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
  @scala.inline
  implicit class TokenRangeOps[Self <: TokenRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompare(value: TokenRange => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: Token => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: Token): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEquals(value: TokenRange => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWrappedAround(value: () => Boolean): Self = this.set("isWrappedAround", js.Any.fromFunction0(value))
    @scala.inline
    def setSplitEvenly(value: Double => js.Array[TokenRange]): Self = this.set("splitEvenly", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: Token): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnwrap(value: () => js.Array[TokenRange]): Self = this.set("unwrap", js.Any.fromFunction0(value))
  }
  
}

