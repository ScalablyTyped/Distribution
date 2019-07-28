package typings.depd.depdMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationError extends Error {
  @JSName("name")
  val name_DeprecationError: typings.depd.depdStrings.DeprecationError
  var namespace: String
  @JSName("stack")
  var stack_DeprecationError: String
}

object DeprecationError {
  @scala.inline
  def apply(message: String, name: typings.depd.depdStrings.DeprecationError, namespace: String, stack: String): DeprecationError = {
    val __obj = js.Dynamic.literal(message = message, name = name, namespace = namespace, stack = stack)
  
    __obj.asInstanceOf[DeprecationError]
  }
}

