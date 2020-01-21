package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "ArgumentNullError")
@js.native
class ArgumentNullError protected () extends ArgumentError {
  /**
    * @param argumentName the name of the argument that is null
    * @param inner_error  the Error instance that caused the current error.
    *                     Stack trace will be appended.
    */
  def this(argumentName: String) = this()
  def this(argumentName: String, inner_error: Error) = this()
}

