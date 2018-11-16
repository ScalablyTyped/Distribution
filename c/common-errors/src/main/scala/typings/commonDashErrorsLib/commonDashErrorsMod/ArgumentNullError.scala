package typings
package commonDashErrorsLib.commonDashErrorsMod

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
  def this(argumentName: java.lang.String) = this()
  /**
       * @param argumentName the name of the argument that is null
       * @param inner_error  the Error instance that caused the current error.
       *                     Stack trace will be appended.
       */
  def this(argumentName: java.lang.String, inner_error: Error) = this()
}

