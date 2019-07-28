package typings.commonDashErrors.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "NotSupportedError")
@js.native
class NotSupportedError protected () extends ErrorConstructor {
  /**
    * @param message     any message
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(message: String) = this()
  def this(message: String, inner_error: Error) = this()
}

