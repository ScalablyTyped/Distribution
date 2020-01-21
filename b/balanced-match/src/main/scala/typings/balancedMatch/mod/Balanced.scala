package typings.balancedMatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Balanced extends js.Object {
  def balanced(a: String, b: String, str: String): Output | Unit = js.native
  def balanced(a: String, b: RegExp, str: String): Output | Unit = js.native
  def balanced(a: RegExp, b: String, str: String): Output | Unit = js.native
  def balanced(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
  def range(a: String, b: String, str: String): Output | Unit = js.native
  def range(a: String, b: RegExp, str: String): Output | Unit = js.native
  def range(a: RegExp, b: String, str: String): Output | Unit = js.native
  def range(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
}

