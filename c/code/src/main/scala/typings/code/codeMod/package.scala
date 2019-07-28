package typings.code

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codeMod {
  type Assertion[T] = Grammar[T] with Flags[T]
  type AssertionChain[T] = Assertion[T] with Expectation[T]
  type Expectation[T] = Types[T] with Values[T]
}
