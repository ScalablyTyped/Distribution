package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerNameRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerNameRequiredException
  extends ServiceException[RepositoryTriggerNameRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_RepositoryTriggerNameRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException
}

object RepositoryTriggerNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryTriggerNameRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerNameRequiredException,
    stack: String = null
  ): RepositoryTriggerNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerNameRequiredException]
  }
}

