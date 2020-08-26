package typings.awsSdkClientS3Node.typesObjectAlreadyInActiveTierErrorMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAlreadyInActiveTierError extends ServiceException[ObjectAlreadyInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectAlreadyInActiveTierError: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError = js.native
}

object ObjectAlreadyInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
  @scala.inline
  implicit class ObjectAlreadyInActiveTierErrorOps[Self <: ObjectAlreadyInActiveTierError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

