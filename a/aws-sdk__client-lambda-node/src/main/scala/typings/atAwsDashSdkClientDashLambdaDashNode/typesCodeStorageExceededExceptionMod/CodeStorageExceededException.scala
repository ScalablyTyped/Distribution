package typings.atAwsDashSdkClientDashLambdaDashNode.typesCodeStorageExceededExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPublishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeStorageExceededException
  extends ServiceException[_CodeStorageExceededExceptionDetails]
     with CreateFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion {
  @JSName("name")
  var name_CodeStorageExceededException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.CodeStorageExceededException
}

object CodeStorageExceededException {
  @scala.inline
  def apply(
    details: _CodeStorageExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.CodeStorageExceededException,
    stack: String = null
  ): CodeStorageExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CodeStorageExceededException]
  }
}

