package typings.atAwsDashSdkClientDashSqsDashNode.typesMessageNotInflightMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageNotInflight
  extends ServiceException[_MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  @JSName("name")
  var name_MessageNotInflight: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.MessageNotInflight
}

object MessageNotInflight {
  @scala.inline
  def apply(
    details: _MessageNotInflightDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.MessageNotInflight,
    stack: String = null
  ): MessageNotInflight = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MessageNotInflight]
  }
}

