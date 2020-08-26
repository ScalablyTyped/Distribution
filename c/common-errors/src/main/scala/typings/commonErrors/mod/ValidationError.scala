package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "ValidationError")
@js.native
class ValidationError protected () extends js.Object {
  /**
    * @param message any message
    * @param code    an optional error code
    * @param field   an optional description of the data
    */
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], field: String) = this()
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

