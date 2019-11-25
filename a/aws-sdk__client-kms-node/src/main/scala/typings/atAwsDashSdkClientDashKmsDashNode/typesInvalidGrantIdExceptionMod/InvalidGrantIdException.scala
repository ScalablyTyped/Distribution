package typings.atAwsDashSdkClientDashKmsDashNode.typesInvalidGrantIdExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidGrantIdException
  extends ServiceException[_InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidGrantIdException
}

object InvalidGrantIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidGrantIdExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidGrantIdException,
    stack: String = null
  ): InvalidGrantIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidGrantIdException]
  }
}

