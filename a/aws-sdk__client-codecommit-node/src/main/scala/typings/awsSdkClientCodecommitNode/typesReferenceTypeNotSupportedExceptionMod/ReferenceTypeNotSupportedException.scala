package typings.awsSdkClientCodecommitNode.typesReferenceTypeNotSupportedExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceTypeNotSupportedException
  extends ServiceException[ReferenceTypeNotSupportedExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceTypeNotSupportedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
}

object ReferenceTypeNotSupportedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReferenceTypeNotSupportedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException,
    stack: String = null
  ): ReferenceTypeNotSupportedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceTypeNotSupportedException]
  }
}

