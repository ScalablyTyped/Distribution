package typings.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleRepositoriesInPullRequestException
  extends ServiceException[MultipleRepositoriesInPullRequestExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MultipleRepositoriesInPullRequestException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
}

object MultipleRepositoriesInPullRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MultipleRepositoriesInPullRequestExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException,
    stack: String = null
  ): MultipleRepositoriesInPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleRepositoriesInPullRequestException]
  }
}

