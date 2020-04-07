package typings.awsSdkClientS3Node.typesObjectAlreadyInActiveTierErrorMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAlreadyInActiveTierError extends ServiceException[ObjectAlreadyInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectAlreadyInActiveTierError: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError
}

object ObjectAlreadyInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError,
    stack: String = null
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
}

