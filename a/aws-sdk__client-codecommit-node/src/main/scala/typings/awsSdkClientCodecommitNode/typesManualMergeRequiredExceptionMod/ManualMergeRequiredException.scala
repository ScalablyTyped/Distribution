package typings.awsSdkClientCodecommitNode.typesManualMergeRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualMergeRequiredException
  extends ServiceException[ManualMergeRequiredExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_ManualMergeRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException
}

object ManualMergeRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ManualMergeRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException,
    stack: String = null
  ): ManualMergeRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualMergeRequiredException]
  }
}

