package typings.atAwsDashSdkClientDashKmsDashNode.typesAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlreadyExistsException
  extends ServiceException[_AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.AlreadyExistsException
}

object AlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _AlreadyExistsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.AlreadyExistsException,
    stack: String = null
  ): AlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyExistsException]
  }
}

