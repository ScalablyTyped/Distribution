package typings.atAwsDashSdkTypes.buildExceptionMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MetadataBearer * / any */ trait ServiceException[Details] extends Error {
  var details: Details
}

object ServiceException {
  @scala.inline
  def apply[Details](details: Details, message: String, name: String, stack: String = null): ServiceException[Details] = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ServiceException[Details]]
  }
}

