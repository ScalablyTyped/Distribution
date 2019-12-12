package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidEmailExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidEmailException
  extends ServiceException[_InvalidEmailExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidEmailException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidEmailException = js.native
}

