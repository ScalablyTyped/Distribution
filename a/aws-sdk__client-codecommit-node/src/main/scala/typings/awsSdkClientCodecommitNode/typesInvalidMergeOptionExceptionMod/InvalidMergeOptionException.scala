package typings.awsSdkClientCodecommitNode.typesInvalidMergeOptionExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMergeOptionException
  extends ServiceException[InvalidMergeOptionExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidMergeOptionException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException
}

object InvalidMergeOptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidMergeOptionExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException,
    stack: String = null
  ): InvalidMergeOptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMergeOptionException]
  }
}

