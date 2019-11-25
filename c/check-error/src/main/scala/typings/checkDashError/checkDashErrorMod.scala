package typings.checkDashError

import typings.checkDashError.checkDashErrorMod.ErrorInstanceOrConstructor
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("check-error", JSImport.Namespace)
@js.native
object checkDashErrorMod extends js.Object {
  def compatibleConstructor(thrown: Error, errorLike: ErrorInstanceOrConstructor): Boolean = js.native
  def compatibleInstance(thrown: Error, errorLike: Error): Boolean = js.native
  def compatibleMessage(thrown: String, errMatcher: String): Boolean = js.native
  def compatibleMessage(thrown: String, errMatcher: RegExp): Boolean = js.native
  def compatibleMessage(thrown: Error, errMatcher: String): Boolean = js.native
  def compatibleMessage(thrown: Error, errMatcher: RegExp): Boolean = js.native
  def getConstructorName(errorLike: ErrorInstanceOrConstructor): String = js.native
  def getMessage(err: String): String = js.native
  def getMessage(err: Error): String = js.native
  type ErrorInstanceOrConstructor = Error | Anon_Args | (js.Function1[/* repeated */ js.Any, Error])
}

