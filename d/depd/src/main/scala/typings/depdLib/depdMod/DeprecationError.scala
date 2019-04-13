package typings
package depdLib.depdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationError
  extends stdLib.Error {
  @JSName("name")
  val name_DeprecationError: depdLib.depdLibStrings.DeprecationError
  var namespace: java.lang.String
  @JSName("stack")
  var stack_DeprecationError: java.lang.String
}

object DeprecationError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: depdLib.depdLibStrings.DeprecationError,
    namespace: java.lang.String,
    stack: java.lang.String
  ): DeprecationError = {
    val __obj = js.Dynamic.literal(message = message, name = name, namespace = namespace, stack = stack)
  
    __obj.asInstanceOf[DeprecationError]
  }
}

