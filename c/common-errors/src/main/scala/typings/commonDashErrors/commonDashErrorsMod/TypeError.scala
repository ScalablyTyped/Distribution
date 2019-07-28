package typings.commonDashErrors.commonDashErrorsMod

import typings.std.TypeErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "TypeError")
@js.native
class TypeError protected () extends TypeErrorConstructor {
  /**
    * @param message     any message
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(message: String) = this()
  def this(message: String, inner_error: Error) = this()
}

