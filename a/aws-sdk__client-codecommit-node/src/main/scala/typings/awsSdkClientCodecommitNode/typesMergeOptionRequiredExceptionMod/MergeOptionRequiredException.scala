package typings.awsSdkClientCodecommitNode.typesMergeOptionRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeOptionRequiredException
  extends ServiceException[MergeOptionRequiredExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_MergeOptionRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException
}

object MergeOptionRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MergeOptionRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException,
    stack: String = null
  ): MergeOptionRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeOptionRequiredException]
  }
}

