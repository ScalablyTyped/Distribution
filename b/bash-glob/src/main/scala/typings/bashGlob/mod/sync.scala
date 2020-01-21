package typings.bashGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bash-glob", "sync")
@js.native
object sync extends js.Object {
  def apply(patterns: Patterns): js.Array[String] = js.native
  def apply(patterns: Patterns, options: Options): js.Array[String] = js.native
}

