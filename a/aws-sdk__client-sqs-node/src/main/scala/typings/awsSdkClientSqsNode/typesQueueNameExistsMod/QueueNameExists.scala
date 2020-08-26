package typings.awsSdkClientSqsNode.typesQueueNameExistsMod

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueNameExists
  extends ServiceException[QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists = js.native
}

object QueueNameExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: QueueNameExistsDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists
  ): QueueNameExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNameExists]
  }
  @scala.inline
  implicit class QueueNameExistsOps[Self <: QueueNameExists] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

