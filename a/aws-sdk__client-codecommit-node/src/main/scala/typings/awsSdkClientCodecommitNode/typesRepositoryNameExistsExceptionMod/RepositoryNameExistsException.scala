package typings.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNameExistsException
  extends ServiceException[RepositoryNameExistsExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryNameExceptionsUnion {
  @JSName("name")
  var name_RepositoryNameExistsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException
}

object RepositoryNameExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryNameExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException,
    stack: String = null
  ): RepositoryNameExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNameExistsException]
  }
}

