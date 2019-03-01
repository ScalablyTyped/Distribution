package typings
package codeLib.codeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grammar[T] extends js.Object {
  /** Connecting word. */
  var a: AssertionChain[T]
  /** Connecting word. */
  var an: AssertionChain[T]
  /** Connecting word. */
  var and: AssertionChain[T]
  /** Connecting word. */
  var at: AssertionChain[T]
  /** Connecting word. */
  var be: AssertionChain[T]
  /** Connecting word. */
  var have: AssertionChain[T]
  /** Connecting word. */
  var in: AssertionChain[T]
  /** Connecting word. */
  var to: AssertionChain[T]
}

object Grammar {
  @scala.inline
  def apply[T](
    a: AssertionChain[T],
    an: AssertionChain[T],
    and: AssertionChain[T],
    at: AssertionChain[T],
    be: AssertionChain[T],
    have: AssertionChain[T],
    in: AssertionChain[T],
    to: AssertionChain[T]
  ): Grammar[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("an")(an)
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("be")(be)
    __obj.updateDynamic("have")(have)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Grammar[T]]
  }
}

