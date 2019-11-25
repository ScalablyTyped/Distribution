package typings.atAwsDashSdkClientDashLambdaDashNode.typesInvalidZipFileExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidZipFileException
  extends ServiceException[_InvalidZipFileExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidZipFileException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidZipFileException
}

object InvalidZipFileException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidZipFileExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidZipFileException,
    stack: String = null
  ): InvalidZipFileException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidZipFileException]
  }
}

