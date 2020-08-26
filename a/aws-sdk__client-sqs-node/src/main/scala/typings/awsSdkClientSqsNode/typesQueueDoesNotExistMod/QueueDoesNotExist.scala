package typings.awsSdkClientSqsNode.typesQueueDoesNotExistMod

import typings.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueDoesNotExist
  extends ServiceException[QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist = js.native
}

object QueueDoesNotExist {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueDoesNotExistDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist
  ): QueueDoesNotExist = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDoesNotExist]
  }
  @scala.inline
  implicit class QueueDoesNotExistOps[Self <: QueueDoesNotExist] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

