package typings.atAwsDashSdkClientDashSqsDashNode.typesMessageNotInflightMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageNotInflight
  extends ServiceException[_MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  @JSName("name")
  var name_MessageNotInflight: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.MessageNotInflight = js.native
}

