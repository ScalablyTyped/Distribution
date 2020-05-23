package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "Error")
@js.native
class Error protected () extends js.Object {
  /**
    * @param message     any message
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(entityName: String) = this()
  def this(entityName: String, inner_error: Error) = this()
}

