package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "NotFoundError")
@js.native
class NotFoundError protected () extends ErrorConstructor {
  /**
    * @param entity_name a description for what was not found
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(entity_name: java.lang.String) = this()
  def this(entity_name: java.lang.String, inner_error: Error) = this()
}

