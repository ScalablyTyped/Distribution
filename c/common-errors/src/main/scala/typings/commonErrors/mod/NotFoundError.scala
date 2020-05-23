package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "NotFoundError")
@js.native
class NotFoundError protected () extends js.Object {
  /**
    * @param entity_name a description for what was not found
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(entity_name: String) = this()
  def this(entity_name: String, inner_error: Error) = this()
}

