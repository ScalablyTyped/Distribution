package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "TimeoutError")
@js.native
class TimeoutError protected () extends js.Object {
  /**
    * @param time        a time duration
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(time: String) = this()
  def this(time: String, inner_error: Error) = this()
}

