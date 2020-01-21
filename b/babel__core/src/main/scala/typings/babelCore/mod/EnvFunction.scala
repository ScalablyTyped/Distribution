package typings.babelCore.mod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvFunction extends js.Object {
  /**
    * @returns the current `envName` string
    */
  def apply(): String = js.native
  /**
    * @returns `true` if the `envName` is `===` any of the given strings
    */
  def apply(envName: String): Boolean = js.native
  def apply(envName: js.Array[String]): Boolean = js.native
  // the official documentation is misleading for this one...
  // this just passes the callback to `cache.using` but with an additional argument.
  // it returns its result instead of necessarily returning a boolean.
  def apply[T /* <: SimpleCacheKey */](envCallback: js.Function1[/* envName */ NonNullable[js.UndefOr[String]], T]): T = js.native
}

