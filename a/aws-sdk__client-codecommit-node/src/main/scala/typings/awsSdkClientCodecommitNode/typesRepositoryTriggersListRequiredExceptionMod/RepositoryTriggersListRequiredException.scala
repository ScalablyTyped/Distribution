package typings.awsSdkClientCodecommitNode.typesRepositoryTriggersListRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggersListRequiredException
  extends ServiceException[RepositoryTriggersListRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_RepositoryTriggersListRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggersListRequiredException
}

object RepositoryTriggersListRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryTriggersListRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggersListRequiredException,
    stack: String = null
  ): RepositoryTriggersListRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggersListRequiredException]
  }
}

