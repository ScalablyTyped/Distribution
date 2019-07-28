package typings.commonDashErrors.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "TimeoutError")
@js.native
class TimeoutError protected () extends ErrorConstructor {
  /**
    * @param time        a time duration
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(time: String) = this()
  def this(time: String, inner_error: Error) = this()
}

