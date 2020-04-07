package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryDescriptionExceptionMod

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryDescriptionException
  extends ServiceException[InvalidRepositoryDescriptionExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryDescriptionException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException
}

object InvalidRepositoryDescriptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryDescriptionExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException,
    stack: String = null
  ): InvalidRepositoryDescriptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryDescriptionException]
  }
}

