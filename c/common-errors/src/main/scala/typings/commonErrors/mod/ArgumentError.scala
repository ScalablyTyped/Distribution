package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "ArgumentError")
@js.native
class ArgumentError protected () extends ErrorConstructor {
  /**
    * @param argumentName the name of the argument that has a problem
    * @param inner_error  the Error instance that caused the current error.
    *                     Stack trace will be appended.
    */
  def this(argumentName: String) = this()
  def this(argumentName: String, inner_error: Error) = this()
}

