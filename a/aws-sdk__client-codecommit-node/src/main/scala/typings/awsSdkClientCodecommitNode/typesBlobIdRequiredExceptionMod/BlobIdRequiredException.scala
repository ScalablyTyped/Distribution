package typings.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobIdRequiredException
  extends ServiceException[BlobIdRequiredExceptionDetails]
     with GetBlobExceptionsUnion {
  @JSName("name")
  var name_BlobIdRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException
}

object BlobIdRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BlobIdRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException,
    stack: String = null
  ): BlobIdRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobIdRequiredException]
  }
}

