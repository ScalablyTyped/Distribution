package typings.code

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Assertion[T] = typings.code.mod.Grammar[T] with typings.code.mod.Flags[T]
  type AssertionChain[T] = typings.code.mod.Assertion[T] with typings.code.mod.Expectation[T]
  type Expectation[T] = typings.code.mod.Types[T] with typings.code.mod.Values[T]
}
