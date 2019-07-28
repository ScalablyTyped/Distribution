package typings.commonDashErrors.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "ValidationError")
@js.native
class ValidationError protected () extends ErrorConstructor {
  /**
    * @param message any message
    * @param code    an optional error code
    * @param field   an optional description of the data
    */
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, field: String) = this()
  /**
    * add an error object to the errors array
    */
  def addError(error: Error): this.type = js.native
  /**
    * append an array of error objects to the errors array
    */
  def addErrors(errors: js.Array[Error]): this.type = js.native
}

