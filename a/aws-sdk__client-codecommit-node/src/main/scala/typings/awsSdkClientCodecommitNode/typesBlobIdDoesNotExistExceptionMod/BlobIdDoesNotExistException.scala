package typings.awsSdkClientCodecommitNode.typesBlobIdDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobIdDoesNotExistException
  extends ServiceException[BlobIdDoesNotExistExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdDoesNotExistException
}

object BlobIdDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BlobIdDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdDoesNotExistException,
    stack: String = null
  ): BlobIdDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobIdDoesNotExistException]
  }
}

