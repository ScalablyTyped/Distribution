package typings.awsSdkClientSqsNode.typesInvalidIdFormatMod

import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidIdFormat
  extends ServiceException[InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat = js.native
}

object InvalidIdFormat {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidIdFormatDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat
  ): InvalidIdFormat = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdFormat]
  }
  @scala.inline
  implicit class InvalidIdFormatOps[Self <: InvalidIdFormat] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

