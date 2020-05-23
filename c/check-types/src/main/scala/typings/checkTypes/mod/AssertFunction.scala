package typings.checkTypes.mod

import typings.checkTypes.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertFunction extends CheckType {
  def apply[T](possibleFalsy: T): T = js.native
  def apply[T](possibleFalsy: T, message: String): T = js.native
  def apply[T](possibleFalsy: T, message: String, errorType: Instantiable): T = js.native
}

