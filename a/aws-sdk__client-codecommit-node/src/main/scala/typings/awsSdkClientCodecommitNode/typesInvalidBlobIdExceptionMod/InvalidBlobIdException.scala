package typings.awsSdkClientCodecommitNode.typesInvalidBlobIdExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidBlobIdException
  extends ServiceException[InvalidBlobIdExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_InvalidBlobIdException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException
}

object InvalidBlobIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidBlobIdExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidBlobIdException,
    stack: String = null
  ): InvalidBlobIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBlobIdException]
  }
}

