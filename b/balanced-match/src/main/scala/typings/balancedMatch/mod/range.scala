package typings.balancedMatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("balanced-match", "range")
@js.native
object range extends js.Object {
  
  /**
    * For the first non-nested matching pair of `a` and `b` in `str`,
    * return an array with indexes: `[ <a index>, <b index> ]`.
    */
  def apply(a: String, b: String, str: String): Output | Unit = js.native
  def apply(a: String, b: RegExp, str: String): Output | Unit = js.native
  def apply(a: RegExp, b: String, str: String): Output | Unit = js.native
  def apply(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
}
