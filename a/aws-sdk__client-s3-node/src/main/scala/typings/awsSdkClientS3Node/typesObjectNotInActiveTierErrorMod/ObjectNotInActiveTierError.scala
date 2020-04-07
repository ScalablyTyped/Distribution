package typings.awsSdkClientS3Node.typesObjectNotInActiveTierErrorMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectNotInActiveTierError extends ServiceException[ObjectNotInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectNotInActiveTierError: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectNotInActiveTierError
}

object ObjectNotInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ObjectNotInActiveTierErrorDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectNotInActiveTierError,
    stack: String = null
  ): ObjectNotInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNotInActiveTierError]
  }
}

