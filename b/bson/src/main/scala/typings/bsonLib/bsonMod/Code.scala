package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Code")
@js.native
class Code protected () extends js.Object {
  /**
    * @param code A string or function.
    * @param scope An optional scope for the function.
    */
  def this(code: java.lang.String) = this()
  def this(code: js.Function) = this()
  def this(code: java.lang.String, scope: js.Any) = this()
  def this(code: js.Function, scope: js.Any) = this()
  val code: java.lang.String | js.Function = js.native
  val scope: js.UndefOr[js.Any] = js.native
}

