package typings.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod

import typings.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeStorageExceededException
  extends ServiceException[CodeStorageExceededExceptionDetails]
     with CreateFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion {
  @JSName("name")
  var name_CodeStorageExceededException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
}

object CodeStorageExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CodeStorageExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException,
    stack: String = null
  ): CodeStorageExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeStorageExceededException]
  }
}

